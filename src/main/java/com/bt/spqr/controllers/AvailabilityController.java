package com.bt.spqr.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bt.spqr.model.NBIResponse;
import com.bt.spqr.model.NOTIFICATION;
import com.bt.spqr.services.AvailabilityService;

import io.swagger.annotations.ApiOperation;

@RestController
public class AvailabilityController {
	@Autowired
	AvailabilityService availabilityService;
	
	@Autowired
	RestTemplate restTemplate;
	
	@ApiOperation(value = "Get all available products as per the mentioned filter of EIRCode, account number and phone number.",
			notes = "This method will get all available products as per the mentioned filter of EIRCode, account number and phone number.")
	@GetMapping(path = "/availabilty/{eirCode}/{accountNumber}/{phoneNumber}", produces = {"application/xml", "application/json" })
	public ResponseEntity<NOTIFICATION> getAvailabilityByEirCodeAccNumberPhNumber(@PathVariable(value="eirCode") String eirCode,
			@PathVariable(value="accountNumber") String accountNumber, @PathVariable(value="phoneNumber") String phoneNumber){
		NOTIFICATION notification = availabilityService.getAvailabilityStatus(eirCode,accountNumber, phoneNumber);		
		return new ResponseEntity<NOTIFICATION>(notification,new HttpHeaders(), HttpStatus.OK);		
	}
	
	@ApiOperation(value = "Get all available products as per the mentioned filter of account number and phone number.",
			notes = "This method will get all available products as per the mentioned filter of account number and phone number.")
	@GetMapping(path = "/availabilty/{accountNumber}/{phoneNumber}", produces = {"application/xml", "application/json" })
	public ResponseEntity<NOTIFICATION> getAvailabilityByAccNumberPhNumber(@PathVariable(value="accountNumber") String accountNumber, 
			@PathVariable(value="phoneNumber") String phoneNumber){
		NOTIFICATION notification = availabilityService.getAvailabilityStatus("", accountNumber, phoneNumber);		
		return new ResponseEntity<NOTIFICATION>(notification,new HttpHeaders(), HttpStatus.OK);	
	}
	
	@ApiOperation(value = "Get all available products as per the mentioned filter of eirCode.",
			notes = "This method will get all available products as per the mentioned filter of eirCode.")
	@GetMapping(path = "/availabilty/{eirCode}", produces = {"application/xml", "application/json" })
	public ResponseEntity<NOTIFICATION> getAvailabilityByEirCode(@PathVariable(value="eirCode") String eirCode){
		NOTIFICATION notification = availabilityService.getAvailabilityStatus(eirCode,"","");		
		return new ResponseEntity<NOTIFICATION>(notification,new HttpHeaders(), HttpStatus.OK);	
	}
	
	@ApiOperation(value = "Get all available NBI products as per the mentioned filter of eirCode.",
			notes = "This method will get all available NBI products as per the mentioned filter of eirCode.")
	@GetMapping(path = "/nbiavailabilty/{eirCode}", produces = {"application/xml", "application/json" })
	public ResponseEntity<NBIResponse> getNBIAvailabilityByEirCode(@PathVariable(value="eirCode") String eirCode){
		NBIResponse nbiResponse = availabilityService.getNBIAvailabilityStatus(eirCode);		
		return new ResponseEntity<NBIResponse>(nbiResponse,new HttpHeaders(), HttpStatus.OK);	
	}
}
