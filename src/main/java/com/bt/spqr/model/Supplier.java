package com.bt.spqr.model;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table (name = "supplier")
@XmlRootElement (name = "supplier")
@XmlAccessorType(XmlAccessType.FIELD)
public class Supplier implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@XmlElement
	private Integer supplierId;
	
	@XmlElement
	@Column(name = "supplier_code")
	private String supplierCode;

	@XmlElement
	@Column(name = "supplier_name")
	private String supplierName;
	
	@XmlElement
	@Column(name = "adapter_class")
	private String adapterClass;

	public Integer getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierCode() {
		return supplierCode;
	}

	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getAdapterClass() {
		return adapterClass;
	}

	public void setAdapterClass(String adapterClass) {
		this.adapterClass = adapterClass;
	}

	@Override
	public String toString() {
		return "Supplier [supplierId=" + supplierId + ", supplierCode=" + supplierCode + ", supplierName="
				+ supplierName + ", adapterClass=" + adapterClass + "]";
	}

}
