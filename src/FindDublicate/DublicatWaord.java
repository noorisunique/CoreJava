package com.FindDublicate;

import java.util.HashMap;
import java.util.Map;

public class DublicatWaord {

	public static void main(String[] args) {

		String s1 = "Noor hi Noor hi noor noor noor";
		String ar[] = s1.split(" ");
		Map<String, Integer> map = new HashMap<>();
		for (String string : ar) {
			if (map.get(string) != null)
				map.put(string, 1+map.get(string));
			else
				map.put(string, 1);
		}

		map.forEach((k, v) -> System.out.println(k + " " + v));

	}
}
