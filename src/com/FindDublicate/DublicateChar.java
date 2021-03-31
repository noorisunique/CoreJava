package com.FindDublicate;

import java.util.HashMap;
import java.util.Map;

public class DublicateChar {
	public static void main(String[] args) {
		String s = "noorkllklklllllll";
		char sarr[] = s.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (char c : sarr) {
			if (map.get(c) != null)
				map.put(c, 1 + map.get(c));
			else
				map.put(c, 1);
		}
		map.forEach((k, v) -> {
			
		System.out.println(k + " " + v);});
	}
}
