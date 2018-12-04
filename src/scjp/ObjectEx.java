package scjp;

import java.util.HashSet;
import java.util.Set;

public class ObjectEx {
	public static void main(String[] args) {
		 Set < Object > objects = new HashSet< Object > ();
		  String one = "hello";
		  int two = 2;
		  Boolean three = new Boolean(true);
		  objects.add(one);
		  objects.add(two);
		  objects.add(three);
		  objects.add(three);
		  for(Object object : objects) {
		  System.out.print(object);
		  } 
	}
}
