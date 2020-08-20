package com.odms.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.odms.model.OrderItemDetail;

@FeignClient(value="orderItem", url = "http://localhost:8080/odms")
public interface OrderItemClient {
	@RequestMapping(method = RequestMethod.GET, value = "/orderItem")
	OrderItemDetail getOrderItemDetail(@RequestParam("orderId") String orderId) ;

}