package com.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachExMap {

	public static void main(String[] args) {

		Map<String, Integer> map=new HashMap<>();
		map.put("A1", 10);
		map.put("A2", 11);
		map.put("A3", 12);
		map.put("A4", 13);
		

		map.forEach((k,v)->System.out.println(k));
	}
}
