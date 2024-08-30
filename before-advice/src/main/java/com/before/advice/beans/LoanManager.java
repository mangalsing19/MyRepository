package com.before.advice.beans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class LoanManager {
	public boolean approveLoan(int amount) {
		System.out.println("inside approve loan");
		return new Random().nextBoolean();
	}
}
