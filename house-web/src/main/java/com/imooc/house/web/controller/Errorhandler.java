package com.imooc.house.web.controller;

import lombok.extern.log4j.Log4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
@Log4j
public class Errorhandler {
    @ExceptionHandler(value = {Exception.class,RuntimeException.class})
    public String error500(HttpServletRequest request,Exception e){
        log.error(e.getMessage());
        log.error(request.getRequestURI()+"encounter 500");
        return "error/500";
    }
}
