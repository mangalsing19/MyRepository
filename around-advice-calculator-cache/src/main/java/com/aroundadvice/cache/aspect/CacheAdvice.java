package com.aroundadvice.cache.aspect;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import com.aroundadvice.cache.helper.Cache;

public class CacheAdvice implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object[] args = invocation.getArguments();
		Method method = null;
		Object ret = null;
		Cache cache = Cache.getInstance();
		String methodName = invocation.getMethod().getName();
		String key = buildKey(methodName, args);
		method = invocation.getMethod();
		String methodSignature = getMethodSignature(method);
		System.out.println("Method Invoke with Value:" + key);
		System.out.println("Signature of methid is : " + methodSignature);
		Map<String, Integer> methodMap = null;
		if (cache.contains(methodSignature) == true) {
			methodMap = (Map<String, Integer>) cache.get(methodSignature);
			if (methodMap.containsValue(key)) {
				return methodMap.get(key);
			}
		}

		ret = (Integer) invocation.proceed();
		if (methodMap == null) {
			methodMap = new HashMap<>();
			methodMap.put(key, (Integer) ret);
			cache.put(methodSignature, methodMap);
		}

		return ret;
	}

	private String getMethodSignature(Method method) {
		StringBuilder key = null;
		key = new StringBuilder();
		Class<?>[] clazz = method.getParameterTypes();
		key.append(method.getName()).append("(");
		for (int i = 0; i < clazz.length; i++) {
			if (i == 0) {
				key.append(clazz[i]);
				continue;
			}
			key.append(",").append(clazz[i]);
		}
		key.append(")");
		return key.toString();
	}

	private String buildKey(String methodName, Object[] args) {
		StringBuilder key = null;
		key = new StringBuilder();
		key.append(methodName).append("(");
		for (int i = 0; i < args.length; i++) {
			if (i == 0) {
				key.append(args[i]);
				continue;
			}
			key.append(",").append(args[i]);
		}
		key.append(")");
		return key.toString();
	}
}
