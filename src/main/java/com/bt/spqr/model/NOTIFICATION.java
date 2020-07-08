package com.bt.spqr.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="NOTIFICATION")
@XmlAccessorType(XmlAccessType.FIELD)
public class NOTIFICATION implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@XmlElement(name="HEADER")
	HEADER HEADERObject = new HEADER();
	
	@XmlElement(name="NOTIFICATION_DATA")
	NOTIFICATION_DATA NOTIFICATION_DATAObject = new NOTIFICATION_DATA();

	// Getter Methods

	public HEADER getHEADER() {
		return HEADERObject;
	}

	public NOTIFICATION_DATA getNOTIFICATION_DATA() {
		return NOTIFICATION_DATAObject;
	}

	// Setter Methods

	public void setHEADER(HEADER HEADERObject) {
		this.HEADERObject = HEADERObject;
	}

	public void setNOTIFICATION_DATA(NOTIFICATION_DATA NOTIFICATION_DATAObject) {
		this.NOTIFICATION_DATAObject = NOTIFICATION_DATAObject;
	}
}
