package com.pointcut.aroundadvice.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAdvice implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		String methodName = invocation.getMethod().getName();
		Object[] args = invocation.getArguments();
		Object ret = null;
		System.out.print("Entering into the method " + methodName + "(");
		for (int i = 0; i < args.length; i++) {
			if (i == 0) {
				System.out.print(args[i]);
				continue;
			}
			System.out.print("," + args[i]);
		}
		System.out.println(")");
		ret = invocation.proceed();
		System.out.println("Existing from method " + methodName + " and return value is " + ret);
		return ret;
	}
}
