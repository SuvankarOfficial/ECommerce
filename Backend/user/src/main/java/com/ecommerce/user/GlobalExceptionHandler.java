package com.ecommerce.user;

import com.ecommerce.user.bean.ResponseService;
import com.ecommerce.user.exception.InvalidUserIdException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class GlobalExceptionHandler {

    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public ResponseService InvalidUserUniqueIdExceptionHandler(InvalidUserIdException invalidUserIdException){
        return ResponseService.builder().status(Boolean.FALSE).message(invalidUserIdException.getMessage()).build();
    }

}
