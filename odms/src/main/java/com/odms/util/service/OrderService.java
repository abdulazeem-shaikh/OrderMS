package com.odms.util.service;


import com.odms.model.Order;

public interface OrderService {
	public Order createOrder(Order order);
	public String getOrderDetail(String orderId);
	public Order updateOrder(Order order);
	public String cancelOrder(String orderId);
}
