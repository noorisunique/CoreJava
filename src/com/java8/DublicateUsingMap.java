package com.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class DublicateUsingMap {

	public static void main(String[] args) {
		Map<String, String> ordersMap = new HashMap<>();

		ordersMap.put("customer1", "Item1");

		ordersMap.put("customer1", "Item7");

		ordersMap.put("customer2", "Item1,Item2,Item7");

		ordersMap.put("customer3", "Item7,Item2,Item3");

		ordersMap.put("customer2", "Item7,Item2");

		System.out.println(ordersMap);

		Map<String, Integer> map = new HashMap<>();
		ordersMap.entrySet().stream().forEach(e -> {
			for (String string : e.getValue().split(",")) {
				if (map.get(string) != null)
					map.put(string, map.get(string) + 1);
				else
					map.put(string, 1);
			}

		});

		System.out.println(map);

	}

}
