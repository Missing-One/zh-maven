package com.zh.tmall.admin.web.controller;

import org.apache.log4j.Logger;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常处理
 */
@ControllerAdvice
public class ExceptionController extends ResponseEntityExceptionHandler {//implements ErrorController {

    private static final Logger LOG = Logger.getLogger(ExceptionController.class);

    @ExceptionHandler(Throwable.class)
    @ResponseBody
    String exception(Throwable e, HttpServletRequest request){

        log(e, request);
        return "404";
    }


    /**
     * 异常处理日志记录
     */
    void log(Throwable e, HttpServletRequest request){
        LOG.error("------------------------------------------");
        LOG.error("异常开始");
        LOG.error(e);
        StackTraceElement[] error = e.getStackTrace();
        for (StackTraceElement stackTraceElement : error) {
            logger.error(stackTraceElement.toString());
        }
        LOG.error("异常结束");
        LOG.error("------------------------------------------");
        System.out.println("error = " + error);
    }


    String getErrorPath() {
        return "/error";
    }
}
