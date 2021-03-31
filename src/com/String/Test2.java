package com.String;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		String s1="Noor";
		String s2="Noor";
		
		Set<String> set=new HashSet<String>();
		set.add(s1);
		set.add(s2);
		
		System.out.println(set.size());
		
		
		String s3=new String("Noor");
		String s4=new String("Noor");
		Set<String> set1=new HashSet<String>();
		set1.add(s3);
		set1.add(s1);
		
		System.out.println(set1.size());
		
		Map<String, Integer> map=new HashMap<>();
		map.put(s1, 1);
		map.put(s3, 2);
		System.out.println(map.size());
		
		
	}

}
//public final class java.lang.String implements java.io.Serializable, java.lang.Comparable, java.lang.CharSequence {