package com.example.demoRestAPI.exceptionstudent;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerController {
    @ExceptionHandler
    public ResponseEntity<ErrorPage> handleException(RecordNotFoundException exception)
    {
        ErrorPage errorPage=new ErrorPage();
        errorPage.setStatuscode(HttpStatus.NOT_FOUND.value());
        errorPage.setMessage("record not Avilable");
        errorPage.setTimestap(System.currentTimeMillis());
        return new ResponseEntity<> (errorPage,HttpStatus.NOT_FOUND);
    }
}
