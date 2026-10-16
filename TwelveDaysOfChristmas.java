import java.util.Scanner;

public class TwelveDaysOfChristmas {

	public static void main(String[] args) {
		// User inputs a number from 1-12, program outputs the day's lyrics from 12 Days
		// of Christmas
		Scanner sc = new Scanner(System.in);

		System.out.print("What day of Christmas is it? (1-12): ");
		int day = sc.nextInt();

		sc.close();

		// Switch statement for initial line
		switch (day) {
			case 1:
				System.out.println("On the 1st day of Christmas, your true love sent to you:");
				break;
			case 2:
				System.out.println("On the 2nd day of Christmas, your true love sent to you:");
				break;
			case 3:
				System.out.println("On the 3rd day of Christmas, your true love sent to you:");
				break;
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:
				System.out.println("On the " + day + "th day of Christmas, your true love sent to you:");
				break;
			default:
				System.out.println(
						"There are only 12 Days of Christmas. Try again! Maybe you'll finally get that Xbox this year.");
		}

		// Switch statement for true love's gifts
		switch (day) {
			case 12:
				System.out.println("- Twelve (12) drummers drumming");
			case 11:
				System.out.println("- Eleven (11) pipers piping");
			case 10:
				System.out.println("- Ten (10) lords a-leaping");
			case 9:
				System.out.println("- Nine (9) ladies dancing");
			case 8:
				System.out.println("- Eight (8) maids a-milking");
			case 7:
				System.out.println("- Seven (7) swans a-swimming");
			case 6:
				System.out.println("- Six (6) geese a-laying");
			case 5:
				System.out.println("- FIVE (5) GOLD RINGS");
			case 4:
				System.out.println("- Four (4) calling birds");
			case 3:
				System.out.println("- Three (3) french hens");
			case 2:
				System.out.println("- Two (2) turtle doves");
			case 1:
				System.out.println("- One (1) partridge in a pear tree");
		}

	}

}
