package com.File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Test1 {
	public static void main(String[] args)throws Exception {
		File files=new File("/home/noor/Desktop/Test.txt");
		FileReader fr=new FileReader(files);
		BufferedReader br=new BufferedReader(fr);
		String line;
		Map<String, Integer> map=new HashMap<String,Integer>();
		while((line=br.readLine())!=null) {
			String arrays[]=line.split(" ");
			for (String string : arrays) {
				if(map.get(string)!=null) {
					map.put(string, 1+map.get(string));
				}else {
					map.put(string, 1);	
				}
				
			}
			
		}
		System.out.println(map);
	}
}
