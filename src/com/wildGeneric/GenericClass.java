package com.wildGeneric;

import java.util.ArrayList;
import java.util.List;

//A class that can refer to any type is known as generic class
public class GenericClass<N> {
	N obj;

	  GenericClass(N obj) {
		this.obj = obj;
	}

	N get() {
		return obj;
	}
	public static void main(String[] args) {
		GenericClass<Integer> o1=new GenericClass<>(1);
		GenericClass<String> o2=new GenericClass<String>("Noor");
		System.out.println(o1.get());
		
	}
} 