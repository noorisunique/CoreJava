package com.String;
import java.util.HashSet;
import java.util.Set;

class Student2{
	private String name;
	private int age;
	
	public Student2(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public boolean equals(Object o1) {
		Student2 s=(Student2)o1;
		if(s.name==this.name && s.age==this.age) {
			return true;
		}else {
		return false;
		}
	}
	
}
public class Test5 {

	public static void main(String[] args) {
		
		Student2 s1=new Student2("Noor",26);
		Student2 s2=new Student2("Noor",26);
		
		Set<Student2> set=new HashSet<>();
		set.add(s1);
		set.add(s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(set.size());
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		
		
	}

}
//public final class java.lang.String impshlements java.io.Serializable, java.lang.Comparable, java.lang.CharSequence {