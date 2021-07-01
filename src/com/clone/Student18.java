package com.clone;

///https://www.javatpoint.com/object-cloning
class Student18 implements Cloneable {
	int rollno;
	String name;

	Student18(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String args[]) {
		try {
			Student18 s1 = new Student18(101, "amit");

			Student18 s2 = (Student18) s1.clone();
			s2.setName("Noor");
			s1.setName("Amir");
			System.out.println(s1.rollno + " " + s1.name);

			System.out.println(s2.rollno + " " + s2.name);

		} catch (CloneNotSupportedException c) {
		}

	}
}