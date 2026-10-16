import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

public class RollingDoubles {

	public static void main(String[] args) {
		// User inputs # of times to roll two dice, program outputs each rolle and stats
		// related to doubles
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		DecimalFormat df = new DecimalFormat("###.##%");

		System.out.print("How many times do you want to roll the dice? ");
		int numRolls = sc.nextInt();

		sc.close();

		int dieA, dieB;

		int numDoubles = 0;

		// If else to ensure valid input
		if (numRolls > 0) {
			for (int i = 1; i <= numRolls; i++) {
				int min = 1;
				int max = 6;

				dieA = rand.nextInt(max - min + 1) + min;
				dieB = rand.nextInt(max - min + 1) + min;

				System.out.print("Roll " + i + ": " + dieA + " and " + dieB);

				if (dieA == dieB) {
					numDoubles++;
					System.out.println(" - Double");
				} else {
					System.out.println("");
				}
			}
		} else {
			System.out.println("Please enter a positive integer.");
		}

		// Print
		double percentage = (numDoubles * 1.0) / numRolls;

		System.out.println("Number of Rolls: " + numRolls);
		System.out.println("Number of Doubles: " + numDoubles);
		System.out.println("% of Rolls that were Doubles: " + df.format(percentage));

	}

}
