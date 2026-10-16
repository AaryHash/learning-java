import java.util.Random;
import java.util.Scanner;

public class PotOfGold {

	public static void main(String[] args) {
		// User has 3 guesses out of 9 spaces to find a pot of gold
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int answer, max = 9, min = 1;
		answer = rand.nextInt(max - min + 1) + min;
		int response, guesses = 0;
		boolean win = false;

		// grid array
		char grid[][] = { { '1', '2', '3' }, { '4', '5', '6' }, { '7', '8', '9' } };

		// prompt
		println("You're looking for the Pot of Gold!"
				+ "\nYou get 3 guesses!");

		// for loop
		for (int j = 0; j < 3; j++) {
			printGrid(grid);

			print("Enter Guess #" + (j + 1) + ": ");
			response = sc.nextInt();

			// if else, checking for correct answer
			if (response == answer) {
				win = true;
				guesses = j + 1;
				j = 3;
			}

			// if else, changes grid to X if choice has been made
			if (response < 1 || response > 9) {
				println("Invalid Response. No More Guesses...");
				break;
			} else {
				switch (response) {
					case 1:
						grid[0][0] = 'X';
						break;
					case 2:
						grid[0][1] = 'X';
						break;
					case 3:
						grid[0][2] = 'X';
						break;
					case 4:
						grid[1][0] = 'X';
						break;
					case 5:
						grid[1][1] = 'X';
						break;
					case 6:
						grid[1][2] = 'X';
						break;
					case 7:
						grid[2][0] = 'X';
						break;
					case 8:
						grid[2][1] = 'X';
						break;
					case 9:
						grid[2][2] = 'X';
						break;
				}
			}
		}

		printGrid(grid);

		println("The Gold Was Behind #" + answer + "!");
		if (win && guesses == 1) {
			println("You Won! You found a fountain of gold!");
		} else if (win && guesses == 2) {
			println("You Won! You found a bag of gold!");
		} else if (win && guesses == 3) {
			println("You Won! You found a gold coin!");
		} else {
			println("You Didn't Find It :(");
		}

		sc.close();

	}

	public static void printGrid(char grid[][]) {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void print(String message) {
		System.out.print(message);
	}

	public static void println(String message) {
		System.out.println(message);
	}
}