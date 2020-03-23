package com.java8;

import java.util.concurrent.ConcurrentHashMap;

public class MapIfApsent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcurrentHashMap<String, String> map=new ConcurrentHashMap<>();
		map.put("1", "A1");
		map.put("2", "A2");
		map.put("3", "A3");
		map.put("4", "A4");
		map.put("5", "A5");
		map.computeIfAbsent("10", x->F(x));
		System.out.println(map);
	}

	static String F(String x){
		return "SSSSS";
	}
}
