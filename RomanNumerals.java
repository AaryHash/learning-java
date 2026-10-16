import java.util.Scanner;

public class RomanNumerals {

	public static void main(String[] args) {
		// User inputs number from 1 to 1,000, program returns input's Roman Numeral
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter an integer from [1,1000]: ");
			int num = sc.nextInt();
			
			sc.close();
			
		// If else and switch statements for figuring out the Roman numerals
			if (num >= 1 && num <= 999) {
				int hundreds = num / 100;
				int tens = (num / 10) % 10;
				int ones = num % 10;
				
				System.out.print("Roman Numeral: ");
				
				switch (hundreds) {
				case 0:
					break;
				case 1:
					System.out.print("C");
					break;
				case 2:
					System.out.print("CC");
					break;
				case 3:
					System.out.print("CCC");
					break;
				case 4:
					System.out.print("CD");
					break;
				case 5:
					System.out.print("D");
					break;
				case 6:
					System.out.print("DC");
					break;
				case 7:
					System.out.print("DCC");
					break;
				case 8:
					System.out.print("DCCC");
					break;
				case 9:
					System.out.print("CM");
					break;
				default:
					System.out.println("Error: Please try again.");
				}
				
				switch (tens) {
				case 0:
					break;
				case 1:
					System.out.print("X");
					break;
				case 2:
					System.out.print("XX");
					break;
				case 3:
					System.out.print("XXX");
					break;
				case 4:
					System.out.print("XL");
					break;
				case 5:
					System.out.print("L");
					break;
				case 6:
					System.out.print("LX");
					break;
				case 7:
					System.out.print("LXX");
					break;
				case 8:
					System.out.print("LXXX");
					break;
				case 9:
					System.out.print("XC");
					break;
				default:
					System.out.println("Error: Please try again.");
				}
				
				switch (ones) {
				case 0:
					break;
				case 1:
					System.out.print("I");
					break;
				case 2:
					System.out.print("II");
					break;
				case 3:
					System.out.print("III");
					break;
				case 4:
					System.out.print("IV");
					break;
				case 5:
					System.out.print("V");
					break;
				case 6:
					System.out.print("VI");
					break;
				case 7:
					System.out.print("VII");
					break;
				case 8:
					System.out.print("VIII");
					break;
				case 9:
					System.out.print("IX");
					break;
				default:
					System.out.println("Error: Please try again.");
				}
			} else if (num == 1000) {
				System.out.println("Roman Numeral: M");
			} else {
				System.out.println("Invalid entry. Please enter an integer from [1, 1000]!");
			}

	}

}
