package com.suleyman.hoaxifywebservice.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HoaxifyWebServiceException extends RuntimeException{
    private final Integer code;
    private final String message;

    public HoaxifyWebServiceException(ErrorCode errorCodes){
        super();
        this.code=errorCodes.getCode();
        this.message=errorCodes.getMessage();
    }
}
