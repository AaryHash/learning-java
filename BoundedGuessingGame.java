import java.util.Scanner;
import java.util.Random;

public class BoundedGuessingGame {

	public static void main(String[] args) {
		// User picks lower and upper bound for random number, then has 5 guesses to
		// guess the correct number
		Scanner sc = new Scanner(System.in);

		int min, max;

		System.out.print("Enter lower bound: ");
		min = sc.nextInt();

		System.out.print("Enter upper bound: ");
		max = sc.nextInt();

		int answer = randNum(min, max);

		int guesses = 0;
		boolean correct = false;

		// while loop
		while (guesses < 5 && correct == false) {
			System.out.print("Pick a number from " + min + "-" + max + ": ");
			int attempt = sc.nextInt();

			if (answer - attempt == 0) {
				correct = true;
			} else if (answer - attempt < 0) {
				System.out.println("Your guess is too high.");
				guesses = guesses + 1;
			} else if (answer - attempt > 0) {
				System.out.println("Your guess is too low.");
				guesses = guesses + 1;
			}
		}

		sc.close();

		// if else
		if (guesses == 5 && correct == false) {
			System.out.println("Sorry, you took too many guesses, the answer was " + answer + ".");
		} else if (correct == true) {
			System.out.println("You win! The answer was " + answer + ".");
		} else {
			System.out.println("Sorry, there was an error. Please try again!");
		}

	}

	public static int randNum(int min, int max) {
		// object
		Random rand = new Random();

		// return random number
		return rand.nextInt(max - min + 1) + min;
	}

}
