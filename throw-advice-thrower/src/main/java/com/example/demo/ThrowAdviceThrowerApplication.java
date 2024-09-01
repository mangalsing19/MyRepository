package com.example.demo;

import org.springframework.aop.framework.ProxyFactory;

import com.example.aspect.ExceptionLoggerAdvice;
import com.example.demo.target.Thrower;

public class ThrowAdviceThrowerApplication {

	public static void main(String[] args) {
		
		ProxyFactory factory = new ProxyFactory();
		factory.addAdvice(new ExceptionLoggerAdvice());
		factory.setTarget(new Thrower());
		Thrower thrower = (Thrower) factory.getProxy();
		int i = thrower.willThrow(10);
		System.out.println(i);
		int b = thrower.willThrow(-1);
		System.out.println(b);
	}

}
