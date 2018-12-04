package com.greek;

import java.util.HashMap;
import java.util.Map;

public class DublicateWord {

	public static void main(String[] args) {
		String str = "hi ji kk ll mm mm";

		String s[] = str.split(" ");

		Map<String, Integer> map = new HashMap<>();
		for (String string : s) {

			if (map.get(string) != null) {
				map.put(string, 1 + map.get(string));
			} else {
				map.put(string, 1);
			}
		}
		System.out.println(map);
	}

}
