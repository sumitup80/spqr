package com.bt.spqr.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="EIRCOM")
@XmlAccessorType(XmlAccessType.FIELD)

public class EIRCOM implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement(name="FIBRE")
	FIBRE FIBREObject = new FIBRE();


	 // Getter Methods 

	 public FIBRE getFIBRE() {
	  return FIBREObject;
	 }

	 // Setter Methods 

	 public void setFIBRE(FIBRE FIBREObject) {
	  this.FIBREObject = FIBREObject;
	 }
	}
