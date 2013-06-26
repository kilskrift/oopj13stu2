import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class Game {
    public static void main (String[] arg) {

        // Läs in antal stickor från första argumentet
        int x = Integer.parseInt(arg[0]);
        System.out.println("The square of "+x+" is "+x*x);

        // Läs in antal stickor från stdin
        Reader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        int y = 1234567;
        try {
            System.out.println("Enter number of sticks to pick: ");
            String s = br.readLine();
            y = Integer.parseInt(s);
        }
        catch (NumberFormatException e) {
            // If the format is bad use the value 1234567 instead
        }
        catch (Exception e) {
            throw new RuntimeException(e);
            // Any other type of exception is simply passed on
        }

        System.out.println("The square of "+y+" is "+y*y);

    }




}
