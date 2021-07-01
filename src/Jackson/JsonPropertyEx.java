package Jackson;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

class Student {
	private int id;

	Student() {
	}

	Student(int id) {
		this.id = id;
	}

	@JsonProperty("id")
	public int getTheId() {
		return id;
	}

	@JsonProperty("id")
	public void setTheId(int id) {
		this.id = id;
	}
}

public class JsonPropertyEx {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		String json = "{\"id\" : 1}";
		Student student = mapper.readValue(json, null);
		System.out.println(student.getTheId());

	}

}
