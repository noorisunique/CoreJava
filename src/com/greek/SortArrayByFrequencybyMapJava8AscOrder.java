//Sort the elements of an array by number of times they repeated in ascending order.
//https://self-learning-java-tutorial.blogspot.com/2014/08/sort-elements-by-frequency.html
package com.greek;

import java.util.*;
import java.util.stream.Collectors;

public class SortArrayByFrequencybyMapJava8AscOrder {
	static void sortByFreq(int a[]) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i : a) {
			if (map.get(a[i]) != null) {

				map.put(a[i], map.get(a[i]) + 1);

			} else {
				map.put(a[i], 1);
			}
		}

		Map<Integer, Integer> result = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (o1, o2) -> o1, LinkedHashMap::new));

		int count = 0;

		/* Place the elements in to the array based on frequency */

		Iterator it = result.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();

			int key = (int) entry.getKey();
			int val = (int) entry.getValue();

			for (int i = 0; i < val; i++) {
				a[count] = key;
				count++;
			}
		}

	}

	public static void main(String args[]) {
		int a[] = { 1, 6, 5, 5, 3, 2, 1, 0, 5, 3, 2, 4, 1, 2, 3, 5, 4 };

		System.out.println("Before Sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		sortByFreq(a);

		System.out.println("\nAfter Sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
