package com.odms.util.common;

import lombok.Data;

@Data
public interface  SQLConstant {

	public String orderDetail = "select * from order where order_id=";
}
