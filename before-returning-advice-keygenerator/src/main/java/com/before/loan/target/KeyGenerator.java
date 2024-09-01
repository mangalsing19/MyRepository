package com.before.loan.target;

public class KeyGenerator {
	public int generateKey(int key) {
		if (key < 8) {
			return 0;
		}
		return 1;
	}
}
