package com.sk.sampleMS.application.sp.web.message;

import java.util.*;

import com.fasterxml.jackson.annotation.*;

import lombok.*;

@Setter
@Getter
@ToString
public class ApiResponseMessage {
    private String status;
    private String message;
    private String errorMessage;
    private String errorCode;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm", timezone = "Asia/Seoul")
    private Date timeStamp;
    
    public ApiResponseMessage() {}
 
    public ApiResponseMessage(String status, String message, String errorCode, String errorMessage) {
        this.status = status;
        this.message = message;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
