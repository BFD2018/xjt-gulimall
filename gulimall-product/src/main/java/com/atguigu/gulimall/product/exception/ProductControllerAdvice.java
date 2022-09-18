package com.atguigu.gulimall.product.exception;

import com.atguigu.common.exception.BizCodeEnum;
import com.atguigu.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@Slf4j
//@ControllerAdvice("com.atguigu.gulimall.product.controller")    //标注这个controller下的所有异常都由它处理
//@ResponseBody
@RestControllerAdvice("com.atguigu.gulimall.product.controller")    //替代上面两个注解
public class ProductControllerAdvice {
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R handleValidException(MethodArgumentNotValidException e){
        log.error("数据校验出现问题{}，异常类型：{}", e.getMessage(), e.getClass());
        BindingResult bindingResult = e.getBindingResult();

        Map<String, String> errorMap = new HashMap<>();
        bindingResult.getFieldErrors().forEach((fieldError) -> {
            errorMap.put(fieldError.getField(), fieldError.getDefaultMessage());
        });
        return R.error(BizCodeEnum.VALID_EXCEPTION.getCode(), BizCodeEnum.VALID_EXCEPTION.getMsg()).put("data", errorMap);
    }

    //其他未知异常都交给它处理
    @ExceptionHandler(value = Exception.class)
    public R handleException(Exception e){
        log.error("product模块controller层出现问题{}，异常类型：{}", e.getMessage(), e.getClass());

        Map<String, String> errorMap = new HashMap<>();
        errorMap.put("异常信息",e.getMessage());
        errorMap.put("异常类型",e.getClass().toString());

        return R.error(BizCodeEnum.UNKNOW_EXCEPTION.getCode(), BizCodeEnum.UNKNOW_EXCEPTION.getMsg()).put("data", errorMap);
    }
}
