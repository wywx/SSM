package com.jjzy.controller;

import com.jjzy.common.Result;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

/**
 * @Author wj
 * @Date 2019/10/28 21:46
 * Version 1.0
 */
@RestControllerAdvice
public class ExcationController {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result DataCheckExceptionHandl(MethodArgumentNotValidException ex){
        String message = ex.getBindingResult().getFieldErrors().get(0).getDefaultMessage();
        return new Result(message);
    }

    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public Result MaxUploadSizeExceededExceptionHandle(MaxUploadSizeExceededException ex){

        return new Result("文件大小超过限制");
    }
}
