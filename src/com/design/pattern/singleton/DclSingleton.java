package com.singleton;

//https://www.baeldung.com/java-singleton-double-checked-locking\
//Singleton pattern is mostly used in multi-threaded and database applications. It is used in logging, 
//caching, thread pools, configuration settings etc
public class DclSingleton {
	private static volatile DclSingleton instance;// volatile is monadatory

	public static DclSingleton getInstance() {
		if (instance == null) {
			synchronized (DclSingleton.class) {
				if (instance == null) {
					instance = new DclSingleton();
				}
			}
		}
		return instance;
	}

	// private constructor and other methods...
}