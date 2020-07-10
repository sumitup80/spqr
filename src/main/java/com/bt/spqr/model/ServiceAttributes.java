package com.bt.spqr.model;

import java.io.Serializable;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="SERVICE_ATTRIBUTES")
@XmlAccessorType(XmlAccessType.FIELD)
public class ServiceAttributes implements Serializable {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement
	 ArrayList <Attribute> ATTRIBUTE = new ArrayList <Attribute> ();

	public ArrayList<Attribute> getATTRIBUTE() {
		return ATTRIBUTE;
	}

	public void setATTRIBUTE(ArrayList<Attribute> aTTRIBUTE) {
		ATTRIBUTE = aTTRIBUTE;
	}

}