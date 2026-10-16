import java.util.Scanner;
import java.text.DecimalFormat;

public class QuadraticSolutions {

	public static void main(String[] args) {
		// User inputs numbers for the quadratic formula, program returns the number of
		// possible solutions (imaginary or real)
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###,###,###,###,###,###,###,###.###");

		// prompt user
		System.out.print(
				"Hello user. The quadratic formula is commonly depicted as y = ax^2 + bx + c.\nPlease input a: ");
		double a = sc.nextDouble();

		System.out.print("Please input b: ");
		double b = sc.nextDouble();

		System.out.print("Please input c: ");
		double c = sc.nextDouble();

		sc.close();

		// calculate discriminant
		double discriminant = (b * b) - (4 * a * c);

		// if else statements
		System.out.println(
				"The equation is: y = " + df.format(a) + "x^2 + " + df.format(b) + "x + " + df.format(c) + ".");

		if (discriminant > 0) {
			double realSolution1 = (-b + Math.sqrt(discriminant)) / (2 * a);
			double realSolution2 = (-b - Math.sqrt(discriminant)) / (2 * a);

			System.out.println("This equation has two real solutions. They are x = " + df.format(realSolution1)
					+ " and x = " + df.format(realSolution2) + ".");
		} else if (discriminant < 0) {
			System.out.println("This equation has two imaginary solutions.");
		} else {
			double soloSolution = (-b + Math.sqrt(discriminant)) / (2 * a);

			System.out.println("This equation has one real solution. It is x = " + df.format(soloSolution) + ".");
		}
	}

}
