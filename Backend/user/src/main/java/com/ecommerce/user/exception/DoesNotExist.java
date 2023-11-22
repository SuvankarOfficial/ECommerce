package com.ecommerce.user.exception;

public class DoesNotExist extends RuntimeException {

    public DoesNotExist(String message) {
        super(message + " Does Not exist.");
    }
}
