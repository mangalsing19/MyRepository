package com.aroundadvice.calculator;

import org.springframework.aop.framework.ProxyFactory;

import com.aroundadvice.calculator.aspect.AspectAdvice;
import com.aroundadvice.calculator.target.Calculator;

public class AroundAdviceCalculatorApplication {

	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.addAdvice(new AspectAdvice());
		pf.setTarget(new Calculator());
		Calculator cal= (Calculator) pf.getProxy();
		int result = cal.add(10, 10);
		System.out.println("final result :" + result);
	}

}
