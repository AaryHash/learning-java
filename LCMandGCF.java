import java.util.Scanner;

public class LCMandGCF {

	public static void main(String[] args) {
		// User inputs two numbers, program outputs either LCM or GCF depending on
		// user's choice
		Scanner sc = new Scanner(System.in);
		int choice, gcf, lcm, num1, num2;

		// prompt for numbers and choice
		System.out.print("Enter two numbers: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		System.out.println("Choose to find: ");
		System.out.println("1 - Greatest Common Factor");
		System.out.println("2 - Least Common Multiple");
		choice = sc.nextInt();

		// if else for choice
		if (choice == 1) {
			gcf = GCF(num1, num2);
			System.out.println("GCF of " + num1 + " and " + num2 + ": " + gcf);
		} else if (choice == 2) {
			lcm = LCM(num1, num2);
			System.out.println("LCM of " + num1 + " and " + num2 + ": " + lcm);
		} else {
			System.out.println("Invalid Entry. Program ending...");
		}

		sc.close();

	}

	public static int GCF(int num1, int num2) {
		int gcf = 0;

		// for loop for finding gcf
		for (int i = 1; i <= num1; i++) {
			if (((num1 % i) == 0) && ((num2 % i) == 0)) {
				gcf = i;
			}
		}
		return gcf;
	}

	public static int LCM(int num1, int num2) {
		// call for gcf
		int gcf = GCF(num1, num2);
		int lcm = (num1 * num2) / gcf;

		return lcm;
	}

}
