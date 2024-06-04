import java.util.Scanner;

public class WeatherNetwork {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the temperature in Celcius: ");
        int temp = scan.nextInt();

        String forecast = "";

        //IF - ELSE IF - ELSE STATEMENTS HERE!
        
        if (temp < 0) {
            forecast = "It's freezing balls bruh.. Stay cozy, wear a coat if outside.";
        } else if (temp <= 10) {
            forecast = "It's chilly, wear doubles; sweater, jacket, whatever you got.";
        } else {
            forecast = "It's a nice weather. Go touch grass!";
        }
        
        System.out.println(forecast);
        scan.close();
    }
}
