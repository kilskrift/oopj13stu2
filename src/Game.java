public class Game {
    public static void main (String[] arg) {

        // Läs in antal stickor från första argumentet
        int x = Integer.parseInt(arg[0]);
        System.out.println("The square of "+x+" is "+x*x);
    }
}
