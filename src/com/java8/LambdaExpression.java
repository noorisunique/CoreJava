package com.java8;

public class LambdaExpression {

	public static void main(String[] args) {
		Runnable r=new Runnable(){
			public void run(){
				System.out.println("Runnable.....");
			}
		};
		
		Runnable r2=()->{
			System.out.println("Runnable..............");
		};
		
		
	}

}
