import java.util.Scanner;

public class PrimeFactorization {

	public static void main(String[] args) {
		// User inputs number, program outputs prime factors of input
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter an integer greater than 1: ");
		int num = sc.nextInt();

		int factor = 2;

		// If else to ensure valid input
		if (num > 1) {
			System.out.print(num + " = ");

			while (num > factor) {
				if ((num % factor) == 0) {
					System.out.print(factor + " * ");
					num = num / factor;
				} else {
					factor++;
				}
			}
			System.out.print(num);
		} else {
			System.out.println("That was not an integer greater than 1. Please enter an integer greater than 1.");
		}

		sc.close();

	}

}
