package com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
//https://dzone.com/articles/the-executor-framework
class MyClass implements Runnable{
	public void run(){
		System.out.println("Running.....");
	}
}
class MyClass1 implements  Callable{
	@Override
	public Object call() throws Exception {
		System.out.println("Callable....");
		return null;
	}
}

public class ExecutorServiceEx {

	public static void main(String[] args) {
		//Old way
		Thread t=new Thread(new MyClass());
		t.start();
		
		//new way
		ExecutorService executor = Executors.newScheduledThreadPool(10);
		executor.submit(new MyClass1());
		executor.execute(new MyClass());
		executor.shutdown();
		
	}

}
