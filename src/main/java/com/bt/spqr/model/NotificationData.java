package com.bt.spqr.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="NOTIFICATION_DATA")
@XmlAccessorType(XmlAccessType.FIELD)
public class NotificationData implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement
	private String NAME;
	@XmlElement
	private String CODE;
	@XmlElement
	private String ORDER_NUMBER;
	@XmlElement
	private String APPLICATION_DATE;
	@XmlElement
	private String RECEIVED_DATE;
	@XmlElement
	private String MESSAGE_TYPE;
	@XmlElement
	private String MESSAGE_DATE;
	@XmlElement
	private String OVERALL_RESPONSE;
	@XmlElement
	private String INTERNAL_STATUS;
	@XmlElement(name="AVAILABILITY")
	Availability_1 AVAILABILITYObject = new Availability_1();

	// Getter Methods

	public String getNAME() {
		return NAME;
	}

	public String getCODE() {
		return CODE;
	}

	public String getORDER_NUMBER() {
		return ORDER_NUMBER;
	}

	public String getAPPLICATION_DATE() {
		return APPLICATION_DATE;
	}

	public String getRECEIVED_DATE() {
		return RECEIVED_DATE;
	}

	public String getMESSAGE_TYPE() {
		return MESSAGE_TYPE;
	}

	public String getMESSAGE_DATE() {
		return MESSAGE_DATE;
	}

	public String getOVERALL_RESPONSE() {
		return OVERALL_RESPONSE;
	}

	public String getINTERNAL_STATUS() {
		return INTERNAL_STATUS;
	}

	public Availability_1 getAVAILABILITY() {
		return AVAILABILITYObject;
	}

	// Setter Methods

	public void setNAME(String NAME) {
		this.NAME = NAME;
	}

	public void setCODE(String CODE) {
		this.CODE = CODE;
	}

	public void setORDER_NUMBER(String ORDER_NUMBER) {
		this.ORDER_NUMBER = ORDER_NUMBER;
	}

	public void setAPPLICATION_DATE(String APPLICATION_DATE) {
		this.APPLICATION_DATE = APPLICATION_DATE;
	}

	public void setRECEIVED_DATE(String RECEIVED_DATE) {
		this.RECEIVED_DATE = RECEIVED_DATE;
	}

	public void setMESSAGE_TYPE(String MESSAGE_TYPE) {
		this.MESSAGE_TYPE = MESSAGE_TYPE;
	}

	public void setMESSAGE_DATE(String MESSAGE_DATE) {
		this.MESSAGE_DATE = MESSAGE_DATE;
	}

	public void setOVERALL_RESPONSE(String OVERALL_RESPONSE) {
		this.OVERALL_RESPONSE = OVERALL_RESPONSE;
	}

	public void setINTERNAL_STATUS(String INTERNAL_STATUS) {
		this.INTERNAL_STATUS = INTERNAL_STATUS;
	}

	public void setAVAILABILITY(Availability_1 AVAILABILITYObject) {
		this.AVAILABILITYObject = AVAILABILITYObject;
	}
}
