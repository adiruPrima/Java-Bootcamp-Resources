public class AppleStore {
    public static void main(String[] args) {
        int numOfApples = 0;
        int numOfCustomers = 0;
        double profit = 0;

        // Instructions for this workbook are on Learn the Part (see the Udemy Video: Workbook 2.3 to access the link).

        System.out.println("You picked 500 apples from an apple orchard");
        numOfApples += 500;
        
        System.out.println("Time for business! You're selling each apple for 40 cents");
        float price = 0.40f;

        System.out.println("One customer walked in. He bought 4 apples!");
        numOfCustomers += 1;
        numOfApples -= 4;
        profit += price * 4;

        System.out.println("Another customer walked in. He bought 20 apples!");
        numOfCustomers += 1;
        numOfApples -= 20;
        profit += price * 20;

        System.out.println("Another customer walked in. She bought 200 apples!");
        numOfCustomers += 1;
        numOfApples -= 200;
        profit += price * 200;
        

        System.out.printf("Wow! So far, you made: $%.1f", profit);
        System.out.println();
        System.out.println(numOfCustomers + " customers love your apples.");
        System.out.println("You have "+ numOfApples +" apples left.");

        // Compare your result to what's on Learn the Part.  
        
    }

}
