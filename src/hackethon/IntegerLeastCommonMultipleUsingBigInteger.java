package hackethon;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

//https://www.baeldung.com/java-least-common-multiple
public class IntegerLeastCommonMultipleUsingBigInteger {

	public static BigInteger lcm(BigInteger number1, BigInteger number2) {
		BigInteger gcd = number1.gcd(number2);
		BigInteger absProduct = number1.multiply(number2).abs();
		return absProduct.divide(gcd);
	}

	@Test
	public void testLCM() {
		BigInteger number1 = new BigInteger("12");
		BigInteger number2 = new BigInteger("18");
		BigInteger expectedLCM = new BigInteger("36");
		assertEquals(expectedLCM, IntegerLeastCommonMultipleUsingBigInteger.lcm(number1, number2));
	}
}
