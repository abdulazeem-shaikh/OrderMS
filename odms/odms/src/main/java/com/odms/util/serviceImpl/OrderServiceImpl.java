package com.odms.util.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.odms.dao.OrderDao;
import com.odms.model.Order;
import com.odms.model.OrderItem;
import com.odms.order.client.OrderItemClient;
import com.odms.util.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderDao orderDao;

	@Autowired
	OrderItemClient orderItemClient;

	@Override
	public Order createOrder(Order order) {

		return orderDao.createOrder(order);
	}

	/**
	 * 
	 */
	@Override
	public Order getOrderDetail(String orderId) {
		List<OrderItem> items = orderItemClient.getOrderItemDetail(orderId).getOrderItems();
		Order order = orderDao.getOrderDetail(orderId);
		order.setOrderItems(items);
		return order;
	}

	@Override
	public int updateOrder(Order order) {
		return orderDao.updateOrder(order);
	}

	@Override
	public String cancelOrder(String orderId) {
		return orderDao.cancelOrder(orderId);
	}

}
