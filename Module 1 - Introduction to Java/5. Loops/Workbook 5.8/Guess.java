import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {

       System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        
       Scanner scan = new Scanner(System.in);
       
       //See Learn the Part for detailed instructions.
       int rand = (int) (Math.random() * 5) + 1;
       int guess = scan.nextInt();
       while (guess != rand) {
        System.out.println("You guessed wrong, try again!");
        System.out.print("Guess between 1 and 5: ");
        guess = scan.nextInt();
       }
       System.out.println("Congrats! You guessed the right answer, which is " + rand);
        
        scan.close();
    }

}
