package scjp;

import java.util.*;

public class Set34 {
	public static void main(String[] args) {
		//Set< ? extends RuntimeException > set1 = new HashSet < ? extends RuntimeException ();
		Set< ? extends RuntimeException > set2 = new TreeSet < RuntimeException > ();
		//Set<? extends RuntimeException> set3 = new LinkedHashSet < Exception > ();
		Set<? extends RuntimeException> set4 = new TreeSet < NullPointerException > ();
		
	}
}
