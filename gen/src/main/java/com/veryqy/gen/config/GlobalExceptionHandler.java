package com.veryqy.gen.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * swagger异常处理
 */
@Slf4j
@ControllerAdvice
@ConditionalOnWebApplication
public class GlobalExceptionHandler {

    @ExceptionHandler(value = {RuntimeException.class})
    @ResponseBody
    public ResponseEntity runtimeExceptionHandler(HttpServletRequest req, HttpServletResponse response, RuntimeException e) {
        log.error("runtimeExceptionHandler",e);
        response.setHeader("Access-Control-Expose-Headers", "Content-Disposition,message");
        try {
            return ResponseEntity.badRequest().header("message", URLEncoder.encode(e.getMessage(), "UTF-8")).build();
        } catch (UnsupportedEncodingException e1) {
            e1.printStackTrace();
            log.error("",e1);
        }
        return ResponseEntity.badRequest().build();
    }
}
