package com.ecommerce.user.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
public class ResponseService {

    private String message;

    private Boolean status;

    private Object data;

}
