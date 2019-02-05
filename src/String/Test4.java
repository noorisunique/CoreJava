package com.String;
import java.util.HashSet;
import java.util.Set;

class Student{
	private String name;
	private String add;
	private String depm;
	
	private int age;
	
	public Student(String name,int age) {
		this.name=name;
		this.age=age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((add == null) ? 0 : add.hashCode());
		result = prime * result + age;
		result = prime * result + ((depm == null) ? 0 : depm.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (add == null) {
			if (other.add != null)
				return false;
		} else if (!add.equals(other.add))
			return false;
		if (age != other.age)
			return false;
		if (depm == null) {
			if (other.depm != null)
				return false;
		} else if (!depm.equals(other.depm))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
}
public class Test4 {

	public static void main(String[] args) {
		
		Student s1=new Student("Noor",26);
		Student s2=new Student("Noor",26);
		
		Set<Student> set=new HashSet<>();
		set.add(s1);
		set.add(s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(set.size());
		
		
	}

}
//public final class java.lang.String impshlements java.io.Serializable, java.lang.Comparable, java.lang.CharSequence {