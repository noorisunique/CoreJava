package com.jaction;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonPropertyEx {
	public static void main(String args[]) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		String json = "{\"_______id\" : 1}";
		Student student = mapper.readValue(json, Student.class);
		System.out.println(student.getTheId());
	}
}

class Student {
	private int id;

	Student() {
	}

	Student(int id) {
		this.id = id;
	}

	@JsonProperty("_______id")
	public int getTheId() {
		return id;
	}

	@JsonProperty("_______id")
	public void setTheId(int id) {
		this.id = id;
	}
}