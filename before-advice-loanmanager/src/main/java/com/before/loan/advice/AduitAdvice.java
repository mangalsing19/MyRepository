package com.before.loan.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class AduitAdvice implements MethodBeforeAdvice {
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		String methodName = method.getName();
		System.out.println("Mangalsing called " + methodName + "() with arguments " + methodName + "(" + args[0] + ")");
	}
}
