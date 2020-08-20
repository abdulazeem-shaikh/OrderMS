package com.odms.util.service;


import com.odms.model.Order;

public interface OrderService {
	public Order createOrder(Order order);
	public Order getOrderDetail(String orderId);
	public int updateOrder(Order order);
	public String cancelOrder(String orderId);
}
