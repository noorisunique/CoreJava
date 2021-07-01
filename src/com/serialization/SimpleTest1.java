package com.serialization;

import java.io.*;

class Demo implements java.io.Serializable {
	public int a;
	public String b;
	private static final long serialversionUID = 129348938L;

	// Default constructor
	public Demo(int a, String b) {
		this.a = a;
		this.b = b;
	}

}

public class SimpleTest1 {

	public static void main(String[] args) {
		Demo object = new Demo(1, "geeksforgeeks");
		String filename = "file.ser";

		// Serialization
		try {
			System.out.println("Object before has been serialized ");
			System.out.println("a = " + object.a);
			System.out.println("b = " + object.b);

			// Saving of object in a file
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			// Method for serialization of object
			out.writeObject(object);

			out.close();
			file.close();

		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		Demo object1 = null;

		// Deserialization
		try {
			// Reading the object from a file
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			// Method for deserialization of object
			object1 = (Demo) in.readObject();

			in.close();
			file.close();

			System.out.println("\nObject has been deserialized ");
			System.out.println("a = " + object1.a);
			System.out.println("b = " + object1.b);
		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException is caught");
		}

	}
}