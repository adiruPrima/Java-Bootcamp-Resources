import java.util.Scanner;
public class Grocer {
    public static void main(String[] args) {
        
        // Instructions for this workbook are on Learn the Part (Workbook 6.3).
        String[] aisles = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};

        Scanner scan = new Scanner(System.in);
        
        System.out.print("\nSearch item: ");
        String item = scan.nextLine();
        item = item.toLowerCase();

        boolean found = false;

        for (int i = 0; i < aisles.length; i++) {
            if (item.equals(aisles[i])) {
                System.out.println("\nWe have that in aisle: " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Sorry, we don't have that here.");
        }
    
        scan.close();
    }
}
