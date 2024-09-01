package com.aroundadvice.engine.aspect;

import java.util.Calendar;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class PerformanceCheckAdvice implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		String methodName = invocation.getMethod().getName();
		long startTime = Calendar.getInstance().getTimeInMillis();
		//Thread.sleep(100000);
		Object ret = invocation.proceed();
		long endTime = Calendar.getInstance().getTimeInMillis();
		System.out.println(methodName + "() take " + (endTime - startTime) + " Milli Second");
		return ret;
	}
}
