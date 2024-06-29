import java.util.Scanner;
import java.util.Arrays;

public class Hangman {

    public static Scanner scan = new Scanner(System.in);

    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
    "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
    "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
    "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
    "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
    "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
    "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
    "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
    "wombat", "zebra"};

    public static String[] gallows = {"+---+\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|   |\n" +
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + //if you were wondering, the only way to print '\' is with a trailing escape character, which also happens to be '\'
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "/    |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "/ \\  |\n" +
    "     |\n" +
    " =========\n"};

    public static void main(String[] args) {

        System.out.println("Welcome to Hangman, press enter to continue.");
        scan.nextLine();

        boolean gameOver = false;
        int lives = 6;
        String answer = getRandomWord(words);
        char[] answerArray = answer.toCharArray();
        char[] word = new char[answer.length()];
        String misses = "";

        for (int i = 0; i < word.length; i++) {
            word[i] = '_';
        }

        while (!gameOver) {
            printStatus(lives, word, misses);
            System.out.print("\nGuess: ");
            String guess = scan.nextLine();
            guess = isInputCorrect(guess).toLowerCase();
            guess = alreadyGuessed(guess, word, misses);

            // check if guess is correct
            if (answer.contains(guess)) {
                char guessChar = guess.charAt(0);
                // word[answer.indexOf(guess)] = guessChar;
                for (int i = 0; i < word.length; i++) {
                    if (answerArray[i] == guessChar) {
                        word[i] = guessChar;
                    }
                }
            } else {
                misses += guess;
                lives--;
            }

            // determine win or lose
            if (!Arrays.toString(word).contains("_") && lives > 0) {
                gameOver = true;
                System.out.println("\n-------------------------");
                System.out.println("\nYou guessed " + answer + "!");
                System.out.println("Congrats, you win!!");
            }

            if (lives == 0) {
                gameOver = true;
                System.out.println("\n-------------------------");
                System.out.println(gallows[6]);
                System.out.println("The answer was " + answer);
                System.out.println("\nYou've used up all your lives");
                System.out.println("You Die!!");
            }
        }
    }

    // Generate random word from the databank
    public static String getRandomWord(String[] words) {
        int randomIndex = (int) (Math.random() * words.length);
        return words[randomIndex];
    }

    // Print game status
    public static void printStatus(int lives, char[] word, String misses) {
        String wordStr = "";
        for (int i = 0; i < word.length; i++) {
            wordStr += word[i];
        }
        System.out.println(gallows[6 - lives]);
        System.out.println("\nWord: " + wordStr);
        System.out.println("\nMisses: " + misses);
    }

    // Check if user input is in correct format
    public static String isInputCorrect(String guess) {
        while (guess.length() != 1 || !guess.matches("[a-zA-Z]+")) {
            System.out.println("\n- Please only enter a single alphabetical character -");
            System.out.print("\nGuess: ");
            guess = scan.nextLine();
        }
        return guess;
    }

    // Check if user already guessed the letter
    public static String alreadyGuessed(String guess, char[] word, String misses) {
        String guessed = "";
        String wordStr = "";
        for (int i = 0; i < word.length; i++) {
            wordStr += word[i];
        }
        guessed = wordStr + misses;
        while (guessed.contains(guess)) {
            System.out.println("\n- Already guessed " + guess + ", please guess again -");
            System.out.print("\nGuess: ");
            guess = scan.nextLine();
        }
        return guess;
    }
}





