package com.java8.Optional.ifelse;

public class MapAndFilter {

	public static void main(String[] args) {
		UserDictionary userDictionary = new UserDictionary();
		for (int i = 0; i < 3; i++) {
			userDictionary.getUserByNumber(i).filter(x->x=="Noor")
					.ifPresent(name -> System.out.println("Name is " + name));
		}
	}
}