import java.util.Scanner;

public class Factorials {

    public static void main(String[] args) {
        // User inputs a number, program outputs number's factorial (n * n-1 * n-2... *
        // 1)
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        sc.close();

        // for loop
        int factorial = 1;
        for (int i = num; i > 1; i--) {
            factorial = factorial * i;
        }

        System.out.println("Factorial of " + num + " is: " + factorial);

    }

}
