package com.pointcut.aroundadvice.pointcut;

import java.lang.reflect.Method;
import java.util.Calendar;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

public class LoggingPointcut extends StaticMethodMatcherPointcut {
	@Override
	public boolean matches(Method method, Class<?> targetClass) {
		if (targetClass == Calendar.class || method.getName().equals("add") || method.getName().equals("multiply")) {
			return true;
		}
		return false;
	}
}

