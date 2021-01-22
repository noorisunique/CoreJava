package com.design.pattern;

public class SingletoenBcPresenceServiceToFormerBlSenderFactory {
	/**
	 * the singleton instance 
	 */
	private static SingletoenBcPresenceServiceToFormerBlSenderFactory _instance;
	/**
	 * private constructor
	 */
	private SingletoenBcPresenceServiceToFormerBlSenderFactory(){
		super();
	}
	/**
	 * get the singleton instance 
	 * 
	 * @return the singleton instance
	 */
	public static SingletoenBcPresenceServiceToFormerBlSenderFactory getInstance(){
		if (_instance != null){
			return _instance;
		}
		synchronized (SingletoenBcPresenceServiceToFormerBlSenderFactory.class) {
			if (_instance == null){
				_instance = new SingletoenBcPresenceServiceToFormerBlSenderFactory();
			}
			return _instance;
		}
	}

	public static void main(String[] args) {
		

	}

}
