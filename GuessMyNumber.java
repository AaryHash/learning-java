import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber {

	public static void main(String[] args) {
		// User attempts to guess a number randomized by program
			Scanner sc = new Scanner(System.in);
			Random rand = new Random();
			
			int replay, guess;
			
		// Do while for replayability
			do {
				int remainingGuesses = 10, answer, min = 1, max = 100;
				answer = rand.nextInt(max - min + 1) + min;
				
				do {
					System.out.print("Enter a number from 1 to 100: ");
					guess = sc.nextInt();
					remainingGuesses--;
					
					if (guess >= 1 && guess <= 100) {
						System.out.println("Guess: " + guess);
						if (guess > answer) {
							System.out.println("Too High");
							System.out.println("Guesses Remaining: " + remainingGuesses);
							
							if (remainingGuesses == 0) {
								guess = answer;
								System.out.println("Sorry, you are out of tries :(");
								System.out.println("The number was " + answer);
								break;
							}
						} else if (guess < answer) {
							System.out.println("Too Low");
							System.out.println("Guesses Remaining: " + remainingGuesses);
						} else {
							System.out.println("Correct! The number was " + answer);
							System.out.println("It took you " + (10 - remainingGuesses) + " tries to get it!");
						}
						
					} else {
						System.out.println("Guess: " + guess);
						System.out.println("Invalid input. You still lose a try. Try again!");
						System.out.println("Guesses Remaining: " + remainingGuesses);
					}
					
				} while (guess != answer);
				
				System.out.println("Do you want to play again? ");
				System.out.println("1 - Yes! Keep going.");
				System.out.println("2 - No. Game over!");
				replay = sc.nextInt();
				
				if (replay == 1) {
					continue;
				} else if (replay == 2) {
					System.out.println("Thanks for playing!");
				} else {
					System.out.println("Invalid input. Program ending...");
				}
			} while (replay == 1);
			
			sc.close();

	}

}
