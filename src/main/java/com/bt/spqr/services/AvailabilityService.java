package com.bt.spqr.services;

import java.util.List;

import com.bt.spqr.model.Product;
import com.bt.spqr.model.ProductList;

public interface AvailabilityService {
	
	ProductList getAvailabilityStatus(String eirCode, String accountNumber, String phoneNumber);
}
