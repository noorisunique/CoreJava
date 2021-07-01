package com.collection.set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestExample {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		int array[] = { 3, 1, 2, 2, 1, 2, 3, 3 };// let’s take this one first
		for (Integer val : array) {
			if (map.get(val) != null)
				map.put(val, map.get(val) + 1);
			else
				map.put(val, 1);
		}
		System.out.println(map);
		List<Integer> list=new ArrayList<Integer>();
		int counter = 0;
		int inputNumber = 2;// this is K value we can insert using Scanner also
		for (Map.Entry<Integer, Integer> set : map.entrySet()) {
			if (set.getValue() > inputNumber) {
				list.add(set.getKey());

			}
		}
		System.out.println(list);
	}
}
