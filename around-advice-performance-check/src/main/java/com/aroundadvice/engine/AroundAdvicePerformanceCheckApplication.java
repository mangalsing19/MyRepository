package com.aroundadvice.engine;

import org.springframework.aop.framework.ProxyFactory;

import com.aroundadvice.engine.aspect.PerformanceCheckAdvice;
import com.aroundadvice.engine.target.Engine;

public class AroundAdvicePerformanceCheckApplication {

	public static void main(String[] args) {
		ProxyFactory factory = new ProxyFactory();
		factory.addAdvice(new PerformanceCheckAdvice());
		factory.setTarget(new Engine());
		Engine engine= (Engine)factory.getProxy();
		int status = engine.start();
		if(status==1) {
			System.out.println("Engine Started");
		} else {
			System.out.println("Engine fail");
		}
	}

}
