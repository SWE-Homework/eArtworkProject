package com.artwork.online.eartwork.controller;

import com.artwork.online.eartwork.model.Order;
import com.artwork.online.eartwork.model.OrderDetail;
import com.artwork.online.eartwork.model.ShippingInfo;
import com.artwork.online.eartwork.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
//@CrossOrigin(origins={"http://localhost:4200","http://localhost"},allowedHeaders = "*")
@RequestMapping(value = "/eartwork/api/orders",produces = MediaType.APPLICATION_JSON_VALUE)
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping(value="/list")
    public List<Order> getListArtworks() {
        Order order = new Order();
        order.setDateCreated(LocalDate.now());
        order.setStatus("Art");
        order.setShippingInfo(new ShippingInfo("Doc",90.0));
        order.getOrderDetail().add(new OrderDetail(1,12.15));
        order.setDateShipped(LocalDate.now());orderService.save(order);
        return orderService.getOrders();
    }
}
