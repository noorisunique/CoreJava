package com.lambda;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMap {

	public static void main(String[] args) {
		Map<String,Integer> list=new HashMap<>();
		list.put("A1", 1);
		list.put("A2", 1);
		list.put("A3", 1);
		list.put("A4", 1);
		Map result=list.entrySet().stream()
				.sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(Old,New)->Old,LinkedHashMap::new));
				
		list.forEach((k,v)->System.out.println(v));
		
		Map r1=list.entrySet().stream()
				.sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(Old,New)->Old,LinkedHashMap::new));
		
	}
}
