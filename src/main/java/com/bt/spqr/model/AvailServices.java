package com.bt.spqr.model;

import java.io.Serializable;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="AVAIL_SERVICES")
@XmlAccessorType(XmlAccessType.FIELD)
public class AvailServices implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement
	ArrayList<AvailService> AVAIL_SERVICE = new ArrayList<AvailService>();

	public ArrayList<AvailService> getAVAIL_SERVICE() {
		return AVAIL_SERVICE;
	}

	public void setAVAIL_SERVICE(ArrayList<AvailService> aVAIL_SERVICE) {
		AVAIL_SERVICE = aVAIL_SERVICE;
	}
}