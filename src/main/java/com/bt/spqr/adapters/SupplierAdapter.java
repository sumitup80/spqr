package com.bt.spqr.adapters;

import com.bt.spqr.model.AvailServices;
import com.bt.spqr.model.NBIResponse;

public interface SupplierAdapter {
	AvailServices getAvailableProductsByERCode(String eirCode, String accountNumber, String phoneNumber);

	default NBIResponse getNBIAvailableProductsByERCode(String eirCode) {
		return null;
	};

}
