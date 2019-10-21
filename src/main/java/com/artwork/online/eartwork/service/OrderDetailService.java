package com.artwork.online.eartwork.service;

import com.artwork.online.eartwork.model.OrderDetail;

import java.util.List;

public interface OrderDetailService {
    public OrderDetail save(OrderDetail orderDetail);
    public List<OrderDetail> getOrders();

    public OrderDetail getOrderDetailById(long id);

    public OrderDetail updateOrderDetail(OrderDetail orderDetail);
    public void deleteOrderDetailById(long orderDetailId);
    public void deleteOrderDetail(OrderDetail orderDetail);
}
