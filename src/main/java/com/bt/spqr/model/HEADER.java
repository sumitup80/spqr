package com.bt.spqr.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="HEADER")
@XmlAccessorType(XmlAccessType.FIELD)

public class HEADER  implements Serializable{
	@XmlElement
	private String DATA_CONTRACT_NAME;
	@XmlElement
	private String ORIGINATOR_CODE;
	@XmlElement
	private String TRANSACTION_ID;
	@XmlElement
	private String DATE_TIME_STAMP;

	// Getter Methods

	public String getDATA_CONTRACT_NAME() {
		return DATA_CONTRACT_NAME;
	}

	public String getORIGINATOR_CODE() {
		return ORIGINATOR_CODE;
	}

	public String getTRANSACTION_ID() {
		return TRANSACTION_ID;
	}

	public String getDATE_TIME_STAMP() {
		return DATE_TIME_STAMP;
	}

	// Setter Methods

	public void setDATA_CONTRACT_NAME(String DATA_CONTRACT_NAME) {
		this.DATA_CONTRACT_NAME = DATA_CONTRACT_NAME;
	}

	public void setORIGINATOR_CODE(String ORIGINATOR_CODE) {
		this.ORIGINATOR_CODE = ORIGINATOR_CODE;
	}

	public void setTRANSACTION_ID(String TRANSACTION_ID) {
		this.TRANSACTION_ID = TRANSACTION_ID;
	}

	public void setDATE_TIME_STAMP(String DATE_TIME_STAMP) {
		this.DATE_TIME_STAMP = DATE_TIME_STAMP;
	}
}