package com.bt.spqr.adapters.eircom;

import java.io.File;
import java.net.URL;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import com.bt.spqr.adapters.SupplierAdapter;
import com.bt.spqr.model.AVAIL_SERVICES;

public class EircomAdapter implements SupplierAdapter {

	@Override
	public AVAIL_SERVICES getAvailableProductsByERCode(String erCode, String accountNumber, String phoneNumber) {
		AVAIL_SERVICES availableServices = new AVAIL_SERVICES();
		ClassLoader classLoader = getClass().getClassLoader();
        URL resource = classLoader.getResource("eircom_available_services.xml");
		File file = new File(resource.getFile());  
        JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(AVAIL_SERVICES.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller(); 
			SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			Schema schema = schemaFactory.newSchema(getClass().getResource("/avail_service.xsd"));
			jaxbUnmarshaller.setSchema(schema);
			availableServices = (AVAIL_SERVICES) jaxbUnmarshaller.unmarshal(file);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return availableServices;
	}
	
//	@Override
//	public List<Product> getAvailableProductsByERCode(String erCode, String accountNumber, String phoneNumber) {
//		
//		        
//		List<Product> productList = new ArrayList<Product>();
//		Product product1 = new Product();
//		product1.setProductCode("ERP1");
//		product1.setProductName("EIRCOMProduct1");
//		product1.setProductDescription("This is EIRCOM Product1");
//		product1.setSupplierCode("EIRCOM");
//		
//		Product product2 = new Product();
//		product2.setProductCode("ERP2");
//		product2.setProductName("EIRCOMProduct2");
//		product2.setProductDescription("This is EIRCOM Product2");
//		product2.setSupplierCode("EIRCOM");
//		
//		productList.add(product1);
//		productList.add(product2);
//		return productList;
//	}

}
