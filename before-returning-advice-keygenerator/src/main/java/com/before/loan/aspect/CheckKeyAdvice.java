package com.before.loan.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class CheckKeyAdvice implements AfterReturningAdvice{
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		if((Integer)returnValue<=0) {
			throw new IllegalArgumentException("Invalid key/ length not supported");
		}
		
	}
}
