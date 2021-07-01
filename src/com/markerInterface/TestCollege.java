package com.markerInterface;

interface AGradeCollegeMarker {

}

class College1 implements AGradeCollegeMarker {
	// Do something
}

class College2 {
	// Do something
}

public class TestCollege {
	static void tester(Object obj) {
		if (obj instanceof AGradeCollegeMarker) {
			System.out.println("A grade college.");
		}
	}

	public static void main(String args[]) {
		College1 obj1 = new College1();
		College2 obj2 = new College2();

		// test college objects
		tester(obj1);
		tester(obj2);
	}
}