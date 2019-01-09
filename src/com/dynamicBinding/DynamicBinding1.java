package com.dynamicBinding;

class ParentDemo {
	public void get() {
		System.out.println("Parent");
	}
}

class ChildDemo extends ParentDemo {
	public void get() {
		System.out.println("Child");
	}
	public void test(){
		System.out.println("Test");
	}
}

public class DynamicBinding1 {
	public static void main(String[] args) {
		ParentDemo pd = new ChildDemo();
		pd.get();
		ParentDemo pd1=null;
		pd1.get();
		//pd.test();  ->Error
	}
}
