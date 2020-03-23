package scjp;

public class PrintString {
	public static void print(String... values) {
		for (String value : values) {
			System.out.println(value);
		}
	}
	public static void main(String[] args) {
		PrintString.print();
		PrintString.print("abc");
		//PrintString.print('a','b');
		PrintString.print("a","b");
		//PrintString.print(new java.util.Date());
		
		
	}
}
