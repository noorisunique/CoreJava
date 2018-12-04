package scjp;

import java.text.NumberFormat;
import java.util.Locale;

public class Locale28 {

	public static void main(String[] args) {
		 NumberFormat nf =
				  NumberFormat.getCurrencyInstance(Locale.US);
				  double value = 123.456;
				  System.out.println(nf.format(value)); 
	}
}
