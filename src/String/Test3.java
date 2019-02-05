package com.String;
import java.util.HashSet;
import java.util.Set;

class Student1{
	private String name;
	private int age;
	
	public Student1(String name,int age) {
		this.name=name;
		this.age=age;
	}
}
public class Test3 {

	public static void main(String[] args) {
		
		Student1 s1=new Student1("Noor",26);
		Student1 s2=new Student1("Noor",26);
		
		Set<Student1> set=new HashSet<>();
		set.add(s1);
		set.add(s2);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(set.size());
		
		
	}

}
//public final class java.lang.String impshlements java.io.Serializable, java.lang.Comparable, java.lang.CharSequence {