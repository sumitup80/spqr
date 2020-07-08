package com.bt.spqr.adapters.nbi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.bt.spqr.adapters.SupplierAdapter;
import com.bt.spqr.model.AVAIL_SERVICES;
import com.bt.spqr.model.NBIResponse;

@Component
public class NBIAdapter implements SupplierAdapter {

	//private static final Logger logger = LoggerFactory.getLogger(NBIAdapter.class);
	
	@Autowired
	RestTemplate restTemplate;
	
	@Override
	public AVAIL_SERVICES getAvailableProductsByERCode(String eirCode, String accountNumber, String phoneNumber) {
	AVAIL_SERVICES availableServices = new AVAIL_SERVICES();
		
	return availableServices;

	}
	
//	@Override
//	public List<Product> getAvailableProductsByERCode(String erCode, String accountNumber, String phoneNumber) {
//		List<Product> productList = new ArrayList<Product>();
//		Product product1 = new Product();
//		product1.setProductCode("NBP1");
//		product1.setProductName("NBIProduct1");
//		product1.setProductDescription("This is NBI Product1");
//		product1.setSupplierCode("NBI");
//		
//		productList.add(product1);
//		return productList;
//	}

	@Override
	public NBIResponse getNBIAvailableProductsByERCode(String eirCode) {
	List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();        
	MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
	converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));        
	messageConverters.add(converter);  
	restTemplate.setMessageConverters(messageConverters); 
	ResponseEntity<NBIResponse> response =
			  restTemplate.getForEntity("http://localhost:8085/eligibility", NBIResponse.class);
	NBIResponse nbiResponse = response.getBody();
	//logger.info("response received");
	
	return nbiResponse;

	}

}
