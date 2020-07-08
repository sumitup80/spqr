package com.bt.spqr.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "QUALIFIED_SERVICE")
@XmlAccessorType(XmlAccessType.FIELD)
public class QUALIFIED_SERVICE implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement
	private String SERVICE_CODE;
	@XmlElement
	private String PROFILE_CODE;
	@XmlElement
	private String RECOMMENDED;

	// Getter Methods

	public String getRECOMMENDED() {
		return RECOMMENDED;
	}

	public void setRECOMMENDED(String rECOMMENDED) {
		RECOMMENDED = rECOMMENDED;
	}

	public String getSERVICE_CODE() {
		return SERVICE_CODE;
	}

	public String getPROFILE_CODE() {
		return PROFILE_CODE;
	}

	// Setter Methods

	public void setSERVICE_CODE(String SERVICE_CODE) {
		this.SERVICE_CODE = SERVICE_CODE;
	}

	public void setPROFILE_CODE(String PROFILE_CODE) {
		this.PROFILE_CODE = PROFILE_CODE;
	}
}