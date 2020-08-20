package com.odms.exception.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.odms.model.OrderItem;

public class OrderItemsRowMapper implements RowMapper{

	 @Override
	    public OrderItem mapRow(ResultSet rs, int rowNum) throws SQLException {
	    	OrderItem orderItems = new OrderItem();
	        orderItems.setProductCode(rs.getLong("product_code"));
	        orderItems.setProductName(rs.getString("product_name"));
	        orderItems.setQuantity(rs.getInt("quantity")); 
	        return orderItems;
	    }
	
}
