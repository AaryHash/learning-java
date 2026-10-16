import java.util.Scanner;

public class CharactersCount {

	public static void main(String[] args) {
		// User inputs a message, program returns information about characters in
		// message
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a message:");
		String entry = sc.nextLine();

		sc.close();

		// for loop
		System.out.println("Message: " + entry);

		int length = entry.length();
		System.out.println("Total Characters: " + length);

		entry = entry.toLowerCase();

		int spaces = 0;
		int vowels = 0;
		int consonants = 0;
		int numbers = 0;
		int others = 0;

		for (int i = 0; i < length; i++) {
			switch (entry.charAt(i)) {
				case ' ':
					spaces++;
					break;
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				case 'y':
					vowels++;
					break;
				case 'b':
				case 'c':
				case 'd':
				case 'f':
				case 'g':
				case 'h':
				case 'j':
				case 'k':
				case 'l':
				case 'm':
				case 'n':
				case 'p':
				case 'q':
				case 'r':
				case 's':
				case 't':
				case 'v':
				case 'w':
				case 'x':
				case 'z':
					consonants++;
					break;
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
				case '8':
				case '9':
				case '0':
					numbers++;
					break;
				default:
					others++;
			}

		}

		System.out.println("Number of Spaces: " + spaces);
		System.out.println("Number of Vowels: " + vowels);
		System.out.println("Number of Consonants: " + consonants);
		System.out.println("Number of Numbers: " + numbers);
		System.out.println("Number of Other Characters: " + others);

	}

}
