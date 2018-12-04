package scjp;

public class Student implements java.io.Serializable {
	private String name;

	public static void main(String[] args) {
		Senior s1 = new Senior();
		//Junior s2 = new Senior();
		Object s3 = new Senior();
		//String s4 = new Senior();
		Student s5 = new Senior();
		java.io.Serializable s6 = new Senior();	
	}
}

class Senior extends Student {
}

class Junior extends Student {
}
