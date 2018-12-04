package scjp;

import java.text.DecimalFormat;

public class DecimalFormat1 {

	public static void main(String[] args) {
		 DecimalFormat df = new DecimalFormat("#,000.0#");
		  double pi = 3.141592653;
		  System.out.println(df.format(pi)); 

	}

}
