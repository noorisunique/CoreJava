package hackethon;

//153 = 1*1*1 + 5*5*5 + 3*3*3
public class Armstrong {

	public static void main(String[] args) {
		int number = 373, originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += remainder*remainder*remainder;
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
	}

