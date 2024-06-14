import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        // See Learn the Part for detailed instructions.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int num = scan.nextInt();

        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " - even");
            } else {
                System.out.println(i + " - odd");
            }
        }
        scan.close();
    }
}
