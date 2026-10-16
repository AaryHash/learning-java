import java.util.Scanner;

public class PasswordChecker {

	public static void main(String[] args) {
		// scanner object and prompt user
			Scanner sc = new Scanner(System.in);
		
			System.out.print("Enter a password: ");
			String password = sc.nextLine();
			sc.close();
			
		// nested if else
			if (password.length() >= 6) {
				if (password.contains("1") || password.contains("2") || password.contains("3") || password.contains("4") ||
					password.contains("5") || password.contains("6") || password.contains("7") || password.contains("8") ||
					password.contains("9") || password.contains("0")) {
					if (password.contains("q") || password.contains("w") || password.contains("e") || password.contains("r") ||
						password.contains("t") || password.contains("y") || password.contains("u") || password.contains("i") ||
						password.contains("o") || password.contains("p") || password.contains("a") || password.contains("s") ||
						password.contains("d") || password.contains("f") || password.contains("g") || password.contains("h") ||
						password.contains("j") || password.contains("k") || password.contains("l") || password.contains("z") ||
						password.contains("x") || password.contains("c") || password.contains("v") || password.contains("b") ||
						password.contains("n") || password.contains("m")) {
						if (password.contains("Q") || password.contains("W") || password.contains("E") || password.contains("R") ||
							password.contains("T") || password.contains("Y") || password.contains("U") || password.contains("I") ||
							password.contains("O") || password.contains("P") || password.contains("A") || password.contains("S") ||
							password.contains("D") || password.contains("F") || password.contains("G") || password.contains("H") ||
							password.contains("J") || password.contains("K") || password.contains("L") || password.contains("Z") ||
							password.contains("X") || password.contains("C") || password.contains("V") || password.contains("B") ||
							password.contains("N") || password.contains("M")) {
							if (password.contains("!") || password.contains("@") || password.contains("#") || password.contains("$") ||
								password.contains("%") || password.contains("^") || password.contains("&") || password.contains("*") ||
								password.contains("(") || password.contains(")")) {
								if (password.length() <= 8) {
									System.out.println("Your password is valid but weak. Consider making it longer.");
								} else if (password.length() <= 12) {
									System.out.println("Your password is moderately strong. Could be made a little longer.");
								} else {
									System.out.println("Your password is STRONG!");
								}
							} else {
								System.out.println("Password does not contain a special character. Your password must: ");
								System.out.println("- Be at least 6 characters.");
								System.out.println("- Contain at least 1 number.");
								System.out.println("- Contain at least 1 lowercase letter.");
								System.out.println("- Contain at least 1 uppercase letter.");
								System.out.println("- Contain at least 1 special character.");
							}
						} else {
							System.out.println("Password does not contain a uppercase letter. Your password must: ");
							System.out.println("- Be at least 6 characters.");
							System.out.println("- Contain at least 1 number.");
							System.out.println("- Contain at least 1 lowercase letter.");
							System.out.println("- Contain at least 1 uppercase letter.");
							System.out.println("- Contain at least 1 special character.");
						}
					} else {
						System.out.println("Password does not contain a lowercase letter. Your password must: ");
						System.out.println("- Be at least 6 characters.");
						System.out.println("- Contain at least 1 number.");
						System.out.println("- Contain at least 1 lowercase letter.");
						System.out.println("- Contain at least 1 uppercase letter.");
						System.out.println("- Contain at least 1 special character.");
					}
				} else {
					System.out.println("Password does not contain a number. Your password must: ");
					System.out.println("- Be at least 6 characters.");
					System.out.println("- Contain at least 1 number.");
					System.out.println("- Contain at least 1 lowercase letter.");
					System.out.println("- Contain at least 1 uppercase letter.");
					System.out.println("- Contain at least 1 special character.");
				}
			} else {
				System.out.println("Password is too short. Your password must: ");
				System.out.println("- Be at least 6 characters.");
				System.out.println("- Contain at least 1 number.");
				System.out.println("- Contain at least 1 lowercase letter.");
				System.out.println("- Contain at least 1 uppercase letter.");
				System.out.println("- Contain at least 1 special character.");
			}

	}

}
