package com.java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForEachForIterableInterface {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);

		// Old way
		System.out.println("Normal Loop");
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("ForEach Loop");
		// java 8
		list.forEach(new Consumer<Integer>(){
			public void accept(Integer i){
				System.out.println(i);
			}
		});
		System.out.println("ForEach with class");
		// Java 8
		MyConsumer cn = new MyConsumer();
		list.forEach(cn);
	}

}

class MyConsumer implements Consumer<Integer>{
	public void accept(Integer i){
		System.out.println(i);
	}
}