package com.odms.util.service;

import java.util.List;

import com.odms.model.OrderItem;
import com.odms.model.OrderItemDetail;

public interface OrderItemService {
	public int createOrderItems(OrderItemDetail orderItemDetail);

	public OrderItemDetail getOrderItems(String orderId) throws Exception ;
	
	public int updateOrderItem(OrderItemDetail orderItemDetail );

	public int deleteOrderItem(OrderItemDetail orderItemDetail);
}
