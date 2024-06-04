import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        
        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a day: ");
        String day = scan.nextLine();
        System.out.println("\nHey, are you free on " + day + "? \n");


        System.out.println("Hmm, let me check my calendar.");
        
        //Check 'calendar' here:        
        switch (day) {
            case "Monday":
                System.out.println("Sorry, overtime calls");
                break;
            case "Tuesday":
                System.out.println("No can do bro, busy");
                break;
            case "Wednesday":
                System.out.println("Sorry, working late");
                break;
            case "Thursday":
                System.out.println("I have a date night");
                break;
            case "Friday":
                System.out.println("I'm free");
                break;
            case "Saturday":
                System.out.println("I'm free");
                break;
            case "Sunday":
                System.out.println("Sorry, me time!");
                break;
            default:
                System.out.println("That's not even a day bruh...");
                break;
        }

        scan.close();

    }
}
