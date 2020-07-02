package com.bt.spqr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bt.spqr.model.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
	Supplier findBySupplierCode(String supplierCode);

}
