package scjp;

import java.util.List;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		List<Number> data = new Vector<Number>();
		data.add(10);
		//data.add("4.5F");
		data.add(new Double(56.7));
		for (Number number : data) {
			System.out.print(number);
		}
		
		List<String> data1=new Vector<String>();
		data1.add("12");
		//data1.add(12);
		
	}
}
