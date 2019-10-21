package com.artwork.online.eartwork.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.*;

@Entity
public class ShippingInfo implements Serializable {

    /**
     * Default constructor
     */
    public ShippingInfo() {
    }

    public ShippingInfo(String shippingType, double shippingCost) {
        this.shippingType = shippingType;
        this.shippingCost = shippingCost;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long shippingInfoId;


    private String shippingType;


    private double shippingCost;

    public long getShippingInfoId() {
        return shippingInfoId;
    }

    public void setShippingInfoId(long shippingInfoId) {
        this.shippingInfoId = shippingInfoId;
    }

    public String getShippingType() {
        return shippingType;
    }

    public void setShippingType(String shippingType) {
        this.shippingType = shippingType;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }
}
