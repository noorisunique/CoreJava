package com.java8.map.merge;

import java.util.HashMap;

public class GFG {

	public static void main(String[] args) {
		// create a HashMap and add some values
		HashMap<Integer, String> map1 = new HashMap<>();
		map1.put(1, "L");
		map1.put(2, "M");
		map1.put(3, "N");

		HashMap<Integer, String> map2 = new HashMap<>();
		map2.put(1, "B");
		map2.put(2, "G");
		map2.put(3, "R");

		System.out.println(map1.toString() + "  Map1-------------");
		System.out.println(map2.toString() + "  Map2-------------");

		map2.forEach((key, value) -> map1.merge(key, value, (v1, v2) -> v1.equalsIgnoreCase(v2) ? v1 : v1 + " " + v2));

		System.out.println(map1);
	}

}
