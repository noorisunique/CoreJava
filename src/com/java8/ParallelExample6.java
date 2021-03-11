package com.java8;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

//https://www.geeksforgeeks.org/what-is-java-parallel-streams/
public class ParallelExample6 {

	public static void main(String[] args) throws IOException {

		// Create a File object
		File fileName = new File("D:\\Noor.txt");

		// Create a Stream of String type
		// Using the lines() method to read one line at a time
		// from the text file
		Stream<String> text = Files.lines(fileName.toPath());

		// Use StreamObject.parallel() to create parallel streams
		// Use forEach() to print the lines on the console
		text.parallel().forEach(System.out::println);

		// Close the Stream
		text.close();
	}

}