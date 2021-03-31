package hackethon;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

//https://www.baeldung.com/java-least-common-multiple
public class IntegerLeastCommonMultiple {

	public static int lcm(int number1, int number2) {
		if (number1 == 0 || number2 == 0) {
			return 0;
		}
		int absNumber1 = Math.abs(number1);
		int absNumber2 = Math.abs(number2);
		int absHigherNumber = Math.max(absNumber1, absNumber2);
		int absLowerNumber = Math.min(absNumber1, absNumber2);
		int lcm = absHigherNumber;
		while (lcm % absLowerNumber != 0) {
			lcm += absHigherNumber;
		}
		return lcm;
	}

	@Test
	public void Test() {
		assertEquals(36, lcm(12, 18));
		assertEquals(4, lcm(2, 4));
		assertEquals(9, lcm(3, 9));
		assertEquals(36, lcm(18, 12));
	}
}
