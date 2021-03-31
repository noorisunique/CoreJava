package com.java8;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Stream;

//https://www.geeksforgeeks.org/what-is-java-parallel-streams/
public class ParallelExample5 {

	public static void main(String[] args) throws IOException {

		// Create a File object
		File fileName = new File("D:\\Noor.txt");

		// Create a List
		// Using readAllLines() read the lines of the text file
		List<String> text = Files.readAllLines(fileName.toPath());

		// Using parallelStream() to create parallel streams
		text.parallelStream().forEach(System.out::println);
	}

}