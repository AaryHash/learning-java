import java.util.Scanner;
import java.util.Random;

public class RPS {

	public static void main(String[] args) {
		// User can play Rock, Paper, Scissors against program
			Scanner sc = new Scanner(System.in);
			Random rand = new Random();
			
		// variables
			int replay = 0, user, comp, userWins, compWins, numGames, min = 1, max = 3;
			String userWord, compWord;
			boolean replayBool = true;
			
		// do while for replayability
			do {
			
			// reset wins
				userWins = 0;
				compWins = 0;
				numGames = 0;
				
			// prompt for # of games
				System.out.println("Do you want to");
				System.out.println("1 - Play a Single Game");
				System.out.println("2 - Play a Series of Games");
				System.out.println("3 - Leave the Game");
				user = sc.nextInt();
				
			// switch for # of games
				switch (user) {
				case 1:
					numGames = 1;
					break;
				case 2:
					System.out.print("Enter an odd number of games to play: ");
					user = sc.nextInt();
					
					if (user > 0) {
						if (user % 2 != 0) {
							numGames = (user / 2) + 1;
						} else {
							System.out.println("Invalid number of games entered.");
							replayBool = false;
						}
					} else {
						System.out.println("Invalid number of games entered.");
						replayBool = false;
					}
					
					break;
				case 3:
					replayBool = false;
					break;
				default:
					System.out.println("Invalid input... Ending game");
					System.out.println("Thanks for playing!");
				}
				
			// while loop for game
				while (numGames != compWins && numGames != userWins) {
				
				// randomize computer choice
					comp = rand.nextInt(max - min + 1) + min;
					
				// user choice
					System.out.println("Select:");
					System.out.println("1 - Rock");
					System.out.println("2 - Paper");
					System.out.println("3 - Scissors");
					user = sc.nextInt();
					
				// converting numbers to strings
					if (comp == 1) {
						compWord = "Rock";
						
					} else if (comp == 2) {
						compWord = "Paper";
						
					} else {
						compWord = "Scissors";
						
					}
					
					if (user == 1) {
						userWord = "Rock";
						
					} else if (user == 2) {
						userWord = "Paper";
						
					} else {
						userWord = "Scissors";
						
					}
					
				// output
					System.out.println("---------------------");
					System.out.println("User: " + userWord);
					System.out.println("Computer: " + compWord);
					System.out.println("---------------------");
					
					if ((user == 2 && comp == 1) || (user == 1 && comp == 3) || (user == 3 && comp == 2)) {
							System.out.println("User wins!");
							System.out.println("---------------------");
							userWins++;
							
						} else if ((user == 1 && comp == 2) || (user == 3 && comp == 1) || (user == 2 && comp == 3)) {
							System.out.println("Computer wins!");
							System.out.println("---------------------");
							compWins++;
							
						} else if ((user == 1 && comp == 1) || (user == 3 && comp == 3) || (user == 2 && comp == 2)) {
							System.out.println("It's a draw!");
							System.out.println("---------------------");
							
						} else {
							System.out.println("");
							
						}
					
					System.out.println("User Wins: " + userWins);
					System.out.println("Computer Wins: " + compWins);
					System.out.println("---------------------");
				}
				
			// if else for win message
				if (numGames == userWins && replayBool == true) {
					System.out.println("Congrats! You beat the computer.");
					System.out.println("Would you like to play again?");
					System.out.println("1 - Yes");
					System.out.println("2 - No");
					replay = sc.nextInt();
					
				} else if (numGames == compWins && replayBool == true) {
					System.out.println("Sorry! The computer beat you :(");
					System.out.println("Would you like to try again?");
					System.out.println("1 - Yes");
					System.out.println("2 - No");
					replay = sc.nextInt();
					
				} else {
					replay = 2;
					
				}
				
			} while (replay == 1);
			
			System.out.println("Thanks for playing!");
			
			sc.close();

	}

}
