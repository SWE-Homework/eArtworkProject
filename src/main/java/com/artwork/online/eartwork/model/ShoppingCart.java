package com.artwork.online.eartwork.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.*;


public class ShoppingCart {

    /**
     * Default constructor
     */
    public ShoppingCart() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long shoppingCartId;


    private int quantity;


    private Date dateAdded;


    private String status;


    private List<CartArtworkItem> cartArtworkItems;


    public long getShoppingCartId() {
        return shoppingCartId;
    }

    public void setShoppingCartId(long shoppingCartId) {
        this.shoppingCartId = shoppingCartId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<CartArtworkItem> getCartArtworkItems() {
        return cartArtworkItems;
    }

    public void setCartArtworkItems(List<CartArtworkItem> cartArtworkItems) {
        this.cartArtworkItems = cartArtworkItems;
    }
}
