package com.odms.model;

import java.util.List;

import lombok.Data;
@Data
public class OrderItemDetail {
	private String orderId;
	private List<OrderItem> orderItems;

}
