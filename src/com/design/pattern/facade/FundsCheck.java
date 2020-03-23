package com.design.pattern.facade;

public class FundsCheck {

	private double cashInAccount = 1000.00;

	public double getCashAccount() {
		return cashInAccount;
	}

	public void decreaseCashInAccount(double cashwithdrawn) {
		cashInAccount -= cashwithdrawn;
	}

	public void IncreaseCashInAccount(double cashDeposite) {
		cashInAccount -= cashDeposite;
	}

	public boolean haveEnoughMoney(double cashToWithdrawal) {
		if (cashToWithdrawal > getCashAccount()) {
			System.out.println("Error: you dont have enough maney ");
			System.out.println("Current Balance: " + getCashAccount());

			return false;
		} else {
			decreaseCashInAccount(cashToWithdrawal);
			System.out.println("Withdraw completed: Current Balance is " + getCashAccount());
			return true;
		}

	}

	public void makeDeposite(double cashToDeposite) {
		IncreaseCashInAccount(cashToDeposite);
		System.out.println("Deposi completed: Current Balance is " + getCashAccount());

	}
}
