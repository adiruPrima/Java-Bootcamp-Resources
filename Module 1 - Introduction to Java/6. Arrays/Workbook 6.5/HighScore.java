public class HighScore {
    public static void main(String[] args) {
        
        int highScore = 0;

        int[] scores = new int[10];
        
        // Instructions for this workbook are on Learn the Part (Workbook 6.5).

        System.out.print("Here are the scores: ");

        for (int i = 0; i < 10; i++) {
            scores[i] = rand();
            System.out.print(scores[i] + " ");
            if (highScore < scores[i]) highScore = scores[i];
        }

        System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");
        
    }    

    public static int rand() {
        return (int)(Math.random() * 50000);
    }

}
