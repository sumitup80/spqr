package com.bt.spqr.adapters.siro;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.bt.spqr.adapters.SupplierAdapter;
import com.bt.spqr.model.Product;
@Component
public class SiroAdapter implements SupplierAdapter {

	@Override
	public List<Product> getAvailableProductsByERCode(String erCode, String accountNumber, String phoneNumber) {
		List<Product> productList = new ArrayList<Product>();
		Product product1 = new Product();
		product1.setProductCode("SP1");
		product1.setProductName("SiroProduct1");
		product1.setProductDescription("This is Siro Product1");
		product1.setSupplierCode("SIRO");
		
		Product product2 = new Product();
		product2.setProductCode("SP2");
		product2.setProductName("SiroProduct2");
		product2.setProductDescription("This is Siro Product2");
		product2.setSupplierCode("SIRO");
		
		productList.add(product1);
		productList.add(product2);
		return productList;
	}

}
