import java.util.Scanner;

public class CountingTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // See Learn the Part for the instructions.
        System.out.print("Hey Timmy, chose a number to count to: ");
        int n = scan.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println();

        scan.close();
    }
}
