package com.ecommerce.user;

import com.ecommerce.user.bean.ResponseService;
import com.ecommerce.user.exception.DoesNotExist;
import com.ecommerce.user.exception.InvalidUserIdException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

public class GlobalExceptionHandler {

    @ExceptionHandler(InvalidUserIdException.class)
    public ResponseService InvalidUserUniqueIdExceptionHandler(InvalidUserIdException invalidUserIdException){
        return ResponseService.builder().status(Boolean.FALSE).message(invalidUserIdException.getMessage()).build();
    }

    @ExceptionHandler(DoesNotExist.class)
    public ResponseService doesNotExistExceptionHandler(DoesNotExist doesNotExist){
        return ResponseService.builder().status(Boolean.FALSE).message(doesNotExist.getMessage()).build();
    }

}
