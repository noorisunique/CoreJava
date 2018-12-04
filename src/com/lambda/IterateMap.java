package com.lambda;

import java.util.HashMap;
import java.util.Map;

public class IterateMap {

	public static void main(String[] args) {
		Map<String,Integer> list=new HashMap<>();
		list.put("A1", 1);
		list.put("A2", 1);
		list.put("A3", 1);
		list.put("A4", 1);
		list.forEach((k,v)->System.out.println(v));
	}
}
