import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// User inputs string, program outputs if input is a palindrome
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter a string: ");
			String entry = sc.nextLine();
			
			sc.close();
			
			int length = entry.length();
			boolean palindrome = true;
			
		// For loop to check each char
			for (int i = 0; i < length; i++) {
				
				if (entry.charAt(i) == entry.charAt(length - (i + 1))) {
					
				} else {
					palindrome = false;
				}
			}
			
		// If else to return result
			if (palindrome == true) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

	}

}
