import java.util.Scanner;

public class GuessYourNumber {

	public static void main(String[] args) {
		// Program attempts to guess number chosen by user
		Scanner sc = new Scanner(System.in);

		int replay = 1, response;

		// Do while loop to allow for replay
		do {
			System.out.println("Think of a number between 1 and 100...");
			int numTries = 0, guess, min = 1, max = 100;

			// Do while loop for actual game
			do {
				// Computer guess and response
				guess = (max + min) / 2;

				System.out.println("Computer Guesses: " + guess);

				System.out.println("Enter a number:");
				System.out.println("1) Too High");
				System.out.println("2) Too Low");
				System.out.println("3) Correct");

				response = sc.nextInt();

				numTries++;

				// If else to check if user is cheating
				if (numTries == 10) {
					System.out.println("Hey! You're cheating :(");
					replay = 2;
					break;
				}

				// If else for response to computer's guess
				if (response == 1) {
					max = guess - 1;
				} else if (response == 2) {
					min = guess + 1;
				} else if (response == 3) {
					System.out.println("I was correct! The number was " + guess);
					System.out.println("Enter 1 to replay:");
					replay = sc.nextInt();
				} else {
					System.out.println("Error! Please enter 1, 2, or 3.");
					continue;
				}

			} while (response != 3 && numTries != 10);

		} while (replay == 1);

		// Closing message and close scanner
		System.out.println("Thanks for playing! Game over.");

		sc.close();

	}

}
