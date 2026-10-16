import java.util.Scanner;

public class BoxOfNumbers {

    public static void main(String[] args) {
        // User inputs height and width, program outputs box of #s in the requested size
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height: ");
        int height = sc.nextInt();

        System.out.print("Enter width: ");
        int width = sc.nextInt();

        sc.close();

        // for loops
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }

    }

}
