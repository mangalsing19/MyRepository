package com.around.advice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.around.advice.beans.Calculator;

@SpringBootApplication
public class AroundAdiceApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(AroundAdiceApplication.class, args);
		Calculator calculator = applicationContext.getBean(Calculator.class);
		int result = calculator.add(10, 20);
		System.out.println(result);
	}

}
