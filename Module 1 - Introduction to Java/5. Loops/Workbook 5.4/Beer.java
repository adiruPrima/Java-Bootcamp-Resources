public class Beer {
    public static void main(String[] args) {
       // See detailed instructions on Learn the Part.
       for (int i = 99; i > 0; i--) {
        sing(i);
       }
    }

    public static void sing(int beer) {
        System.out.println(beer + " bottles of beer on the wall, " + beer + " bottles of beer!");
        System.out.println("take one down, pass it around, "+ (beer - 1) + " bottles of beer on the wall!\n");
    }

}
