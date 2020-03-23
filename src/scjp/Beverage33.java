package scjp;

class Coffee extends Beverage33 {
	public void drink() {
		System.out.println("Coffee");
	}
}

public class Beverage33 {
	private void drink() {
		System.out.println("Beverage");
	}

	public static void main(String[] args) {
		Beverage33 b = new Coffee();
		b.drink();
	}
}
