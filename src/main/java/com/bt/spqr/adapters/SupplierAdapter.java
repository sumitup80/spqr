package com.bt.spqr.adapters;

import java.util.List;

import com.bt.spqr.model.Product;

public interface SupplierAdapter {
	List<Product> getAvailableProductsByERCode(String eirCode, String accountNumber, String phoneNumber);

}
