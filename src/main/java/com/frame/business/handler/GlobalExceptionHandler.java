package com.frame.business.handler;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.frame.business.base.ResultBody;

/**
 * 统一异常处理类
 * 
 * @author liwen
 *
 */
@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(Exception.class)
	public ResultBody exceptionHandle(Exception e) { // 处理方法参数的异常类型
		return null;// 自己需要实现的异常处理
	}

	@ExceptionHandler(RuntimeException.class)
	public ResultBody handle(ApplicationException ex) {
		return null; // 自己需要实现的异常处理
	}

}