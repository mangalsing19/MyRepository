package com.after.returning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.after.returning.bean.KeyGenerator;

@SpringBootApplication
public class AfterReturningAdviceApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(AfterReturningAdviceApplication.class, args);
		KeyGenerator keyGenerator = applicationContext.getBean(KeyGenerator.class);
		int keyGenerator2 = keyGenerator.keyGenerator(9);
		System.out.println(keyGenerator2);
	}

}
