package com.bt.spqr.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="NOTIFICATION")
@XmlAccessorType(XmlAccessType.FIELD)
public class Notification implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@XmlElement(name="HEADER")
	Header HEADERObject = new Header();
	
	@XmlElement(name="NOTIFICATION_DATA")
	NotificationData NOTIFICATION_DATAObject = new NotificationData();

	// Getter Methods

	public Header getHEADER() {
		return HEADERObject;
	}

	public NotificationData getNOTIFICATION_DATA() {
		return NOTIFICATION_DATAObject;
	}

	// Setter Methods

	public void setHEADER(Header HEADERObject) {
		this.HEADERObject = HEADERObject;
	}

	public void setNOTIFICATION_DATA(NotificationData NOTIFICATION_DATAObject) {
		this.NOTIFICATION_DATAObject = NOTIFICATION_DATAObject;
	}
}
