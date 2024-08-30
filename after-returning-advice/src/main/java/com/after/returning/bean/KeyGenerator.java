package com.after.returning.bean;

import org.springframework.stereotype.Component;

@Component
public class KeyGenerator {
	public int keyGenerator(int key) {
		if(key < 8) {
			return 0;
		}
		return 1;
	}
}
