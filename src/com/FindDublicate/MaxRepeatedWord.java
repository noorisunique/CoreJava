package com.FindDublicate;

import java.util.HashMap;
import java.util.Map;

public class MaxRepeatedWord {

	public static void main(String[] args) {
		String s = "noor noor nor hi noor hi";
		String value=null;
		int max=0;
		String ars[] = s.split(" ");
		Map<String, Integer> map = new HashMap<>();
		for (String c : ars) {
			int counter=1;
			if (map.get(c) != null) {
				counter++;
				map.put(c, 1 + map.get(c));
			} else
				map.put(c, 1);
			if(counter>max) {
				max=counter;
				value=c;
			}
		}
		//map.forEach((k, v) -> System.out.println(k + " " + v));
		
		System.out.println(value);
	}
}
