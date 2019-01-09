package com.singleton;

public class DraconianSingleton {
	private DraconianSingleton() {
	}

	private static DraconianSingleton instance;

	public static synchronized DraconianSingleton getInstance() {
		if (instance == null) {
			instance = new DraconianSingleton();
		}
		return instance;
	}

	// private constructor and other methods ...
}