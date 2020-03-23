package com.sapient;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MyTestMain2 {
	static List<String> list = new ArrayList<>();

	static void search(File file) {
		String fileName = "Noor.txt";

		if (file != null && file.isDirectory()) {
			if (file.canRead()) {
				for (File fileDetails : file.listFiles()) {
					if (fileDetails.isDirectory()) {
						search(fileDetails);
					} else {
						boolean isMatchFound = fileDetails.getName().matches(fileName);
						if (isMatchFound)
							list.add(fileDetails.getAbsolutePath().toString());
					}
				}
			}
		}
	}

	public static void main(String[] args) throws Exception {
		File file = new File("C://Users//SVT//Noor//");
		search(file);
		if (!list.isEmpty()) {
			for (String match : list) {
				System.out.println(match);
			}
		}
	}

}