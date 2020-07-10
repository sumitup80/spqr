package com.bt.spqr.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="FIBRE")
@XmlAccessorType(XmlAccessType.FIELD)
public class Fibre implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement
	private String HAS_VUA_QS;
	@XmlElement
	private String HAS_BSP_QS;
	@XmlElement
	private String VUA_DELIVERABLE;

	// Getter Methods

	public String getHAS_VUA_QS() {
		return HAS_VUA_QS;
	}

	public String getHAS_BSP_QS() {
		return HAS_BSP_QS;
	}

	public String getVUA_DELIVERABLE() {
		return VUA_DELIVERABLE;
	}

	// Setter Methods

	public void setHAS_VUA_QS(String HAS_VUA_QS) {
		this.HAS_VUA_QS = HAS_VUA_QS;
	}

	public void setHAS_BSP_QS(String HAS_BSP_QS) {
		this.HAS_BSP_QS = HAS_BSP_QS;
	}

	public void setVUA_DELIVERABLE(String VUA_DELIVERABLE) {
		this.VUA_DELIVERABLE = VUA_DELIVERABLE;
	}
}