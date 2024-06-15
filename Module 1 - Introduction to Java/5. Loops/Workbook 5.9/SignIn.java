import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        String username = "Samantha";
        String password = "Java <3";
        
        /* Task 1 
            1. Pick up a username and password from the user.
       */
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Javagram! Sign in below\n");
        System.out.print("- Username: ");
        //pick up username
        String myUsername = scan.nextLine();
        System.out.print("- Password: ");
        //pick up password
        String myPassword = scan.nextLine();

        // see Learn the Part for the remaining instructions.
        
        
        /* will be useful for task 2
        
            System.out.println("\nIncorrect, please try again!\n");
            System.out.print("- Username: ");
            usernameEntry = scan.nextLine();
            System.out.print("- Password: ");
            passwordEntry = scan.nextLine();

        
        */
        while (!password.equals(myPassword) || !username.equals(myUsername)) {
            System.out.println("\nIncorrect, please try again!\n");
            System.out.print("- Username: ");
            myUsername = scan.nextLine();
            System.out.print("- Password: ");
            myPassword = scan.nextLine();
        }

        System.out.println("\nWelcome back, " + username + "!");

        scan.close();
        
    }
}
