package com.bt.spqr.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.bt.spqr.adapters.SupplierAdapter;
import com.bt.spqr.model.AvailServices;
import com.bt.spqr.model.NBIResponse;
import com.bt.spqr.model.Notification;
import com.bt.spqr.model.Supplier;

@Component
public class AvailabilityServiceImpl implements AvailabilityService {

	@Autowired
	SupplierService supplierService;
	
	@Autowired
	ApplicationContext applicationContext;
	
	@Cacheable(value = "products", key="#eirCode")
	@Override
	public Notification getAvailabilityStatus(String eirCode, String accountNumber, String phoneNumber) {
		System.out.println("Getting Products by Area code "  + eirCode);
		Notification notification = new Notification();		
		List<Supplier> supplierList = supplierService.getAllSuppliers();
		
		for(Supplier supplier:supplierList) {
			AvailServices availableServices = getSupplierProductsAvailability(supplier, eirCode,accountNumber, phoneNumber);
			if(availableServices.getAVAIL_SERVICE().size()>0)
				notification.getNOTIFICATION_DATA().getAVAILABILITY().getAVAIL_SERVICES().getAVAIL_SERVICE().addAll(availableServices.getAVAIL_SERVICE());			
		}		
		return notification;
	}
	
	private AvailServices getSupplierProductsAvailability(Supplier supplier, String eirCode, String accountNumber, String phoneNumber) {
		AvailServices avail_services = new AvailServices();
		try {
			SupplierAdapter supplierAdpter = (SupplierAdapter) Class.forName(supplier.getAdapterClass()).newInstance();
			avail_services = supplierAdpter.getAvailableProductsByERCode(eirCode, accountNumber, phoneNumber);			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			//TODO
		}
		return avail_services;
	}
	
	@Cacheable(value = "nbiproducts", key="#eirCode")
	@Override
	public NBIResponse getNBIAvailabilityStatus(String eirCode) {
		NBIResponse nbiResponse = new NBIResponse();
		System.out.println("Getting Products by Area code "  + eirCode);
		Notification notification = new Notification();		
		Supplier supplier = supplierService.getSupplierBySupplierCode("NBI");
		SupplierAdapter supplierAdpter;
		try {
			supplierAdpter = (SupplierAdapter) Class.forName(supplier.getAdapterClass()).newInstance();
			applicationContext.getAutowireCapableBeanFactory().autowireBean(supplierAdpter);
			nbiResponse = supplierAdpter.getNBIAvailableProductsByERCode(eirCode);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		finally {
			
		}					
		return nbiResponse;
	}
}
