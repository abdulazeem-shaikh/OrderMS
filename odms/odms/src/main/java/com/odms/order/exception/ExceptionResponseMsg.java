package com.odms.order.exception;

import lombok.Data;

@Data
public class ExceptionResponseMsg {

	int errorCode;
	String errorMsg;

	public ExceptionResponseMsg(int errorCode, String errorMsg) {
		super();
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}

}
