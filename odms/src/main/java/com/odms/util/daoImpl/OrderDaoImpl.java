package com.odms.util.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;

import com.odms.model.Order;
import com.odms.util.common.SQLConstant;
import com.odms.util.dao.OrderDao;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OrderDaoImpl implements OrderDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public Order createOrder(Order order) {
		try {
			insertOrder(order);
		} catch (SQLException e) {

			// should be logged
		}

		return order;
	}

	@Override
	public Order getOrderDetail(String orderId) {
		return (Order) jdbcTemplate.queryForObject(SQLConstant.orderDetail + orderId, Order.class);
	}

	@Override
	public Order updateOrder(Order order) {
		return null;
	}

	@Override
	public String cancelOrder(String orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void insertOrder(final Order order) throws SQLException {
		jdbcTemplate.update(new PreparedStatementCreator() {

			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement stmt = con.prepareStatement(
						"INSERT into Order(order_id, name, order_date,shipping_adress) VALUES (?, ?, ?)");
				stmt.setString(1, order.getOrderId());
				stmt.setString(2, order.getName());
				stmt.setDate(3, (java.sql.Date) order.getOrderDate());
				stmt.setString(4, order.getShippingAdress());
				return stmt;
			}
		});
	}
}
