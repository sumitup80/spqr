package com.bt.spqr.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bt.spqr.model.Supplier;
import com.bt.spqr.model.SupplierList;
import com.bt.spqr.services.SupplierService;

import io.swagger.annotations.ApiOperation;

@RestController
public class SupplierController {
	
	@Autowired
	SupplierService supplierService;
	
	@ApiOperation(value = "Get Details for all suppliers.",  notes = "Will get all the supplier details.")
	@GetMapping(path = "/supplier", produces = {"application/json", "application/xml"})
	public ResponseEntity<SupplierList> getAllSuppliers(){
		List<Supplier> suppliers = supplierService.getAllSuppliers();
		SupplierList supplierList = new SupplierList();
		supplierList.setSuppliers(suppliers);
		return new ResponseEntity<SupplierList>(supplierList,new HttpHeaders(), HttpStatus.OK);		
	}
	
	@ApiOperation(value = "Get Details for the supplier as per the given supplier code.",  notes = "Will get the supplier details of the given supplier code.")
	@GetMapping(path = "/supplier/{supplierCode}", produces = {"application/json", "application/xml"})
	public ResponseEntity<Supplier> getSupplierBySupplierCode(@PathVariable(value="supplierCode") String supplierCode){
		Supplier supplier = supplierService.getSupplierBySupplierCode(supplierCode);
		return new ResponseEntity<Supplier>(supplier,new HttpHeaders(), HttpStatus.OK);		
	}

	@ApiOperation(value = "Create a new supplier",  notes = "Will create new supplier.")
	@PostMapping(path = "/supplier", produces = {"application/json", "application/xml"})
	public ResponseEntity<Supplier> createSupplier(@RequestBody Supplier supplier){
		Supplier insertedSupplier = supplierService.createSupplier(supplier);
		return new ResponseEntity<Supplier>(insertedSupplier,new HttpHeaders(), HttpStatus.CREATED);		
	}
	
	@ApiOperation(value = "Modify the details of the given supplier",  notes = "Will modify the supplier details of the given supplier.")
	@PutMapping(path = "/supplier", produces = {"application/json", "application/xml"})
	public ResponseEntity<Supplier> updateSupplier(@RequestBody Supplier supplier){
		Supplier insertedSupplier = supplierService.updateSupplier(supplier);
		return new ResponseEntity<Supplier>(insertedSupplier,new HttpHeaders(), HttpStatus.CREATED);
	}
}