import java.text.DecimalFormat;
import java.util.Scanner;

public class LoanCalculator {

	public static void main(String[] args) {
		// User inputs loan information, program outputs stats about loan
		DecimalFormat df = new DecimalFormat("$#,###,###,###,###,###,###,###,###,###.00");
		Scanner sc = new Scanner(System.in);

		// Prompt user for information
		System.out.print("Enter an initial loan amount: ");
		int loanAmount = sc.nextInt();

		System.out.print("Enter an interest rate: ");
		double annualInterestRate = sc.nextDouble();

		System.out.print("Number of years for loan: ");
		int numberOfYears = sc.nextInt();

		// Declare monthly interest rate
		double monthlyInterestRate = annualInterestRate / 1200.0;

		// Monthly payment formula
		double onePlusMonthlyRate = 1.0 + monthlyInterestRate;
		int twelveTimesYears = numberOfYears * 12;

		double monthlyPayment;
		monthlyPayment = (loanAmount * monthlyInterestRate)
				/ (1 - (1 / Math.pow(onePlusMonthlyRate, twelveTimesYears)));

		// Total payment formula
		double totalPayment = monthlyPayment * numberOfYears * 12;

		// Print
		System.out.println("");
		System.out.println("Initial Loan: " + df.format(loanAmount));
		System.out.println("Interest Rate: " + annualInterestRate + "%");
		System.out.println("Monthly Payments: " + df.format(monthlyPayment) + "/month");
		System.out.println("Years of Payment: " + numberOfYears);
		System.out.println("Total Interest Payment: " + df.format(totalPayment));

		sc.close();

	}

}
