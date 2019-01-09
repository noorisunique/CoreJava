package com.readCSV;
import java.io.FileReader;

import au.com.bytecode.opencsv.CSVReader;

public class ReadCSVFile {
	// Java code to illustrate reading a
	// CSV file line by line
	public static void readDataLineByLine(String file) {
		try {
			FileReader filereader = new FileReader(file);
			CSVReader csvReader = new CSVReader(filereader);
			String[] nextRecord;
			while ((nextRecord = csvReader.readNext()) != null) {
				for (String cell : nextRecord) {
					System.out.print(cell + "\t");
				}
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		readDataLineByLine("C://Users//nmohammad3//Downloads//testcsv.csv");
	}
}
