package com.sk.sampleMS.application.sp.web.Exception;

import java.util.*;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.*;

import com.sk.sampleMS.application.sp.web.message.*;

@ControllerAdvice
public class ApiExceptionHandler {
    
    @ExceptionHandler(value = { NotFoundException.class })
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public ApiResponseMessage handleConflict(RuntimeException ex, WebRequest request){
        ApiResponseMessage errorDetail = new ApiResponseMessage();
        errorDetail.setTimeStamp(new Date());
        errorDetail.setErrorCode(HttpStatus.NOT_FOUND.toString());
        errorDetail.setMessage(ex.getMessage());

        return errorDetail;
    }
}

