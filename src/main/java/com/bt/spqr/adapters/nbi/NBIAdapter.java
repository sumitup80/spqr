package com.bt.spqr.adapters.nbi;

import java.util.ArrayList;
import java.util.List;

import com.bt.spqr.adapters.SupplierAdapter;
import com.bt.spqr.model.Product;

public class NBIAdapter implements SupplierAdapter {

	@Override
	public List<Product> getAvailableProductsByERCode(String erCode, String accountNumber, String phoneNumber) {
		List<Product> productList = new ArrayList<Product>();
		Product product1 = new Product();
		product1.setProductCode("NBP1");
		product1.setProductName("NBIProduct1");
		product1.setProductDescription("This is NBI Product1");
		product1.setSupplierCode("NBI");
		
		productList.add(product1);
		return productList;
	}

}
