package com.thro.advice.bean;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Thrower {
	public int willThrow(int i) {
		if(i < 0) {
			throw new IllegalArgumentException("Invalid Parameter");
		}
		return i + new Random().nextInt();
	}
}
