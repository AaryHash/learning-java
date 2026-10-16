import java.util.Scanner;
import player.Player;

public class TicTacToe {

	public static void main(String[] args) {
		// Two players play Tic Tac Toe against each other (Best of 3)
		Scanner sc = new Scanner(System.in);

		String name1, name2;
		int choice;
		boolean p1Win, p2Win;

		char board[][] = { { '1', '2', '3' }, { '4', '5', '6' }, { '7', '8', '9' } };

		// prompt for names
		print("Enter Player 1's Name: ");
		name1 = sc.next();

		print("Enter Player 2's Name: ");
		name2 = sc.next();

		// initialize objects for players
		Player p1 = new Player(name1);
		Player p2 = new Player(name2);

		// while loop for series, checks if either player has won the series
		while (p1.getWins() < 2 && p2.getWins() < 2) {
			// for loop for each separate game, runs 9 times unless break is used
			for (int i = 1; i <= 9; i++) {
				// print board initially
				printGrid(board);

				// if else for first player to go
				if (i % 2 == 1) {
					// prompt for choice
					print(p1.getName() + ", choose a space: ");
					choice = sc.nextInt();

					// switch to change corresponding tile
					switch (choice) {
						case 1:
							board[0][0] = 'X';
							break;
						case 2:
							board[0][1] = 'X';
							break;
						case 3:
							board[0][2] = 'X';
							break;
						case 4:
							board[1][0] = 'X';
							break;
						case 5:
							board[1][1] = 'X';
							break;
						case 6:
							board[1][2] = 'X';
							break;
						case 7:
							board[2][0] = 'X';
							break;
						case 8:
							board[2][1] = 'X';
							break;
						case 9:
							board[2][2] = 'X';
							break;
					}

					// check for win
					p1Win = p1.checkWin(board);

					if (p1Win) {
						println(p1.getName() + " Wins!");
						p1.addWins();
						printGrid(board);
						println(p1.getName() + ": " + p1.getWins() + " | " + p2.getName() + ": " + p2.getWins());
						break;
					}
					// player 2's turn
				} else {
					// prompt for choice
					print(p2.getName() + ", choose a space: ");
					choice = sc.nextInt();

					// switch to change corresponding tile
					switch (choice) {
						case 1:
							board[0][0] = 'O';
							break;
						case 2:
							board[0][1] = 'O';
							break;
						case 3:
							board[0][2] = 'O';
							break;
						case 4:
							board[1][0] = 'O';
							break;
						case 5:
							board[1][1] = 'O';
							break;
						case 6:
							board[1][2] = 'O';
							break;
						case 7:
							board[2][0] = 'O';
							break;
						case 8:
							board[2][1] = 'O';
							break;
						case 9:
							board[2][2] = 'O';
							break;
					}

					// check for win
					p2Win = p2.checkWin(board);

					if (p2Win) {
						println(p2.getName() + " Wins!");
						p2.addWins();
						printGrid(board);
						println(p1.getName() + ": " + p1.getWins() + " | " + p2.getName() + ": " + p2.getWins());
						break;
					}
				}
			}
			// check for draw
			p1Win = p1.checkWin(board);
			p2Win = p2.checkWin(board);

			if (p1Win != true && p2Win != true) {
				println("DRAW!");
				printGrid(board);
				println(p1.getName() + ": " + p1.getWins() + " | " + p2.getName() + ": " + p2.getWins());
			}

			// reset board after game is over
			board[0][0] = '1';
			board[0][1] = '2';
			board[0][2] = '3';
			board[1][0] = '4';
			board[1][1] = '5';
			board[1][2] = '6';
			board[2][0] = '7';
			board[2][1] = '8';
			board[2][2] = '9';
		}

		// print winner of series after game ends
		println("---------------");

		if (p1.getWins() == 2) {
			println(p1.getName() + " Wins the Series!");
		}

		if (p2.getWins() == 2) {
			println(p2.getName() + " Wins the Series!");
		}

		// close scanner
		sc.close();

	}

	// print grid method (used previously)
	public static void printGrid(char grid[][]) {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				print(grid[i][j] + " ");
			}
			println("");
		}
	}

	// universal methods
	public static void println(String message) {
		System.out.println(message);
	}

	public static void print(String message) {
		System.out.print(message);
	}

}
