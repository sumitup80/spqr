package com.bt.spqr.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bt.spqr.model.Product;
import com.bt.spqr.model.ProductList;
import com.bt.spqr.model.Supplier;
import com.bt.spqr.services.AvailabilityService;

@RestController
public class AvailabilityController {
	@Autowired
	AvailabilityService availabilityService;
	
	@GetMapping(path = "/availabilty/{eirCode}/{accountNumber}/{phoneNumber}", produces = {"application/xml", "application/json" })
	public ResponseEntity<ProductList> getAvailabilityByEirCodeAccNumberPhNumber(@PathVariable(value="eirCode") String eirCode,
			@PathVariable(value="accountNumber") String accountNumber, @PathVariable(value="phoneNumber") String phoneNumber){
		ProductList productList= availabilityService.getAvailabilityStatus(eirCode,accountNumber, phoneNumber);		
		return new ResponseEntity<ProductList>(productList,new HttpHeaders(), HttpStatus.OK);		
	}
	
	@GetMapping(path = "/availabilty/{accountNumber}/{phoneNumber}", produces = {"application/xml", "application/json" })
	public ResponseEntity<ProductList> getAvailabilityByAccNumberPhNumber(@PathVariable(value="accountNumber") String accountNumber, 
			@PathVariable(value="phoneNumber") String phoneNumber){
		ProductList productList= availabilityService.getAvailabilityStatus("", accountNumber, phoneNumber);		
		return new ResponseEntity<ProductList>(productList,new HttpHeaders(), HttpStatus.OK);		
	}
	
	@GetMapping(path = "/availabilty/{eirCode}", produces = {"application/xml", "application/json" })
	public ResponseEntity<ProductList> getAvailabilityByEirCode(@PathVariable(value="eirCode") String eirCode){
		ProductList productList= availabilityService.getAvailabilityStatus(eirCode,"","");		
		return new ResponseEntity<ProductList>(productList,new HttpHeaders(), HttpStatus.OK);		
	}
}
