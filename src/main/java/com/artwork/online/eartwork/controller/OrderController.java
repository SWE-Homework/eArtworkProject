package com.artwork.online.eartwork.controller;

import com.artwork.online.eartwork.model.Order;
import com.artwork.online.eartwork.model.OrderDetail;
import com.artwork.online.eartwork.model.ShippingInfo;
import com.artwork.online.eartwork.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;

@RestController
@CrossOrigin(origins={"http://localhost:4200","http://localhost"},allowedHeaders = "*")
@RequestMapping(value = "/eartwork/api/orders",produces = MediaType.APPLICATION_JSON_VALUE)
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping(value="/list")
    public List<Order> getListArtworks() {
        /*Order order = new Order();
        order.setDateCreated(LocalDate.now());
        order.setStatus("Art");
        order.setShippingInfo(new ShippingInfo("Doc",90.0));
        order.getOrderDetail().add(new OrderDetail(1,12.15));
        order.setDateShipped(LocalDate.now());orderService.save(order);*/
        return orderService.getOrders();
    }

    @GetMapping(value="/getById/{id}")
    public Order getOrder(@PathVariable Integer id){
        return this.orderService.getOrderById(id);
    }



    @PostMapping(value="/add")
    public Order addOrder(@Valid @RequestBody Order order){
        return this.orderService.save(order);
    }

    @PutMapping(value = "/update/{id}")
    public Order updateBook( @RequestBody String statusOrder, @PathVariable Integer id) {

        Order order = this.orderService.getOrderById(id);
        if(order != null){
            System.out.println("Update Order ID# : "+id+", to Status: "+ statusOrder);
            order.setStatus(statusOrder);
            orderService.save(order);
            return order;
        }
        System.out.println("----------------------------------- Echec Update ?????");
        return null;

    }



    @DeleteMapping(value = "/delete/{id}")

    public void deleteOrder(@PathVariable Integer id) {
        orderService.deleteOrder(id);

    }


}
