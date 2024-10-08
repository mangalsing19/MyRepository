package com.after.returning.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CheckKeyAspect {
	
	@AfterReturning(value = "within(com.after.returning.bean.*)" , returning = "ret")
	public void validate(JoinPoint joinPoint , Object ret) {
		if((Integer)ret<=0) {
			throw new IllegalArgumentException("Invalid key/length not supported");
		}
	}

}
