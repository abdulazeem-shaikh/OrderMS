package com.odms.util.common;

import lombok.Data;

public interface SQLConstant {

	public String orderDetail = "select * from myorder where order_id= ";

	public String upddateOrder = "update myorder set name =? , order_date= ? ,shipping_address=? where orderId=? ";

	public String insertOrderItemDetail = "INSERT INTO orderItems VALUES (?, ?, ?, ?)";
	
	public String updateOrderItemDetail = "Update  orderItems set product_code=?, product_name=?, quantity=? where order_id=?";
	
	 

}
