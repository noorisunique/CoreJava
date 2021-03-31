package com.jaction;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonIncluseEx {
	public static void main(String args[]) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		try {
			Student2 Student2 = new Student2(1, null);
			String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(Student2);
			System.out.println(jsonString);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

@JsonInclude(JsonInclude.Include.NON_NULL)
class Student2 {
	public int id;
	public String name;

	Student2(int id, String name) {
		this.id = id;
		this.name = name;
	}
}