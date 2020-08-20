package com.odms.dao;

import com.odms.model.Order;

public interface OrderDao {

	public Order createOrder(Order order);

	public Order getOrderDetail(String orderId);

	public int updateOrder(Order order);

	public String cancelOrder(String orderId);
}
