package com.ensas.miniprojet.demo.controller.home;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HomeExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<String> MovieBadRequest(Exception exp){
        String msg = exp.getMessage();
        return new ResponseEntity<String>(msg, HttpStatus.BAD_REQUEST);
    }
}