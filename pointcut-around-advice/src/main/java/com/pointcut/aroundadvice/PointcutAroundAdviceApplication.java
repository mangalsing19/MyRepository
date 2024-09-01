package com.pointcut.aroundadvice;

import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

import com.pointcut.aroundadvice.aspect.LoggingAdvice;
import com.pointcut.aroundadvice.pointcut.LoggingPointcut;
import com.pointcut.aroundadvice.target.Calculator;

public class PointcutAroundAdviceApplication {

	public static void main(String[] args) {
		ProxyFactory factory = new ProxyFactory();
		factory.setTarget(new Calculator());
		Advisor advisor = new DefaultPointcutAdvisor(new LoggingPointcut(), new LoggingAdvice());
		factory.addAdvisor(advisor);
		Calculator calculator = (Calculator)factory.getProxy();
		System.out.println(calculator.add(10, 20));
		System.out.println("-------------------------------");
		System.out.println(calculator.div(60, 20));
		System.out.println("-------------------------------");
		System.out.println(calculator.multiply(10, 20));
	}

}
