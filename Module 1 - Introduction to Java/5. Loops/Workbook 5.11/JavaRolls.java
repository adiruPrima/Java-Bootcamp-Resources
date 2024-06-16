import java.util.Scanner;

public class JavaRolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // See Learn the Part for detailed instructions.
        
        int diceRoll = rollDice();
        int score = 0;

        System.out.println("Welcome to Java Rolls");
        System.out.println("Rules:");
        System.out.println("1. If you roll 6 the game is over.");
        System.out.println("2. If you roll 4 you keep rolling.");
        System.out.println("3. If you roll anything else you get a point.");
        System.out.println("4. Get at least 3 POINTS to WIN!");
        System.out.println("\nPress ENTER to start -->");
        scan.nextLine();

        while (true) {
            if (diceRoll == 6) {
                System.out.println("\nYou rolled 6, game finished.");
                break;
            } else if (diceRoll == 4) {
                System.out.println("\nYou rolled 4, keep rolling!");
                diceRoll = rollDice();
            } else {
                System.out.println("\nYou rolled " + diceRoll + ", you score a point");
                diceRoll = rollDice();
                score++;
            }
        }

        System.out.println("\n-----------------------------");
        System.out.println("Your total score is " + score + "!");
        if (score < 3) {
            System.out.println("You LOSE, loser!!!");
        } else {
            System.out.println("Hey hey, you WIN!!");
        }

        scan.close();
    }
  
    public static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

  
  
}
