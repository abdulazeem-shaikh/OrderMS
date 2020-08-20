package com.odms.dao;

import java.util.List;

import com.odms.model.OrderItem;
import com.odms.model.OrderItemDetail;

public interface OrderItemDao {
	public int createOrderItems(OrderItemDetail orderItemDetail);
 

	public int updateOrderItem(OrderItemDetail orderItemDetail);

	public OrderItemDetail getOrderItems(String orderId) throws Exception;

	public int deleteOrderItem(OrderItemDetail orderItemDetail);

}
