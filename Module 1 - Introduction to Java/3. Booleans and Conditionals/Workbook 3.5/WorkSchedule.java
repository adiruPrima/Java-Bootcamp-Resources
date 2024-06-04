import java.util.Scanner;

public class WorkSchedule {
    public static void main(String[] args) {
        
        // See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter day number (e.g Monday => 1): ");
        int day = scan.nextInt();  

        System.out.print("Enter true or false if it's holiday: ");
        boolean holiday = scan.nextBoolean();

        // IF - ELSE IF - ELSE HERE!
        if (holiday) {
            System.out.println("Hell yeah!!!");
        } else if (day < 6) {
            System.out.println("I work...");
        } else {
            System.out.println("It's weekend, chill..");
        }
        
        scan.close();
    }
}
