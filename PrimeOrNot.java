import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// User inputs number, program outputs whether input is prime or composite
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter an integer greater than 1: ");
		int num = sc.nextInt();

		boolean prime = true;

		sc.close();

		// If else to ensure valid input
		if (num > 1) {
			for (int i = 2; i < num; i++) {
				int numRemainder = num % i;
				if (numRemainder == 0) {
					prime = false;
				}
			}
			if (prime == true) {
				System.out.println(num + " is a prime number.");
			} else {
				System.out.println(num + " is a composite number.");
			}
		} else {
			System.out.println("Invalid number! Please enter an integer greater than 1.");
		}

	}

}
