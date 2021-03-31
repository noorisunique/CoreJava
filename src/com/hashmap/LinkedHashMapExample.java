package com.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapExample {
	public static void main(String[] args) {
		// Maintain Insertion order
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put("One1", "Noor1");
		map.put("One2", "Noor2");
		map.put("One3", "Noor3");
		map.put("One4", "Noor4");
		map.put("One5", "Noor5");
		map.put("One5", "fdfdf");
		System.out.println(map);

		/// Not Maintain Insertion order
		Map<String, String> hashMap = new HashMap<>();
		hashMap.put("One1", "Noor1");
		hashMap.put("One2", "Noor2");
		hashMap.put("One3", "Noor3");
		hashMap.put("One4", "Noor4");
		hashMap.put("One5", "Noor5");
		hashMap.put("One5", "fdfdf");
		System.out.println(hashMap);

	}
}
