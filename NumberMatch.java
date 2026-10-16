import java.util.Scanner;
import java.util.Random;

public class NumberMatch {

	public static void main(String[] args) {
		// User inputs number from 1 to 100, program randomizes guesses until matching input
			Scanner sc = new Scanner(System.in);
			Random rand = new Random();
			
			int guess = 0;
			int entry = 0;
			int count = 0;
			
		// Prompt
			boolean goodEntry = false;
			
			while (goodEntry == false) {
				System.out.print("Enter an integer from [1,100]: ");
				entry = sc.nextInt();
				
				if (entry >= 1 && entry <= 100) {
					goodEntry = true;
				} else {
					System.out.println("That was not an integer from [1,100]. Please try again.");
				}
			}
			
			sc.close();
			
		// While loop to randomize numbers until entry == guess
			while (entry != guess) {
				count++;
				int min = 1;
				int max = 100;
				guess = rand.nextInt(max - min + 1) + min;
				System.out.println("Guess " + count + " for number " + entry + ": " + guess);
			}

	}

}
