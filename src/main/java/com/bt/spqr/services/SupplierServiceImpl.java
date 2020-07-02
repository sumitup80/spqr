package com.bt.spqr.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.bt.spqr.model.Supplier;
import com.bt.spqr.repository.SupplierRepository;

@Component
public class SupplierServiceImpl implements SupplierService {
	
	@Autowired
	SupplierRepository supplierRepository;

	@Override
	@Cacheable(value = "suppliers")
	public List<Supplier> getAllSuppliers() {
		System.out.println("Getting all suppliers");
		return supplierRepository.findAll();
	}

	@Override
	@Cacheable(value = "suppliers", key="#supplierCode")
	public Supplier getSupplierBySupplierCode(String supplierCode) {
		System.out.println("Getting suppliers by code "  + supplierCode);
		return supplierRepository.findBySupplierCode(supplierCode);
	}

	@Override
	public Supplier createSupplier(Supplier supplier) {
		Supplier insertedSupplier = supplierRepository.save(supplier);
		return insertedSupplier;
	}

	@Override
	@CachePut(value = "suppliers", key = "#supplier.id")
	public Supplier updateSupplier(Supplier supplier) {
		Supplier updatedSupplier = supplierRepository.save(supplier);
		return updatedSupplier;
	}

	

}
