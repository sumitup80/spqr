package com.bt.spqr.services;

import java.util.List;

import com.bt.spqr.model.NBIResponse;
import com.bt.spqr.model.NOTIFICATION;
import com.bt.spqr.model.Product;
import com.bt.spqr.model.ProductList;

public interface AvailabilityService {
	
	NOTIFICATION getAvailabilityStatus(String eirCode, String accountNumber, String phoneNumber);

	NBIResponse getNBIAvailabilityStatus(String eirCode);
}
