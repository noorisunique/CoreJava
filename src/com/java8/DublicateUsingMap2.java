package com.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DublicateUsingMap2 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("Company1", "item1,itme2");
		map.put("Company2", "item1,itme2");
		map.put("Company3", "item3,itme2");
		map.put("Company4", "item3,itme2");
		map.put("Company5", "item4,itme2");
		map.put("Company6", "item5,itme2");

		Map<String, Integer> map1 = new HashMap<>();
		map.entrySet().stream().forEach(e -> {
			for (String string : e.getValue().split(",")) {
				if (map1.get(string) != null) {
					map1.put(string, map1.get(string) + 1);
				} else {
					map1.put(string, 1);
				}
			}
		});
		System.out.println(map1);

	}

}
