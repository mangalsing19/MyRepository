package com.example.aspect;

import org.springframework.aop.ThrowsAdvice;

public class ExceptionLoggerAdvice implements ThrowsAdvice{
	public void afterThrowing(Exception e) {
		System.out.println(e.getMessage());
	}
}
