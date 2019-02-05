package com.FindDublicate;

import java.util.HashMap;
import java.util.Map;

public class MaxRepeatedChar {
	public static void main(String[] args) {
		String s = "klaskalskalks";
		char value=0;
		int max=0;
		char ars[] = s.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (char c : ars) {
			int counter=1;
			if (map.get(c) != null) {
				counter++;
				map.put(c, 1 + map.get(c));
			} else
				map.put(c, 1);
			if(counter>max) {
				max=counter;
			
			}
		}
		//map.forEach((k, v) -> System.out.println(k + " " + v));
		
		System.out.println(max);
	}
}
