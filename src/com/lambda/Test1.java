package com.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Emp1 {
	private int eid;
	private String name;

	Emp1(int eid, String name) {
		this.eid = eid;
		this.name = name;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class Test1 {
	public static void main(String[] args) {
	
		Map<String, Integer> map=new HashMap<>();
		map.put("A3", 3);
		map.put("A1", 1);
		map.put("A3", 3);
		map.put("A2", 2);
		
		Map res=map.entrySet().stream()
				.sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey,(o,n)->o,Hashtable::new));
		
		
		
	}
}
