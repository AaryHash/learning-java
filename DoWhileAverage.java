import java.util.Scanner;

public class DoWhileAverage {

	public static void main(String[] args) {
		// User inputs numbers until deciding to end, program outputs average of all
		// inputted numbers
		Scanner sc = new Scanner(System.in);

		double sum = 0, average, num;
		int numVals = 0;

		do {
			System.out.print("Enter a positive number (or -1 to stop): ");
			num = sc.nextDouble();

			if (num != -1) {
				sum = sum + num;
				numVals++;
			}
		} while (num != -1);

		average = sum * 1.0 / numVals;
		System.out.println("The average of the numbers entered is " + average);

		sc.close();

	}

}
