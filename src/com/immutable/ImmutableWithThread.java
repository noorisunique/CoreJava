package com.immutable;

import java.util.concurrent.ConcurrentHashMap;

class ImmutableLogin {
	private final String userName;
	private final String password;

	public ImmutableLogin(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

}

public class ImmutableWithThread {
	private final ConcurrentHashMap<String, ImmutableLogin> mapImmutableLogin = new ConcurrentHashMap<String, ImmutableLogin>();

	public void changeImmutableLogin() {
		mapImmutableLogin.compute("loginA", (String key, ImmutableLogin login) -> {
			return new ImmutableLogin(login.getUserName(), "newPassword");
		});
	}

	public static void main(String[] args) {
		ImmutableWithThread obj = new ImmutableWithThread();
		obj.changeImmutableLogin();
	}
}
