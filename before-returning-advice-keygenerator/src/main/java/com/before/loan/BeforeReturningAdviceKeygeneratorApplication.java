package com.before.loan;

import org.springframework.aop.framework.ProxyFactory;

import com.before.loan.aspect.CheckKeyAdvice;
import com.before.loan.target.KeyGenerator;

public class BeforeReturningAdviceKeygeneratorApplication {

	public static void main(String[] args) {
		ProxyFactory factory = new ProxyFactory();
		factory.addAdvice(new CheckKeyAdvice());
		factory.setTarget(new KeyGenerator());
		KeyGenerator generator = (KeyGenerator)factory.getProxy();
		int key = generator.generateKey(8);
		System.out.println("Key :" +key);
		key = generator.generateKey(0);
		System.out.println("Key :" +key);
	}

}
