package player;

public class Player {
	// variables
	private String name;
	private int wins;
	
	// constructors
	public Player() {
		
	}
	
	public Player(String nameX) {
		name = nameX;
		wins = 0;
	}
	
	// getter methods
	public String getName() {
		return name;
	}
	
	public int getWins() {
		return wins;
	}
	
	// add win method
	public void addWins() {
		wins += 1;
	}
	
	// check for win
	public boolean checkWin(char grid[][]) {
		// if else chain checking every possible win condition
		if (grid[0][0] == grid[0][1] && grid[0][1] == grid[0][2]) {
			return true;
		} else if (grid[1][0] == grid[1][1] && grid[1][1] == grid[1][2]) {
			return true;
		} else if (grid[2][0] == grid[2][1] && grid[2][1] == grid[2][2]) {
			return true;
		} else if (grid[0][0] == grid[1][0] && grid[1][0] == grid[2][0]) {
			return true;
		} else if (grid[0][1] == grid[1][1] && grid[1][1] == grid[2][1]) {
			return true;
		} else if (grid[0][2] == grid[1][2] && grid[1][2] == grid[2][2]) {
			return true;
		} else if (grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2]) {
			return true;
		} else if (grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0]) {
			return true;
		}
		
		return false;
	}

}
