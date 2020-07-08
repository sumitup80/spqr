package com.bt.spqr.model;

import java.io.Serializable;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="AVAIL_SERVICE")
@XmlAccessorType(XmlAccessType.FIELD)
public class AVAIL_SERVICE implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement
	private String SERVICE_CLASS;
	@XmlElement
	private String SERVICE_RESULT;
	@XmlElement
	private String SERVICE_STATUS;
	@XmlElement
	ArrayList<QUALIFIED_SERVICE> QUALIFIED_SERVICE = new ArrayList<QUALIFIED_SERVICE>();
	@XmlElement(name="SERVICE_ATTRIBUTES")
	SERVICE_ATTRIBUTES SERVICE_ATTRIBUTESObject;
	@XmlElement(name="INTERNAL_AVAL")
	INTERNAL_AVAIL INTERNAL_AVAILObject = new INTERNAL_AVAIL();

	// Getter Methods

	public String getSERVICE_CLASS() {
		return SERVICE_CLASS;
	}

	public String getSERVICE_RESULT() {
		return SERVICE_RESULT;
	}

	public String getSERVICE_STATUS() {
		return SERVICE_STATUS;
	}

	public SERVICE_ATTRIBUTES getSERVICE_ATTRIBUTES() {
		return SERVICE_ATTRIBUTESObject;
	}

	public INTERNAL_AVAIL getINTERNAL_AVAIL() {
		return INTERNAL_AVAILObject;
	}

	// Setter Methods

	public void setSERVICE_CLASS(String SERVICE_CLASS) {
		this.SERVICE_CLASS = SERVICE_CLASS;
	}

	public void setSERVICE_RESULT(String SERVICE_RESULT) {
		this.SERVICE_RESULT = SERVICE_RESULT;
	}

	public void setSERVICE_STATUS(String SERVICE_STATUS) {
		this.SERVICE_STATUS = SERVICE_STATUS;
	}

	public void setSERVICE_ATTRIBUTES(SERVICE_ATTRIBUTES SERVICE_ATTRIBUTESObject) {
		this.SERVICE_ATTRIBUTESObject = SERVICE_ATTRIBUTESObject;
	}

	public void setINTERNAL_AVAIL(INTERNAL_AVAIL INTERNAL_AVAILObject) {
		this.INTERNAL_AVAILObject = INTERNAL_AVAILObject;
	}
}
