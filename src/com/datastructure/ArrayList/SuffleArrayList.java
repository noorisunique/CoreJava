package com.datastructure.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SuffleArrayList {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Noor11");
		list.add("Noor12");
		list.add("Noor13");
		list.add("Noor14");
		list.add("Noor15");
		
		Collections.shuffle(list);
		System.out.println(list);

	}

}
