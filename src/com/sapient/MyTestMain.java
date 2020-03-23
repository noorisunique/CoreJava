package com.sapient;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MyTestMain {

	private final String pattern = ".*o.*.txt";
	static ArrayList<String> result = new ArrayList<String>();

	void search(File file) {

		if (file != null && file.isDirectory()) {

			System.out.println("Searching directory ... " + file.getAbsoluteFile());
			if (file.canRead()) {
				for (File fileDetails : file.listFiles()) {
					if (fileDetails.isDirectory()) {
						search(fileDetails);
					} else {
						boolean isMatchFound = fileDetails.getName().matches(pattern);
						if (isMatchFound) {
							result.add(fileDetails.getAbsoluteFile().toString());
						}
					}
				}

			} else {
				System.out.println(file.getAbsoluteFile() + "Permission Denied");
			}
		}

	}

	public static void main(String[] args) {

		BufferedReader bufferReaderObj = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter 'Quit' to exit");
		System.out.println("Please enter root folder name to search");

		String inputString = null;
		try {
			while ((inputString = bufferReaderObj.readLine()) != null) {
				inputString = inputString.trim();
				if (!inputString.equalsIgnoreCase("Quit")) {
					String rootFolderStr = inputString;
					try {
						File rootFolder = new File(rootFolderStr);
						if (rootFolder.isDirectory()) {
							System.out.println("Path is correct");
							result.clear();
							MyTestMain testObj = new MyTestMain();
							testObj.search(rootFolder);

							if (!result.isEmpty()) {
								System.out.println("Following match found :");
								for (String match : result) {
									System.out.println(match);
								}
							} else {
								System.out.println("No match found");
							}

						} else {
							System.out.println("Please reenter proper root folder name");
						}
					} catch (Exception e) {
						System.out.println("Error Occure. Please reenter proper root folder name" + e);
					}

				} else {
					System.out.println("system exit");
					Thread.sleep(1000);
					System.exit(0);
				}
			}
		} catch (Exception e) {
			System.out.println("Error in main" + e.toString());

			e.printStackTrace();
		}

	}

}