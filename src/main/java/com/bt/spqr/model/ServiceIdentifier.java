package com.bt.spqr.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="SERVICE_IDENTIFIER")
@XmlAccessorType(XmlAccessType.FIELD)
public class ServiceIdentifier implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement
	private String EIRCODE;

	// Getter Methods

	public String getEIRCODE() {
		return EIRCODE;
	}

	// Setter Methods

	public void setEIRCODE(String EIRCODE) {
		this.EIRCODE = EIRCODE;
	}
}