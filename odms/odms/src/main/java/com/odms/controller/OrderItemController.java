/**
 * 
 */
package com.odms.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.odms.model.OrderItem;
import com.odms.model.OrderItemDetail;
import com.odms.util.service.OrderItemService;

/**
 * @author azeem
 *
 */

@RestController
public class OrderItemController {

	@Autowired
	OrderItemService orderItemService;

	@RequestMapping(value = "/orderItem", method = RequestMethod.POST)
	int createOrderItems(@RequestBody OrderItemDetail orderItemDetail) {
		return orderItemService.createOrderItems(orderItemDetail);

	}

	@RequestMapping(value = "/orderItem", method = RequestMethod.GET)
	OrderItemDetail getOrderItemDetail(@RequestParam("orderId") String orderId) throws Exception {
		return orderItemService.getOrderItems(orderId);

	}

	@RequestMapping(value = "/orderItem", method = RequestMethod.PUT)
	Response updateOrerItems(OrderItemDetail orderItemDetail) {
		return null;

	}

	@RequestMapping(value = "/orderItem", method = RequestMethod.DELETE)
	Response deleteOrderItem(OrderItemDetail orderItemDetail) {
		return null;

	}

}
