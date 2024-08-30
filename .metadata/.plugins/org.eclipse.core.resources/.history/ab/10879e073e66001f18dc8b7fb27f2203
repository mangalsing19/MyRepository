package com.thro.advice.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ExceptionLoggerAdvice {
	@AfterThrowing(value = "target(com.thro.advice.bean.Thrower)", throwing = "argumentException")
	public void log(JoinPoint joinPoint , IllegalArgumentException argumentException) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("Exception raise in "+methodName);
	}
}
