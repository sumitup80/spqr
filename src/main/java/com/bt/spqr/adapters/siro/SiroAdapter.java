package com.bt.spqr.adapters.siro;

import java.io.File;
import java.io.InputStream;
import java.net.URL;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.springframework.stereotype.Component;

import com.bt.spqr.adapters.SupplierAdapter;
import com.bt.spqr.model.AvailServices;
@Component
public class SiroAdapter implements SupplierAdapter {

	@Override
	public AvailServices getAvailableProductsByERCode(String erCode, String accountNumber, String phoneNumber) {
		AvailServices availableServices = new AvailServices();
		//ClassLoader classLoader = getClass().getClassLoader();
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();	    
	    InputStream resource = classLoader.getResourceAsStream("siro_available_services.xml");
	    JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(AvailServices.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller(); 
			SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			Schema schema = schemaFactory.newSchema(getClass().getResource("/avail_service.xsd"));
			jaxbUnmarshaller.setSchema(schema);
			availableServices = (AvailServices) jaxbUnmarshaller.unmarshal(resource);
//			for(AVAIL_SERVICE avs: availableServices.getAVAIL_SERVICE()) {
//				System.out.println("Hi");
//			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return availableServices;

	}
//	@Override
//	public List<Product> getAvailableProductsByERCode(String erCode, String accountNumber, String phoneNumber) {
//		List<Product> productList = new ArrayList<Product>();
//		Product product1 = new Product();
//		product1.setProductCode("SP1");
//		product1.setProductName("SiroProduct1");
//		product1.setProductDescription("This is Siro Product1");
//		product1.setSupplierCode("SIRO");
//		
//		Product product2 = new Product();
//		product2.setProductCode("SP2");
//		product2.setProductName("SiroProduct2");
//		product2.setProductDescription("This is Siro Product2");
//		product2.setSupplierCode("SIRO");
//		
//		productList.add(product1);
//		productList.add(product2);
//		return productList;
//	}
	
	
}
