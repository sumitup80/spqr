package com.bt.spqr.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.bt.spqr.adapters.SupplierAdapter;
import com.bt.spqr.model.Product;
import com.bt.spqr.model.ProductList;
import com.bt.spqr.model.Supplier;

@Component
public class AvailabilityServiceImpl implements AvailabilityService {

	@Autowired
	SupplierService supplierService;
	
	@Cacheable(value = "products", key="#eirCode")
	@Override
	public ProductList getAvailabilityStatus(String eirCode, String accountNumber, String phoneNumber) {
		System.out.println("Getting Products by Area code "  + eirCode);
		List<Product> products = new ArrayList<Product>();
		List<Supplier> supplierList = supplierService.getAllSuppliers();
		
		for(Supplier supplier:supplierList) {
			List<Product> list = getSupplierProductsAvailability(supplier, eirCode,accountNumber, phoneNumber);
			if(list.size()>0)
				products.addAll(list);			
		}
		
		ProductList productList = new ProductList();
		productList.setProducts(products);
		return productList;
	}
	
	private List<Product> getSupplierProductsAvailability(Supplier supplier, String eirCode, String accountNumber, String phoneNumber) {
		List<Product> list = new ArrayList<Product>();
		try {
			SupplierAdapter supplierAdpter = (SupplierAdapter) Class.forName(supplier.getAdapterClass()).newInstance();
			list = supplierAdpter.getAvailableProductsByERCode(eirCode, accountNumber, phoneNumber);			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			//TODO
		}
		return list;
	}

}
