import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        // See Learn the Part for detailed instructions.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scan.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " - FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " - Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + " - Buzz");
            } else {
                System.out.println(i);
            }
        }

        scan.close();

    }

}
