package scjp;

public class Test5 {
	enum Color {
		RED, BLUE, GREEN
	}

	public static void go(Color c) {
		switch (c) {
		case RED:
			System.out.print("red");
		case BLUE:
			System.out.print("blue");
			break;
		case GREEN:
			System.out.print("green");
		default:
			assert false;
		}
	}

	public static void main(String[] args) {
		go(Color.RED);
	}
}
