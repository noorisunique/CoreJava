package soroco.company;

///https://www.javatpoint.com/fizzbuzz-program-in-java
public class FizzBuzz {
	public static void fizzBuzz(int n) {
		// loop for 100 times
		for (int i = 1; i <= n; i++) {

			if (i % 3 == 0 && i % 5 == 0)
				System.out.println("FizzBuzz" + " ");
			else if (i % 3 == 0)
				System.out.println("Fizz" + " ");
			else if (i % 5 == 0)
				System.out.println("Buzz" + " ");

			else // print the numbers
				System.out.println(i + " ");
		}

	}

	public static void main(String[] args) {
		fizzBuzz(15);

	}

}
