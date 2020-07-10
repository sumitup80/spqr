package com.bt.spqr.services;

import java.util.List;

import com.bt.spqr.model.NBIResponse;
import com.bt.spqr.model.Notification;
import com.bt.spqr.model.Product;
import com.bt.spqr.model.ProductList;

public interface AvailabilityService {
	
	Notification getAvailabilityStatus(String eirCode, String accountNumber, String phoneNumber);

	NBIResponse getNBIAvailabilityStatus(String eirCode);
}
