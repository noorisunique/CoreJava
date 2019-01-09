package com.enumEx;

import java.util.Scanner;

//An Enum class 
enum Day {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

// Driver class that contains an object of "day" and
// main().
public class Test3 {
	Day day;

	// Constructor
	public Test3(Day day) {
		this.day = day;
	}

	// Prints a line about Day using switch
	public void dayIsLike() {
		switch (day) {
		case MONDAY:
			System.out.println("Mondays are bad.");
			break;
		case FRIDAY:
			System.out.println("Fridays are better.");
			break;
		case SATURDAY:
		case SUNDAY:
			System.out.println("Weekends are best.");
			break;
		default:
			System.out.println("Midweek days are so-so.");
			break;
		}
	}

	// Driver method
	public static void main(String[] args) {
		String str = "FRIDAY";
		Test3 t1 = new Test3(Day.valueOf(str));
		for(Day s:Day.values()){
			System.out.println(s);
		}
		
		t1.dayIsLike();
	}
}