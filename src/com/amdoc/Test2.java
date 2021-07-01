package com.amdoc;

public class Test2 {
	
	public static void foo(){
		try {
			throw new Exception();
		}catch (MyException e) {
			System.out.println("My");
		} 
		catch (Exception e) {
			System.out.println("Exception");
		}
	}
	public static void main(String[] args) {
		foo();

	}

}
class MyException extends Exception {}