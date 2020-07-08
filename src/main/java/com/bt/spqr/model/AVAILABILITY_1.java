package com.bt.spqr.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="AVAILABILITY")
@XmlAccessorType(XmlAccessType.FIELD)

public class AVAILABILITY_1 implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@XmlElement(name="SERVICE_IDENTIFIER")
	 SERVICE_IDENTIFIER SERVICE_IDENTIFIERObject = new SERVICE_IDENTIFIER();
	 
	 @XmlElement
	 private String AVAILABILITY_RESULT;
	 
	 @XmlElement(name="AVAIL_SERVICES")
	 AVAIL_SERVICES AVAIL_SERVICESObject = new AVAIL_SERVICES();


	 // Getter Methods 

	 public SERVICE_IDENTIFIER getSERVICE_IDENTIFIER() {
	  return SERVICE_IDENTIFIERObject;
	 }

	 public String getAVAILABILITY_RESULT() {
	  return AVAILABILITY_RESULT;
	 }

	 public AVAIL_SERVICES getAVAIL_SERVICES() {
	  return AVAIL_SERVICESObject;
	 }

	 // Setter Methods 

	 public void setSERVICE_IDENTIFIER(SERVICE_IDENTIFIER SERVICE_IDENTIFIERObject) {
	  this.SERVICE_IDENTIFIERObject = SERVICE_IDENTIFIERObject;
	 }

	 public void setAVAILABILITY_RESULT(String AVAILABILITY_RESULT) {
	  this.AVAILABILITY_RESULT = AVAILABILITY_RESULT;
	 }

	 public void setAVAIL_SERVICES(AVAIL_SERVICES AVAIL_SERVICESObject) {
	  this.AVAIL_SERVICESObject = AVAIL_SERVICESObject;
	 }
	}