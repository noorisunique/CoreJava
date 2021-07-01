package com.serializatioSerialVersionUID;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
//https://dzone.com/articles/what-is-serialversionuid
public class Reader {

	public static void main(String[] args) throws ClassNotFoundException, IOException {

		Employee employee = new Employee();
		FileInputStream fin = new FileInputStream("D:/interview/serializable/employee.obj");
		ObjectInputStream ois = new ObjectInputStream(fin);
		employee = (Employee) ois.readObject();
		ois.close();

		System.out.println(employee.whoIsThis());
		System.out.println(employee.getLastname());

	}

}