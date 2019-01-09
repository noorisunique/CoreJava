package com.wildGeneric;

import java.util.ArrayList;
import java.util.List;

public class WildOrWithout {
	public static void get(List<Number> list) {
		for(Number n:list){
			System.out.println(n);
		}
	}
	public static void put(List<? extends Number> list) {
		for(Number n:list){
			System.out.println(n);
		}
	}

	public static void main(String[] args) {
		List<Number> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(3.9);
		get(list);
		
		List<Integer> list2=new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		put(list2);
		
		
	}
}
