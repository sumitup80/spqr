package com.bt.spqr.services;

import java.util.List;

import com.bt.spqr.model.Supplier;

public interface SupplierService {
	
	List<Supplier> getAllSuppliers();
	Supplier getSupplierBySupplierCode(String supplierCode);
	Supplier createSupplier(Supplier supplier);
	Supplier updateSupplier(Supplier supplier);

}
