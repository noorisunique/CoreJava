package com.serializatioSerialVersionUID;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//https://dzone.com/articles/what-is-serialversionuid
public class Writer {

	public static void main(String[] args) throws IOException {
		Employee employee = new Employee();
		employee.setName("Ashintha");
		employee.setAge((byte) 30);
		employee.setAddress("Galle");

		FileOutputStream fout = new FileOutputStream("D:/interview/serializable/employee.obj");
		ObjectOutputStream oos = new ObjectOutputStream(fout);
		oos.writeObject(employee);
		oos.close();
		System.out.println("Process complete");

	}

}