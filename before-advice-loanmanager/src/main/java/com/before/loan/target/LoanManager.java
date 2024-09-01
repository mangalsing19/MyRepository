package com.before.loan.target;

import java.util.Random;

public class LoanManager {
	
	public int approveLoan(int amout) {
		System.out.println("in approveLoan");
		return new Random().nextInt();
	}
}
