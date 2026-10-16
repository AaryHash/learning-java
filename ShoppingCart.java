import java.util.Scanner;
import java.text.DecimalFormat;

public class ShoppingCart {

	public static void main(String[] args) {
		// User inputs desired items and shipping time, program outputs total cost
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("$#,###,###,###,###,###,###,##0.00");

		// Variables
		boolean xbox = false;
		double xboxCost = 499.99;

		boolean card = false;
		double cardCost = 1.99;

		boolean poster = false;
		double posterCost = 9.99;

		boolean plant = false;
		double plantCost = 99.99;

		boolean milk = false;
		double milkCost = 0.99;

		boolean loop = true;

		// While loop for shopping menu
		while (loop == true) {
			// Initial prompt
			System.out.println("Welcome to Ace Corp. Here's today's stock:");
			System.out.println("1) 1 Xbox Series X - " + df.format(xboxCost));
			System.out.println("2) 1 Birthday Card - " + df.format(cardCost));
			System.out.println("3) 1 Live Love Laugh Poster - " + df.format(posterCost));
			System.out.println("4) 1 Plant - " + df.format(plantCost));
			System.out.println("5) 1 Gallon of Milk - " + df.format(milkCost));

			System.out.print("Please enter a number for your desired product: ");
			int choice = sc.nextInt();

			// Switch statement for chosen item
			switch (choice) {
				case 1:
					if (xbox == false) {
						xbox = true;
						System.out.println("Xbox Series X added to cart!");
						System.out.println("1) Checkout");
						System.out.println("2) Continue Shopping");
						choice = sc.nextInt();
					} else {
						System.out.println("Sorry! There is only one of each item in stock.");
						System.out.println("1) Checkout");
						System.out.println("2) Continue Shopping");
						choice = sc.nextInt();
					}
					break;
				case 2:
					if (card == false) {
						card = true;
						System.out.println("Birthday Card added to cart!");
						System.out.println("1) Checkout");
						System.out.println("2) Continue Shopping");
						choice = sc.nextInt();
					} else {
						System.out.println("Sorry! There is only one of each item in stock.");
						System.out.println("1) Checkout");
						System.out.println("2) Continue Shopping");
						choice = sc.nextInt();
					}
					break;
				case 3:
					if (poster == false) {
						poster = true;
						System.out.println("Live Love Laugh Poster added to cart!");
						System.out.println("1) Checkout");
						System.out.println("2) Continue Shopping");
						choice = sc.nextInt();
					} else {
						System.out.println("Sorry! There is only one of each item in stock.");
						System.out.println("1) Checkout");
						System.out.println("2) Continue Shopping");
						choice = sc.nextInt();
					}
					break;
				case 4:
					if (plant == false) {
						plant = true;
						System.out.println("Plant added to cart!");
						System.out.println("1) Checkout");
						System.out.println("2) Continue Shopping");
						choice = sc.nextInt();
					} else {
						System.out.println("Sorry! There is only one of each item in stock.");
						System.out.println("1) Checkout");
						System.out.println("2) Continue Shopping");
						choice = sc.nextInt();
					}
					break;
				case 5:
					if (milk == false) {
						milk = true;
						System.out.println("Gallon of Milk added to cart!");
						System.out.println("1) Checkout");
						System.out.println("2) Continue Shopping");
						choice = sc.nextInt();
					} else {
						System.out.println("Sorry! There is only one of each item in stock.");
						System.out.println("1) Checkout");
						System.out.println("2) Continue Shopping");
						choice = sc.nextInt();
					}
					break;
				default:
			}

			// If else for choice of checkout or more shopping
			double cost = 0;
			double shipping = 0;

			if (choice == 1) {
				loop = false;
				// Find cost of items
				if (xbox == true) {
					cost = cost + xboxCost;
				}
				if (card == true) {
					cost = cost + cardCost;
				}
				if (poster == true) {
					cost = cost + posterCost;
				}
				if (plant == true) {
					cost = cost + plantCost;
				}
				if (milk == true) {
					cost = cost + milkCost;
				}

				// Switch statement for shipping cost
				System.out.println("Would you like:\n1) Normal Shipping\n2) Expedited Shipping");
				choice = sc.nextInt();

				switch (choice) {
					case 1:
						System.out.println("Choose your timezone:\n1) PST\n2) MST\n3) CST\n4) EST");
						choice = sc.nextInt();
						switch (choice) {
							case 1:
								shipping = 8.99;
								break;
							case 2:
								shipping = 6.99;
								break;
							case 3:
								shipping = 4.99;
								break;
							case 4:
								shipping = 2.99;
								break;
							default:
								// Modern Note: Could've added a boolean to check if these switches defaulted,
								// and then not display the total
								System.out.print("Invalid response. Please disregard the following and restart.");
						}
						break;
					case 2:
						shipping = 14.99;
						break;
					default:
						System.out.print("Invalid response. Please disregard the following and restart.");
				}

				// Find tax
				double tax = (cost + shipping) * 0.0509;

				// Return costs and total
				double total = cost + shipping + tax;
				System.out.println("Cost: " + df.format(cost));
				System.out.println("Estimated Tax: " + df.format(tax));
				System.out.println("Shipping and Handling: " + df.format(shipping));
				System.out.println("Total: " + df.format(total));

			} else if (choice == 2) {

			} else {
				loop = false;
				System.out.println("Invalid option. Please restart.");
			}

		}

		sc.close();

	}

}
