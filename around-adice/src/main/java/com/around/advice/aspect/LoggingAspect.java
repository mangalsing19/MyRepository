package com.around.advice.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
	@Around("execution(* com.around.advice.beans..*(..))")
	public Object log(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		Object[] args = proceedingJoinPoint.getArgs();
		String methodName = proceedingJoinPoint.getSignature().getName();
		Object ret = null;
		System.out.println("Enter into the method :"+methodName + " ( "+args[0] + ", " + args[1] +" )");
		ret = proceedingJoinPoint.proceed();
		System.out.println("Exit from method "+methodName + " and return values is "+ret);
		return ret;
	}
}
