package com.odms.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.odms.model.Order;

public class OrderValidator implements Validator {

    /**
     * This Validator validates *just* Order instances
     */
    public boolean supports(Class clazz) {
        return Order.class.equals(clazz);
    }

    public void validate(Object obj, Errors e) {
        
        Order p = (Order) obj;
 
    }
}