package hackethon;

import java.util.Scanner;

public class AddZeroinDigit {

	public static void main(String[] args) {
		int numbers;
		int counter = 1;
		int padlength;

		Scanner ngrabber = new Scanner(System.in);
		System.out.println("Please enter numbers to output number");
		numbers = ngrabber.nextInt();
		
			padlength = String.valueOf(numbers).length();
			
			if(padlength<3) {
				System.out.printf(String.format("%03d ",numbers));
			}else{
				System.out.println(numbers);
			}

	}
}