package com.bt.spqr.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name="products")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProductList implements Serializable 
{
    private static final long serialVersionUID = 1L;

    @XmlElement(name="product")
    private List<Product> products = new ArrayList<Product>();
    
    public List<Product> getProducts() {
        return products;
    }
 
    public void setProducts(List<Product> products) {
        this.products = products;
    }

}
