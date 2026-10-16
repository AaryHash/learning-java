import java.util.Scanner;

public class FactorsOfAnInteger {

	public static void main(String[] args) {
		// User inputs a positive integer, program outputs all factors of input
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter a positive integer: ");
			int num = sc.nextInt();
			
			sc.close();
			
		// If else statement to ensure correct input
			if (num > 0) {
				System.out.print(num + " is factorable by: ");
			// For loop to try every possible factor
				for(int i = 1; i < num; i++) {
					int numRemainder = num % i;
					if (numRemainder == 0) {
						System.out.print(i + ", ");
					}
				}
				System.out.print("and " + num);
			} else {
				System.out.println("Invalid number! Please enter a positive integer.");
			}

	}

}
