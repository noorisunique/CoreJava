package com.design.pattern;

//converts the interface of a class into another interface that a client wants
//https://www.javatpoint.com/adapter-pattern
//Target interface
interface CreditCard {
	public void giveBankDetails();

	public String getCreditCard();
}

// Adaptee class
class BankDetails {
	private String bankName;
	private String accountHolderName;
	private long accNumber;

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public long getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(long accNumber) {
		this.accNumber = accNumber;
	}

}

// Adapter class

class BankCustomer extends BankDetails implements CreditCard {

	@Override
	public void giveBankDetails() {
		String bankName = "DENA BANK";
		String accountHolderName = "Noor";
		long accNumber = 12344;
		setBankName(bankName);
		setAccountHolderName(accountHolderName);
		setAccNumber(accNumber);
	}

	@Override
	public String getCreditCard() {
		long accno = getAccNumber();
		String accholdername = getAccountHolderName();
		String bname = getBankName();
		return ("The Account number " + accno + " of " + accholdername + " in " + bname
				+ "bank is valid and authenticated for issuing the credit card. ");
	}

}

public class AdapterPattern {
	public static void main(String[] args) {
		CreditCard targetInterface=new BankCustomer();
		targetInterface.giveBankDetails();
		System.out.println(targetInterface.getCreditCard());
	}
}
