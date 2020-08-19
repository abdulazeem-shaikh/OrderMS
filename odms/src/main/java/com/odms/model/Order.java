package com.odms.model;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class Order {
	private String orderId;
	private String name;
	private Date orderDate;
	private String ShippingAdress;
	private List<OrderItem> orderItems;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getShippingAdress() {
		return ShippingAdress;
	}
	public void setShippingAdress(String shippingAdress) {
		ShippingAdress = shippingAdress;
	}
	public List<OrderItem> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}
 
	
	
	
}
