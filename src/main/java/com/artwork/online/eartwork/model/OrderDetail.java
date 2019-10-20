package com.artwork.online.eartwork.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.*;


public class OrderDetail {

    /**
     * Default constructor
     */
    public OrderDetail() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderDetailId;


    private int quantity;


    private double unitCost;


    private Artwork artWork;


    public long getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(long orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    public Artwork getArtWork() {
        return artWork;
    }

    public void setArtWork(Artwork artWork) {
        this.artWork = artWork;
    }
}
