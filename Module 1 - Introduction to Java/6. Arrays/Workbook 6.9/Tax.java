import java.util.Arrays;

public class Tax {
    public static void main(String[] args) {
        double[] price = {1.99, 2.99, 3.99, 4.99};
        double[] afterTax = new double[price.length];

        // See instructions on Learn the Part (Workbook 6.9)
        for (int i = 0; i < price.length; i++) {
            afterTax[i] = price[i] * 1.13;
        }

        System.out.println("The original prices are: " + Arrays.toString(price));
        System.out.println("The original prices are: " + Arrays.toString(afterTax));

        // System.out.print("The original prices are: ");
        // for (int i = 0; i < price.length; i++) {
        //     System.out.print(price[i] + " ");
        // }

        // System.out.print("\n\nThe prices after tax are: ");
        // for (int i = 0; i < price.length; i++) {
        //     System.out.print(afterTax[i] + " ");
        // }
    }
}
