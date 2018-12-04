package scjp;

enum Toppings {
	PEPPERONI, SAUSAGE, ONION, OLIVES, CHEESE;
}

public class Enum25 {
	public static void main(String[] args) {
		Toppings[] choices = Toppings.values();
		System.out.println(choices[1]);
	}
}
