package com.aroundadvice.cache;

import org.springframework.aop.framework.ProxyFactory;

import com.aroundadvice.cache.aspect.CacheAdvice;
import com.aroundadvice.cache.target.Calculator;

public class AroundAdviceCalculatorCacheApplication {

	public static void main(String[] args) {
		ProxyFactory factory = new ProxyFactory();
		factory.addAdvice(new CacheAdvice());
		factory.setTarget(new Calculator());

		Calculator calculator = (Calculator) factory.getProxy();
		System.out.println("Sum :" + calculator.add(10, 20));
		System.out.println("Sum :" + calculator.add(10, 20));
		System.out.println("Sum :" + calculator.add(30, 40));
		;
	}

}
