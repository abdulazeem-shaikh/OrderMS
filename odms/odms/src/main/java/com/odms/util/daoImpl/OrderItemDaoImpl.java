package com.odms.util.daoImpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.odms.dao.OrderItemDao;
import com.odms.exception.mapper.OrderItemsRowMapper;
import com.odms.model.OrderItem;
import com.odms.model.OrderItemDetail;
import com.odms.util.common.SQLConstant;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class OrderItemDaoImpl implements OrderItemDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	/**
	 * L̥
	 * 
	 */
	@Override
	public int createOrderItems(OrderItemDetail orderItemDetail) {
		int count[] = insertOrderItems(orderItemDetail);
		log.info("total record inserted {} ", count.length);
		return count.length;

	}

	/**
	 * 
	 * @param orderItemDetail
	 * @return
	 */
	private int[] insertOrderItems(OrderItemDetail orderItemDetail) {
		List<OrderItem> orderItems = orderItemDetail.getOrderItems();
		return jdbcTemplate.batchUpdate(SQLConstant.insertOrderItemDetail, new BatchPreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				ps.setNString(1, orderItemDetail.getOrderId());
				ps.setLong(2, orderItems.get(i).getProductCode());
				ps.setString(3, orderItems.get(i).getProductName());
				ps.setInt(4, orderItems.get(i).getQuantity());
			}

			@Override
			public int getBatchSize() {
				return 1;
			}
		});
	}

	/**
	 * 
	 * 
	 * @param orderItemDetail
	 * @return
	 */
	private int[] updateOrderItems(OrderItemDetail orderItemDetail) {
		List<OrderItem> orderItems = orderItemDetail.getOrderItems();
		return jdbcTemplate.batchUpdate(SQLConstant.insertOrderItemDetail, new BatchPreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				ps.setNString(1, orderItemDetail.getOrderId());
				ps.setLong(2, orderItems.get(i).getProductCode());
				ps.setString(3, orderItems.get(i).getProductName());
				ps.setInt(4, orderItems.get(i).getQuantity());

			}

			@Override
			public int getBatchSize() {
				return 50;
			}
		});
	}

	@Override
	public int updateOrderItem(OrderItemDetail orderItemDetail) {

		int updatedCount = updateOrderItems(orderItemDetail).length;
		log.info("Total product item updated is {} ", updatedCount);
		return updatedCount;
	}

	@Override
	public int deleteOrderItem(OrderItemDetail orderItemDetail) {
		// TODO
		return 0;
	}

	@SuppressWarnings("unchecked")
	@Override
	public OrderItemDetail getOrderItems(String orderId) throws Exception {

		List<OrderItem> orderItems = jdbcTemplate.query("select * from orderItems where order_id=  " + orderId,
				new OrderItemsRowMapper());
		OrderItemDetail itemDetail = new OrderItemDetail();
		itemDetail.setOrderId(orderId);
		itemDetail.setOrderItems(orderItems);
		return itemDetail;

	}

}
