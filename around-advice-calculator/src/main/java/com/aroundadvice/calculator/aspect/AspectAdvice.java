package com.aroundadvice.calculator.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AspectAdvice implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		String methodName = invocation.getMethod().getName();
		Object[] args = invocation.getArguments();
		Object ret;
		System.out.print("Enter into the method " + methodName + "(");
		for (int i = 0; i < args.length; i++) {
			if (i == 0) {
				System.out.print(args[i]);
				continue;
			}
			System.out.print("," + args[i]);
		}
		System.out.println(")");
		System.out.println("Modifying the arguments");
		args[0] = (Integer) args[0] + 10;
		args[1] = (Integer) args[1] + 10;
		ret = invocation.proceed();
		System.out.println("Exit from the method "+ methodName +" and return value " +ret);
		
		System.out.println("Modifying the return values ");
		ret = (Integer)ret + 10;
		return ret;
	}
}
