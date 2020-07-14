package com.bt.spqr.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="EIRCOM")
@XmlAccessorType(XmlAccessType.FIELD)

public class EirCom implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement(name="FIBRE")
	Fibre FIBREObject = new Fibre();


	 // Getter Methods 

	 public Fibre getFIBRE() {
	  return FIBREObject;
	 }

	 // Setter Methods 

	 public void setFIBRE(Fibre FIBREObject) {
	  this.FIBREObject = FIBREObject;
	 }
	}
