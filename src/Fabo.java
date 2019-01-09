

public class Fabo {

	static int findIndex(int n) {

		// if Fibonacci number is less
		// than 2, its index will be
		// same as number
		if (n <= 1)
			return n;

		int a = 0, b = 1, c = 1;
		int res = 1;

		// iterate until generated fibonacci
		// number is less than given
		// fibonacci number
		while (c < n) {
			c = a + b;

			// res keeps track of number of
			// generated fibonacci number
			res++;
			a = b;
			b = c;
		}

		return res;
	}

	// Driver program to test above function
	public static void main(String[] args) {
		int result = findIndex(21);
		System.out.println(result);
	}
}
