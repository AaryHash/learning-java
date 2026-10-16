import java.util.Scanner;
import java.text.DecimalFormat;

public class BMICalculator {

	public static void main(String[] args) {
		// User inputs height and weight, program outputs BMI results
		DecimalFormat df = new DecimalFormat("#,###,###,###.00");
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your Weight (in pounds): ");
		int weight = sc.nextInt();

		System.out.print("Enter your Height (in inches): ");
		int height = sc.nextInt();

		sc.close();

		// pounds to kilograms and inches to meters
		double kilograms = weight * 0.4535927;
		double meters = height * 0.0254;

		// bmi
		double bmi = kilograms / Math.pow(meters, 2);

		// if-else statement
		if (bmi < 18.5) {
			System.out.println("Your BMI is: " + df.format(bmi));
			System.out.println("Results: Underweight");
		} else if (bmi < 25) {
			System.out.println("Your BMI is: " + df.format(bmi));
			System.out.println("Results: Normal");
		} else if (bmi < 30) {
			System.out.println("Your BMI is: " + df.format(bmi));
			System.out.println("Results: Overweight");
		} else {
			System.out.println("Your BMI is: " + df.format(bmi));
			System.out.println("Results: Obese");
		}

	}

}
