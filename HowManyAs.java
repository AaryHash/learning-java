import java.util.Scanner;

public class HowManyAs {

    public static void main(String[] args) {
        // User inputs a string, program outputs how many times the string contained the
        // letter "a"
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string:");
        String entry = sc.nextLine().toLowerCase();

        sc.close();

        // length
        int length = entry.length();

        int amount = 0;

        // for loop
        for (int i = 0; i < length; i++) {
            if (entry.charAt(i) == 'a') {
                amount++;
            }
        }

        // print
        System.out.println("\nNumber of a's: " + amount);
    }

}
