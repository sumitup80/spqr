package com.bt.spqr.adapters.eircom;

import java.util.ArrayList;
import java.util.List;

import com.bt.spqr.adapters.SupplierAdapter;
import com.bt.spqr.model.Product;

public class EircomAdapter implements SupplierAdapter {

	@Override
	public List<Product> getAvailableProductsByERCode(String erCode, String accountNumber, String phoneNumber) {
		List<Product> productList = new ArrayList<Product>();
		Product product1 = new Product();
		product1.setProductCode("ERP1");
		product1.setProductName("EIRCOMProduct1");
		product1.setProductDescription("This is EIRCOM Product1");
		product1.setSupplierCode("EIRCOM");
		
		Product product2 = new Product();
		product2.setProductCode("ERP2");
		product2.setProductName("EIRCOMProduct2");
		product2.setProductDescription("This is EIRCOM Product2");
		product2.setSupplierCode("EIRCOM");
		
		productList.add(product1);
		productList.add(product2);
		return productList;
	}

}
