package com.odms.util.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.odms.dao.OrderItemDao;
import com.odms.model.OrderItemDetail;
import com.odms.util.service.OrderItemService;

import jdk.internal.jline.internal.Log;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class OrderItemServiceImpl implements OrderItemService {

	@Autowired
	OrderItemDao orderItemDao;

	@Override
	public int createOrderItems(OrderItemDetail orderItemDetail) {

		return orderItemDao.createOrderItems(orderItemDetail);
	}

	@Override
	public int updateOrderItem(OrderItemDetail orderId) {
		return orderItemDao.updateOrderItem(orderId);
	}

	@Override
	public int deleteOrderItem(OrderItemDetail orderItemDetail) {
		// TODO
		return 0;
	}

	@Override
	public OrderItemDetail getOrderItems(String orderId) throws Exception {


			return orderItemDao.getOrderItems(orderId);
		
	}

}
