import java.util.Scanner;

public class SimplifyingARadical {

	public static void main(String[] args) {
		// User inputs number, program outputs radical (simplified if possible)
		Scanner sc = new Scanner(System.in);

		int radicand, outside = 0, inside = 0, perfSq, factor = 0;

		System.out.print("Enter an integer > 0: ");
		radicand = sc.nextInt();

		sc.close();

		// 1st do while
		do {
			factor++;
			perfSq = factor * factor;
		} while (perfSq < radicand);

		// 2nd do while
		do {
			if ((radicand % perfSq) == 0) {
				outside = factor;
				inside = radicand / perfSq;
				break;
			} else {
				factor--;
				perfSq = factor * factor;
			}
		} while (factor > 1);

		// print if else
		if (factor == 1) {
			System.out.println("√" + radicand + " cannot be simplified");
		} else {
			if (inside == 1) {
				System.out.println("√" + radicand + " = " + outside);
			} else {
				System.out.println("√" + radicand + " = " + outside + "√" + inside);
			}
		}

	}

}
