package com.enumEx;

enum MyString{
	Noor,
}
public class ConvertStringToEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=MyString.Noor.name();
		MyString ss=MyString.Noor.valueOf(name);
		
		System.out.println(ss);
	}

}
