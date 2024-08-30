package com.before.advice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.before.advice.beans.LoanManager;

@SpringBootApplication
public class BeforeAdviceApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(BeforeAdviceApplication.class, args);
		LoanManager loanManager = applicationContext.getBean(LoanManager.class);
		loanManager.approveLoan(1000);
	}

}
