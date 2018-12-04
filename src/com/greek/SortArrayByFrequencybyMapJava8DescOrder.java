//Sort the elements of an array by number of times they repeated in ascending order.
//https://self-learning-java-tutorial.blogspot.com/2014/08/sort-elements-by-frequency.html
package com.greek;

import java.util.*;
import java.util.stream.Collectors;

public class SortArrayByFrequencybyMapJava8DescOrder {
	static void sortByFreq(int a[]) {
		Map<Integer, Integer> map = new HashMap<>();

		/* Logic to place the elements to Map */
		for (int i = 0; i < a.length; i++) {
			if (map.get(a[i]) != null) {
				int frequency = map.get(a[i]);
				map.put(a[i], frequency + 1);

			} else {
				map.put(a[i], 1);
			}
		}

		Map<Integer, Integer> result = map.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (o1, o2) -> o1, LinkedHashMap::new));

		int count = 0;

		System.out.println(result);
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
		int a[] = { 2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12 };

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
