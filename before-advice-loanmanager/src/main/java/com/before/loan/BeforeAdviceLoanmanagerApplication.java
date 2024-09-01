package com.before.loan;

import org.springframework.aop.framework.ProxyFactory;

import com.before.loan.advice.AduitAdvice;
import com.before.loan.target.LoanManager;


public class BeforeAdviceLoanmanagerApplication {

	public static void main(String[] args) {
		ProxyFactory factory = new ProxyFactory();
		factory.addAdvice(new AduitAdvice());
		factory.setTarget(new LoanManager());
		LoanManager loanManager=(LoanManager)factory.getProxy();
		System.out.println(loanManager.approveLoan(100));
	}
}
