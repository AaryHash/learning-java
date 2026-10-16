import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateFormatting {

	public static void main(String[] args) {
		// User inputs desired date format, program outputs current date in specified
		// format
		Scanner sc = new Scanner(System.in);
		Calendar cal = new GregorianCalendar();

		int choice, dayOfWeek, date, month, year;

		System.out.println("Choose one of the following formats:");
		System.out.println("1 - mm/dd/yyyy");
		System.out.println("2 - dd/mm/yyyy");
		System.out.println("3 - yyyy/mm/dd");
		System.out.println("4 - yyyy/dd/mm");
		System.out.println("5 - Day of the Week month dd, yyyy");
		choice = sc.nextInt();

		// Get calendar info
		dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

		date = cal.get(Calendar.DATE);

		month = cal.get(Calendar.MONTH);
		month += 1;

		year = cal.get(Calendar.YEAR);

		// Call method
		formatDate(choice, dayOfWeek, date, month, year);

		sc.close();

	}

	// Formatting date
	public static void formatDate(int choice, int dayOfWeek, int date, int month, int year) {
		switch (choice) {
			case 1:
				System.out.println(month + "/" + date + "/" + year);
				break;
			case 2:
				System.out.println(date + "/" + month + "/" + year);
				break;
			case 3:
				System.out.println(year + "/" + month + "/" + date);
				break;
			case 4:
				System.out.println(year + "/" + date + "/" + month);
				break;
			case 5:
				dayOfWeek(dayOfWeek);
				month(month);
				System.out.print(date + ", ");
				System.out.print(year);
				break;
			default:
				System.out.println("Invalid input. Program ending...");
		}
	}

	// Formatting day of the week into string
	public static void dayOfWeek(int dayOfWeek) {
		switch (dayOfWeek) {
			case 1:
				System.out.print("Sunday ");
				break;
			case 2:
				System.out.print("Monday ");
				break;
			case 3:
				System.out.print("Tuesday ");
				break;
			case 4:
				System.out.print("Wednesday ");
				break;
			case 5:
				System.out.print("Thursday ");
				break;
			case 6:
				System.out.print("Friday ");
				break;
			case 7:
				System.out.print("Saturday ");
				break;
			default:
				System.out.println("Error. Program ending...");
		}
	}

	// Formatting month into string
	public static void month(int month) {
		switch (month) {
			case 1:
				System.out.print("January ");
				break;
			case 2:
				System.out.print("February ");
				break;
			case 3:
				System.out.print("March ");
				break;
			case 4:
				System.out.print("April ");
				break;
			case 5:
				System.out.print("May ");
				break;
			case 6:
				System.out.print("June ");
				break;
			case 7:
				System.out.print("July ");
				break;
			case 8:
				System.out.print("August ");
				break;
			case 9:
				System.out.print("September ");
				break;
			case 10:
				System.out.print("October ");
				break;
			case 11:
				System.out.print("November ");
				break;
			case 12:
				System.out.print("December ");
				break;
			default:
				System.out.println("Error. Program ending...");
		}
	}

}
