package com.bt.spqr.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@XmlRootElement(name="INTERNAL_AVAIL")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
public class INTERNAL_AVAIL implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement(name="EIRCOM")
	EIRCOM EIRCOMObject = new EIRCOM();

	@XmlElement(name="SIRO")
	SIRO SIROObject = new SIRO();


	 // Getter Methods 

	 public SIRO getSIRO() {
	  return SIROObject;
	 }

	 // Setter Methods 

	 public void setSIRO(SIRO SIROObject) {
	  this.SIROObject = SIROObject;
	 }
	 // Getter Methods 

	 public EIRCOM getEIRCOM() {
	  return EIRCOMObject;
	 }

	 // Setter Methods 

	 public void setEIRCOM(EIRCOM EIRCOMObject) {
	  this.EIRCOMObject = EIRCOMObject;
	 }
	}