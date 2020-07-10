package com.bt.spqr.model;

import java.io.Serializable;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="AVAIL_SERVICE")
@XmlAccessorType(XmlAccessType.FIELD)
public class AvailService implements Serializable {
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
	ArrayList<QualifiedService> QUALIFIED_SERVICE = new ArrayList<QualifiedService>();
	@XmlElement(name="SERVICE_ATTRIBUTES")
	ServiceAttributes SERVICE_ATTRIBUTESObject;
	@XmlElement(name="INTERNAL_AVAL")
	InternalAvail INTERNAL_AVAILObject = new InternalAvail();

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

	public ServiceAttributes getSERVICE_ATTRIBUTES() {
		return SERVICE_ATTRIBUTESObject;
	}

	public InternalAvail getINTERNAL_AVAIL() {
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

	public void setSERVICE_ATTRIBUTES(ServiceAttributes SERVICE_ATTRIBUTESObject) {
		this.SERVICE_ATTRIBUTESObject = SERVICE_ATTRIBUTESObject;
	}

	public void setINTERNAL_AVAIL(InternalAvail INTERNAL_AVAILObject) {
		this.INTERNAL_AVAILObject = INTERNAL_AVAILObject;
	}
}
