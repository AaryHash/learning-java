import java.util.Random;
import java.util.Scanner;

public class DoorProblem {

	public static void main(String[] args) {
		// User plays the classic door problem of choosing 1 of 3 doors, then switching
		// or sticking with door choice
		Random rand = new Random();
		int min = 1;
		int max = 3;
		int door = rand.nextInt(max - min + 1) + min;

		Scanner sc = new Scanner(System.in);
		System.out.println(" _____   _____   _____");
		System.out.println("|     | |     | |     |");
		System.out.println("|  1  | |  2  | |  3  |");
		System.out.println("|_____| |_____| |_____|");
		System.out.println("Choose a Door: ");

		int userChoice = sc.nextInt();

		if (door == 1 && userChoice == 2) {
			System.out.println("Door 3 does not have the money!");
			System.out.println("Do You Want to: ");
			System.out.println("1 - Stay with Door 2\n2 - Switch to Door 1");
			userChoice = sc.nextInt();

			switch (userChoice) {
				case 1:
					System.out.println("Sorry you lose! The money was behind door 1! :( ");
					break;
				case 2:
					System.out.println("You won the $1,000,000!");
					break;
				default:
					System.out.println("Invalid Choice. Start over!");

			}
		} else if (door == 1 && userChoice == 3) {
			System.out.println("Door 2 does not have the money!");
			System.out.println("Do You Want to: ");
			System.out.println("1 - Stay with Door 3\n2 - Switch to Door 1");
			userChoice = sc.nextInt();

			switch (userChoice) {
				case 1:
					System.out.println("Sorry you lose! The money was behind door 1! :( ");
					break;
				case 2:
					System.out.println("You won the $1,000,000!");
					break;
				default:
					System.out.println("Invalid Choice. Start over!");

			}
		} else if (door == 1 && userChoice == 1) {
			System.out.println("Door 2 does not have the money!");
			System.out.println("Do You Want to: ");
			System.out.println("1 - Stay with Door 1\n2 - Switch to Door 3");
			userChoice = sc.nextInt();

			switch (userChoice) {
				case 2:
					System.out.println("Sorry you lose! The money was behind door 1! :( ");
					break;
				case 1:
					System.out.println("You won the $1,000,000!");
					break;
				default:
					System.out.println("Invalid Choice. Start over!");

			}
		} else if (door == 2 && userChoice == 1) {
			System.out.println("Door 3 does not have the money!");
			System.out.println("Do You Want to: ");
			System.out.println("1 - Stay with Door 1\n2 - Switch to Door 2");
			userChoice = sc.nextInt();

			switch (userChoice) {
				case 1:
					System.out.println("Sorry you lose! The money was behind door 2! :( ");
					break;
				case 2:
					System.out.println("You won the $1,000,000!");
					break;
				default:
					System.out.println("Invalid Choice. Start over!");

			}
		} else if (door == 2 && userChoice == 3) {
			System.out.println("Door 1 does not have the money!");
			System.out.println("Do You Want to: ");
			System.out.println("1 - Stay with Door 3\n2 - Switch to Door 2");
			userChoice = sc.nextInt();

			switch (userChoice) {
				case 1:
					System.out.println("Sorry you lose! The money was behind door 2! :( ");
					break;
				case 2:
					System.out.println("You won the $1,000,000!");
					break;
				default:
					System.out.println("Invalid Choice. Start over!");

			}
		} else if (door == 2 && userChoice == 2) {
			System.out.println("Door 1 does not have the money!");
			System.out.println("Do You Want to: ");
			System.out.println("1 - Stay with Door 2\n2 - Switch to Door 3");
			userChoice = sc.nextInt();

			switch (userChoice) {
				case 2:
					System.out.println("Sorry you lose! The money was behind door 2! :( ");
					break;
				case 1:
					System.out.println("You won the $1,000,000!");
					break;
				default:
					System.out.println("Invalid Choice. Start over!");

			}
		} else if (door == 3 && userChoice == 1) {
			System.out.println("Door 2 does not have the money!");
			System.out.println("Do You Want to: ");
			System.out.println("1 - Stay with Door 1\n2 - Switch to Door 3");
			userChoice = sc.nextInt();

			switch (userChoice) {
				case 1:
					System.out.println("Sorry you lose! The money was behind door 3! :( ");
					break;
				case 2:
					System.out.println("You won the $1,000,000!");
					break;
				default:
					System.out.println("Invalid Choice. Start over!");

			}
		} else if (door == 3 && userChoice == 2) {
			System.out.println("Door 1 does not have the money!");
			System.out.println("Do You Want to: ");
			System.out.println("1 - Stay with Door 2\n2 - Switch to Door 3");
			userChoice = sc.nextInt();

			switch (userChoice) {
				case 1:
					System.out.println("Sorry you lose! The money was behind door 3! :( ");
					break;
				case 2:
					System.out.println("You won the $1,000,000!");
					break;
				default:
					System.out.println("Invalid Choice. Start over!");

			}
		} else if (door == 3 && userChoice == 3) {
			System.out.println("Door 1 does not have the money!");
			System.out.println("Do You Want to: ");
			System.out.println("1 - Stay with Door 3\n2 - Switch to Door 2");
			userChoice = sc.nextInt();

			switch (userChoice) {
				case 2:
					System.out.println("Sorry you lose! The money was behind door 3! :( ");
					break;
				case 1:
					System.out.println("You won the $1,000,000!");
					break;
				default:
					System.out.println("Invalid Choice. Start over!");

			}
		} else {
			System.out.println("Invalid Input.  Please Try Again!");
		}

		sc.close();
	}

}