package com.odms.util.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.odms.dao.OrderDao;
import com.odms.model.Order;
import com.odms.util.common.SQLConstant;

import jdk.internal.jline.internal.Log;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class OrderDaoImpl implements OrderDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override

	// @Transactional
	public Order createOrder(Order order) {
		try {
			insertOrder(order);
		} catch (Exception e) {
			Log.info("Exception while placing order");
		}

		return order;
	}

	@Override
	public Order getOrderDetail(String orderId) {
		List<Order> orders = jdbcTemplate.query(SQLConstant.orderDetail + orderId,
				new BeanPropertyRowMapper<>(Order.class));
		if (!orders.isEmpty())
			return orders.get(0);
		return null;
	}

	@Override
	public int updateOrder(Order order) {

		Object arg[] = { order.getOrderId(), order.getName(), order.getOrderDate(), order.getAddress() };
		return jdbcTemplate.update(SQLConstant.upddateOrder, arg);
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
						"INSERT into myorder (order_id, name,order_date,address) VALUES (?, ? ,?, ? ) ");
				stmt.setInt(1, order.getOrderId());
				stmt.setString(2, order.getName());
				stmt.setString(3, order.getOrderDate());
				stmt.setString(4, order.getAddress());
				return stmt;
			}
		});
	}
}
