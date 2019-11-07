package com.liuhongyin.mybatispluslearn.exception;

import com.liuhongyin.mybatispluslearn.common.api.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.stream.Collectors;

/**
 * @author ：liuhongyin.
 * @date ：Created in 9:38 AM 11/5/2019
 */
@ControllerAdvice
@ResponseBody
@Slf4j
public class CustomGlobalExceptionHandle {

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public CommonResult handleMethodArgumentNotValidException(MethodArgumentNotValidException exception) {
        log.error("handleMethodArgumentNotValidException", exception);
        String errorInfo = "MethodArgumentNotValidException: " +
                exception.getBindingResult().getFieldErrors()
                        .stream()
                        .map(DefaultMessageSourceResolvable::getDefaultMessage)
                        .collect(Collectors.joining(","));

        return CommonResult.validateFailed(errorInfo);
    }


    @ExceptionHandler(value = NullPointerException.class)
    public CommonResult handleNullPointerException(NullPointerException exception) {
        log.error("handleNullPointerException", exception);
        String errorInfo = "NullPointerException";

        return CommonResult.failed(errorInfo);
    }

    @ExceptionHandler(value = BadSqlGrammarException.class)
    public CommonResult handleBadSqlGrammarException(BadSqlGrammarException exception) {
        log.error("handleBadSqlGrammarException", exception);
        String errorInfo = "BadSqlGrammarException";

        return CommonResult.failed(errorInfo);
    }
    @ExceptionHandler(value = Exception.class)
    public CommonResult handleException(Exception exception) {
        log.error("handleException", exception);
        String errorInfo = "Exception: " + exception.getLocalizedMessage();

        return CommonResult.failed(errorInfo);
    }
}