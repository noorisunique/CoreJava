package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class ConsumerImpl implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		System.out.println(t);
	}
}

public class ConsumerFunctionExample2 {
	public static void main(String args[]) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6);
		Consumer<Integer> c=new ConsumerImpl();
		list.forEach(c);
	}
}