import java.util.Scanner;
import java.util.Random;

public class ThreeInARow {

	public static void main(String[] args) {
		// User attempts to win a 50/50 game 3 times in a row
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		// Generate random number
		int min = 1;
		int max = 2;
		int num = rand.nextInt(max - min + 1) + min;

		// Prompt user
		System.out.print("Guess 1 or 2: ");
		int userGuess = sc.nextInt();

		// Nested if else for game
		if (num == userGuess) {
			System.out.print("You won $1! Keep playing for the chance to win more.\nGuess 1 or 2: ");
			userGuess = sc.nextInt();

			num = rand.nextInt(max - min + 1) + min;

			if (num == userGuess) {
				System.out.print("You won $5! Keep playing for the chance to win more.\nGuess 1 or 2: ");
				userGuess = sc.nextInt();

				num = rand.nextInt(max - min + 1) + min;

				if (num == userGuess) {
					System.out.print("You won $100! Congrats!!");
				} else {
					System.out.print(
							"Oh no! You lost, leaving the game with $5.\nFeel free to try again for a better prize!");
				}
			} else {
				System.out.print(
						"Oh no! You lost, leaving the game with just $1.\nFeel free to try again for a better prize!");
			}
		} else {
			System.out.print("Oh no! You lost. Feel free to try again!");
		}

		sc.close();

	}

}
