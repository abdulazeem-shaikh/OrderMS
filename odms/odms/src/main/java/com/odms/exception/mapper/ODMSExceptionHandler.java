package com.odms.exception.mapper;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.odms.order.exception.ExceptionResponseMsg;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class ODMSExceptionHandler {

	@ExceptionHandler(Exception.class)
	public ExceptionResponseMsg handleException(Exception exception) {
		ExceptionResponseMsg exceptionResponseMsg = new ExceptionResponseMsg(1000, exception.getMessage());
		log.info("Error has occurred");
		return exceptionResponseMsg;

	}

	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 * add error specific handler
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
}