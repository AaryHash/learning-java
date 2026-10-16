import java.util.Random;

public class CoinFlipper {

	public static void main(String[] args) {
		// Program flips 1,000 coins and returns related statistics
			Random rand = new Random();
			
			int numHeads = 0, numTails = 0, numFlips = 1000;
			int streak = 0, headStreak = 0, tailStreak = 0;
			String headsTails = "Error!";
			
		// For loop
			for(int i = 1; i <= numFlips; i++) {
				boolean flip = rand.nextBoolean();
				
				if (flip) {
					numHeads ++;
					headStreak ++;
					tailStreak = 0;
					if (headStreak > streak) {
						streak = headStreak;
						headsTails = "Heads";
					}
				} else {
					numTails ++;
					tailStreak ++;
					headStreak = 0;
					if (tailStreak > streak) {
						streak = tailStreak;
						headsTails = "Tails";
					}
				}
			}
			
		// Print
			System.out.println("Heads: " + numHeads);
			System.out.println("Tails: " + numTails);
			
			if (streak == 1) {
				System.out.println("The highest streak was " + streak + " flip of " + headsTails + " in a row.");
			} else {
				System.out.println("The highest streak was " + streak + " flips of " + headsTails + " in a row.");	
			}

	}

}
