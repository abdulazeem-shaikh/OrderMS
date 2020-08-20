package com.odms.model;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class Order {
	private int orderId;
	private String name;
	private String orderDate;
	private String address;
	private List<OrderItem> orderItems;
	
	 
	
	
	
}
