package com.interfaceex;

interface I3 {

	public Integer amount = 1000;

}

public class InterfaceVariableChange implements I3 {
	
	public  InterfaceVariableChange() {
		amount=2000;

	}

	public static void main(String[] args) {
		InterfaceVariableChange m1 = new InterfaceVariableChange();
		
	}

}
