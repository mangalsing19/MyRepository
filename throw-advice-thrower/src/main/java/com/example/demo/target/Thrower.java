package com.example.demo.target;

import java.util.Random;

public class Thrower {

	public int willThrow(int i) {
		if (i < 0) {
			throw new IllegalArgumentException("Invalid parameter");
		}
		return new Random().nextInt();
	}
}
