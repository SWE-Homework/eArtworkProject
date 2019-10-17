package com.artwork.online.eartwork.model;

import java.util.*;


public class ShoppingCart {

    /**
     * Default constructor
     */
    public ShoppingCart() {
    }


    private long id;


    private int quantity;


    private Date dateAdded;


    private String status;


    private List<CartArtworkItem> cartArtworkItems;



    public void addCartItem() {
        // TODO implement here
    }


    public void deleteCartItem() {
        // TODO implement here
    }


    public void updateQuantity() {
        // TODO implement here
    }


    public void viewCartDetails() {
        // TODO implement here
    }


    public void checkout() {
        // TODO implement here
    }

    /**
     * @return
     */
    public double calculateTotalPrice() {
        // TODO implement here
        return 0.0d;
    }

}
