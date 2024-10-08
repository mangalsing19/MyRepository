package com.thro.advice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.thro.advice.bean.Thrower;

@SpringBootApplication
public class ThrowAdvice {
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ThrowAdvice.class, args);
		Thrower thrower = applicationContext.getBean(Thrower.class);
		int results = thrower.willThrow(-1);
		System.out.println(results);
	}
}
