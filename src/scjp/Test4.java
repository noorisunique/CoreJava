package scjp;

public class Test4 {
	public static void main(String[] args) {
		String year = "Senior";
		switch (year) {
		case "Freshman":
		case "Sophomore":
		case "Junior":
			System.out.print("See you next year");
			break;
		case "Senior":
			System.out.print("Congratulations");
		default:
			System.out.print("Invalid year");
		}
	}
}
