package com.around.advice.beans;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
	public int add(int a, int b) {
		System.out.println("add()");
		return a + b;
	}
	public int multiply(int a, int b) {
		System.out.println("sulyiply()");
		return a*b;
	}
	public int sub(int a, int b) {
		System.out.println("sub()");
		return a-b;
	}
}
