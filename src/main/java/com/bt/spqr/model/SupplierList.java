package com.bt.spqr.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name="suppliers")
@XmlAccessorType(XmlAccessType.FIELD)
public class SupplierList implements Serializable 
{
    private static final long serialVersionUID = 1L;
    
    
    @XmlElement(name="supplier")
    private List<Supplier> suppliers;
    
    public List<Supplier> getSuppliers() {
        return suppliers;
    }
 
    public void setSuppliers(List<Supplier> suppliers) {
        this.suppliers = suppliers;
    }

}
