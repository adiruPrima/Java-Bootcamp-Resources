public class JavaMart {
    public static void main(String[] args) {
        double wallet = 100;

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

 
        double toyCar = 5.99;
        System.out.println("Can I get this car?");
       
        if (wallet >= toyCar) {
            System.out.println("Sure!");
            wallet -= toyCar;
            System.out.println("Wallet: $" + wallet);
        } else {
            System.out.println("Sorry, I only have $" + wallet + " left, while the nike shoes cost $" + toyCar);
        }

        
        double nike = 95.99;
        System.out.println("Can I get these nike shoes?");
        
        if (wallet >= nike) {
            System.out.println("Sure!");
            wallet -= nike;
            System.out.println("Wallet: $" + wallet);
        } else {
            System.out.println("Sorry, I only have $" + wallet + " left, while the nike shoes cost $" + nike);
        }

    }
}
