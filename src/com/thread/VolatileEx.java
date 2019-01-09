package com.thread;

//volatile is thread safe , Thread safe means that a method or class instance can be used by multiple threads 
//at the same time without any problem.
public class VolatileEx {

}

class SharedObj1 {
	// Changes made to sharedVar in one thread
	// may not immediately reflect in other thread
	static int sharedVar = 6;
}

class SharedObj {
	// volatile keyword here makes sure that
	// the changes made in one thread are
	// immediately reflect in other thread
	static volatile int sharedVar = 6;
}

//https://www.geeksforgeeks.org/volatile-keyword-in-java/