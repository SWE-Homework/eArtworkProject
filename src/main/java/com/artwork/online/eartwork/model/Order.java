package com.artwork.online.eartwork.model;

import java.util.*;


public class Order {

    /**
     * Default constructor
     */
    public Order() {
    }


    private long id;


    private Date dateCreated;


    private Date dateShipped;


    private String Status;


    private ShippingInfo shippingInfo;


    private List<OrderDetail> orderDetail;





    public void placeOrder() {
        // TODO implement here
    }

}
