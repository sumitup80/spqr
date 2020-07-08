package com.bt.spqr.adapters;

import com.bt.spqr.model.AVAIL_SERVICES;
import com.bt.spqr.model.NBIResponse;

public interface SupplierAdapter {
	AVAIL_SERVICES getAvailableProductsByERCode(String eirCode, String accountNumber, String phoneNumber);

	default NBIResponse getNBIAvailableProductsByERCode(String eirCode) {
		return null;
	};

}
