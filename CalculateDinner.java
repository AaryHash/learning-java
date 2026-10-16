import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculateDinner {

	public static void main(String[] args) {
		// User inputs dinner pricing information, program outputs total and change
		// required
		DecimalFormat df = new DecimalFormat("$#,###,###,###,###,###.00");
		Scanner sc = new Scanner(System.in);

		// Prompt user for costs
		System.out.print("How much did your dinner cost? ");
		double dinner = sc.nextDouble();

		System.out.print("How much did your drink cost? ");
		double drink = sc.nextDouble();

		System.out.print("How much did your dessert cost? ");
		double dessert = sc.nextDouble();
		System.out.println("");

		// Current total meal cost
		double cost = dinner + drink + dessert;
		System.out.println("Meal Cost: " + df.format(cost));

		// Tax
		double tax = cost * .06625;
		System.out.println("Tax: " + df.format(tax));

		// Tip
		double withTax = cost + tax;
		double tip = withTax * .20;
		System.out.println("Added Tip: " + df.format(tip));

		// Round tip
		double tipRounded = Math.round(tip);
		System.out.println("Rounded Tip: " + df.format(tipRounded));
		System.out.println("---------------");

		// Final cost
		double totalCost = cost + tax + tipRounded;
		System.out.println("Total: " + df.format(totalCost));

		// Prompt user for how much they paid and find change
		System.out.print("How much did you pay? ");
		int payment = sc.nextInt();
		sc.close();

		double change = payment - totalCost;
		System.out.print("Your change is: " + df.format(change));
	}

}
