package com.artwork.online.eartwork.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.*;


public class ShippingInfo {

    /**
     * Default constructor
     */
    public ShippingInfo() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
