package com.jaction;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonIgnoreEx {
	public static void main(String args[]) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		try {
			Student4 student = new Student4(1, 11, "1ab", "Mark");
			String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
			System.out.println(jsonString);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class Student4 {
	public int id;
	@JsonIgnore
	public String systemId;
	public int rollNo;
	public String name;

	Student4(int id, int rollNo, String systemId, String name) {
		this.id = id;
		this.systemId = systemId;
		this.rollNo = rollNo;
		this.name = name;
	}
}