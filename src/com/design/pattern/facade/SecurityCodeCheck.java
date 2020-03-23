package com.design.pattern.facade;

public class SecurityCodeCheck {
	private int securitycode;

	public int getSecurityCode() {
		return securitycode;
	}

	public boolean isCodeCurrect(int secCodeToChack) {
		if (secCodeToChack == getSecurityCode())
			return true;
		else
			return false;
	}
}
