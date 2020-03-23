package com.design.pattern.facade;

public class BankAccountFacade {

	private int accountNumber;
	private int securityCode;

	AccountNumberCheck acctChecker;
	SecurityCodeCheck secCodeChecker;
	FundsCheck fundChecker;

	WelcomeToBank welcomeToBank;

	public BankAccountFacade(int accountNumber, int securityCode) {
		this.accountNumber = accountNumber;
		this.secCodeChecker = secCodeChecker;

		welcomeToBank = new WelcomeToBank();
		acctChecker = new AccountNumberCheck();
		secCodeChecker = new SecurityCodeCheck();
		fundChecker = new FundsCheck();
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public int getSecuritycode() {
		return securityCode;
	}

	public void withdrawCash(double cashToGet) {
		if (acctChecker.accountActive(getAccountNumber()) && secCodeChecker.isCodeCurrect(getSecuritycode())
				&& fundChecker.haveEnoughMoney(cashToGet)) {
			System.out.println("Transaction complete");
		} else {
			System.out.println("Transaction failed");
		}
	}

	public void depositeCash(double cashToDeposite) {
		if (acctChecker.accountActive(getAccountNumber()) && secCodeChecker.isCodeCurrect(getSecuritycode())
				&& fundChecker.haveEnoughMoney(cashToDeposite)) {
			System.out.println("Transaction complete");
		} else {
			System.out.println("Transaction failed");
		}
	}
}