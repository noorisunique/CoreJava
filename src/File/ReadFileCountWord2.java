package com.File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ReadFileCountWord2 {

	public static void main(String[] args) throws IOException {
		File file = new File("/home/noor/Desktop/Test1.txt");
		FileReader fr = new FileReader(file);
		BufferedReader reader = new BufferedReader(fr);
		String line;
		Map<String, Integer> map = new HashMap<>();
		while ((line = reader.readLine()) != null) {
			// \\s+ is the space delimiter in java
			String[] wordList = line.split(" ");
			for (String string : wordList) {
				if (map.get(string) != null) {
					map.put(string, 1 + map.get(string));
				} else {
					map.put(string, 1);
				}

			}
		}
		System.out.println("Total word count = " + map);

	}
}
