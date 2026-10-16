import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

public class TestYourLuck {

	public static void main(String[] args) {
		// User attempts to win consecutive 50/50 odds
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		DecimalFormat df = new DecimalFormat("##.00%");

		int min = 1, max = 2, userWins = 0, userEntry = 0, compGuess = 0, i = 1;

		// While loop for game
		while (userEntry == compGuess) {
			System.out.println("Round " + i + " - Enter 1 or 2: ");
			userEntry = sc.nextInt();

			compGuess = rand.nextInt(max - min + 1) + min;

			if (userEntry == compGuess) {
				i++;
				userWins++;
				System.out.println("Win!");
			} else {
				System.out.println("Loss :(");
			}
		}

		// Print results
		double probability = Math.pow(1.0 / 2, userWins);

		if (userWins == 0) {
			System.out.println("Rounds Won: " + userWins);
			System.out.println("Probability of losing Round 1: 50%");
		} else {
			System.out.println("Rounds Won: " + userWins);
			System.out.println("Probability of winning that many rounds in a row: " + df.format(probability));
		}

		sc.close();

	}

}
