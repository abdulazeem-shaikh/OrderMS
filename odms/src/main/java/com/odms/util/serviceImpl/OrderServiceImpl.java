package com.odms.util.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.odms.model.Order;
import com.odms.util.dao.OrderDao;
import com.odms.util.service.OrderService;

public class OrderServiceImpl implements OrderService{

	@Autowired
	OrderDao orderDao;
	
	@Override
	public Order createOrder(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getOrderDetail(String orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order updateOrder(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String cancelOrder(String orderId) {
		// TODO Auto-generated method stub
		return null;
	}

}
