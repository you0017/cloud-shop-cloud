package com.yc.handler;


import com.yc.model.JsonModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理器，处理项目中抛出的业务异常
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    /**
     * 捕获业务异常
     * @param ex
     * @return
     */
    @ExceptionHandler
    public JsonModel exceptionHandler(Exception ex){
        log.error("异常信息：{}", ex.getMessage());
        return JsonModel.error(ex.getMessage());
    }
}
