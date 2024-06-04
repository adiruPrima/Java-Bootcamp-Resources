import java.util.Scanner;

public class Championship {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Points for Gryffindor: ");
        int gryffindor = scan.nextInt();

        System.out.print("Points for Ravenclaw: ");
        int ravenclaw = scan.nextInt();

        int margin = gryffindor - ravenclaw;

        if (margin >= 300) {
            System.out.println("Gryffindor takes the house cup!");
        } else if (margin >= 0) {
            System.out.println("In second place, Gryffindor!");
        } else if (margin <= 100) {
            System.out.println("In third place, Gryffindor!");
        } else {
            System.out.println("In fourth place, Gryffindor!");
        }
        
        scan.close();
    }
}
