package com.aroundadvice.cache.helper;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Cache {
	private static Cache instance;
	private Map<String, Object> dataMap;
	private Cache() {
		dataMap = new ConcurrentHashMap<>();
	}
	public static synchronized Cache getInstance() {
		if (instance == null) {
			System.out.println("Cache Object is created");
			instance = new Cache();
		}
		return instance;
	}

	public void put(String key, Object value) {
		System.out.println("Storing the data in cache");
		dataMap.put(key, value);
	}

	public Object get(String key) {
		System.out.println("Storing the data in Cache");
		return dataMap.get(key);
	}

	public boolean contains(String key) {
		System.out.println("Searching the datat in Cache");
		return dataMap.containsKey(key);
	}
}
