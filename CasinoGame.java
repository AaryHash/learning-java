import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

public class CasinoGame {

	public static void main(String[] args) {
		// User starts with $10,000 and inputs # of bets, program returns results of
		// said bets
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		DecimalFormat df = new DecimalFormat("$#,###,###,###,###,###,###,###,###");

		int money = 10000, min = 5, max = 1000, amount;
		boolean winLoss, loop = true;

		// While loop for game state
		while (loop == true) {
			System.out.print("How many times would you like to bet? (Type 0 to end): ");
			int input = sc.nextInt();

			if (input == 0) {
				System.out.println("Thanks for playing! You ended with " + df.format(money));
				loop = false;
			} else if (input < 0) {
				System.out.println("Invalid input. Please enter a positive integer or 0.");
			} else {
				for (int i = 0; i < input; i++) {
					winLoss = rand.nextBoolean();
					amount = rand.nextInt(max - min + 1) + min;

					if (winLoss == true) {
						money = money + amount;
						System.out.println("Congrats! You won " + df.format(amount));
						System.out.println("You have " + df.format(money));
					} else {
						money = money - amount;
						if (money > 0) {
							System.out.println("Sorry, you lost " + df.format(amount));
							System.out.println("You have " + df.format(money));
						} else {
							System.out.println("Sorry, you lost " + df.format(amount));
							System.out.println("You lost all your money and the game has ended. You ended with "
									+ df.format(money));
							i = input;
							loop = false;
						}
					}
				}
			}
		}

		sc.close();

	}

}
