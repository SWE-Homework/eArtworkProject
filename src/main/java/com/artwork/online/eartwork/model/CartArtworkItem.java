package com.artwork.online.eartwork.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.*;


public class CartArtworkItem {

    /**
     * Default constructor
     */

    public CartArtworkItem() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cartArtworkItemId;


    private String name;


    private int quantity;


    private double unitCost;


    private Artwork artWork;


    public long getCartArtworkItemId() {
        return cartArtworkItemId;
    }

    public void setCartArtworkItemId(long cartArtworkItemId) {
        this.cartArtworkItemId = cartArtworkItemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
