package com.design.pattern.facade;

public class AccountNumberCheck {
	private int accountNumber = 1234567;

	public int getAccountNumber() {
		return accountNumber;
	}

	public boolean accountActive(int accNumberToChack) {
		if (accNumberToChack == getAccountNumber())
			return true;
		else
			return false;
	}
}
