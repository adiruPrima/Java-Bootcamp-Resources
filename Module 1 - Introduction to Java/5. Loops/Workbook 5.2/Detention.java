import java.util.Scanner;

public class Detention {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hi Bart. I can write lines for you.\nWhat do you want me to write?");
        // See Learn the Part for the instructions.
        String sentence = scan.nextLine();

        System.out.print("How many times do you want me to write it? ");
        int n = scan.nextInt();
        scan.nextLine();

        System.out.println();
        for (int i = 0; i <= n; i++) {
            System.out.println(sentence);
        }
        scan.close();
    }
}
