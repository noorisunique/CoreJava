package hackethon;

import java.util.*;

public class CommonElement {

	public static void main(String[] args) {

		int a[] = { 4, 1, 3, 1, 2, 5, 1, 3 };
		int b[] = { 9, 6, 8, 7, 6, 0, 2, 1 };

		Set<Integer> set1 = new HashSet<>();

		Set<Integer> set2 = new HashSet<>();

		for (int i : a) {
			set1.add(i);
		}

		for (int i : b) {
			set2.add(i);
		}

		set1.retainAll(set2);
		System.out.println(" Common val" + set1);
	}
}