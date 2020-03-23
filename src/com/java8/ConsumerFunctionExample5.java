package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerFunctionExample5 {
	public static void main(String args[]) {
		
		System.out.println("Simple Consumer");
		Consumer<Integer> display = p -> System.out.println(p);
		display.accept(10);

		// Modify List
		Consumer<List<Integer>> modify = list -> {
			for (int i = 0; i < list.size(); i++) {
				list.set(i, list.get(i) * 2);
			}
		};

		// Display List
		Consumer<List<Integer>> displayConsumer = list -> list.stream().forEach(
				m->{
					if(m==null){
						System.out.println("Empty");
					}else {
						System.out.println(m);
					}
				}
				);

		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);

		System.out.println("Consumer Using forEach");
		list.forEach(i -> System.out.println(i));
		

		System.out.println("Modifying Consumer Using ");
		modify.accept(list);
		displayConsumer.accept(list);
		
	}
}