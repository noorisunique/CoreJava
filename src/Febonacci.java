

public class Febonacci {

	static void findvalue(int a[], int index) {

		System.out.println(a[index]);
	}

	public static void main(String[] args) {
		int count = 0;
		int f = 1;
		int b = 2;
		int c = 0;
		int a[] = new int[1500];

		a[count++] = c;
		a[count++] = f;
		a[count++] = b;

		while (count < 1500) {

			c = f + b;
			f = b;
			b = c;
			a[count++] = c;
		}

		findvalue(a, 1000);

	}

}
