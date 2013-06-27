package cc.kgm.oopj13st.u2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class HumanPlayer extends Player {

    public HumanPlayer( String myName ) {
        super( myName );
    }

    @Override
    int strategy( int availableSticks ) {

        // Läs in antal stickor från stdin
        Reader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        int pulledSticks;

        try {
            System.out.print("Your move (there are " + availableSticks + " matches) $>");
            String s = br.readLine();
            pulledSticks = Integer.parseInt(s);
        }
        catch (NumberFormatException e) {
            System.out.println("Sorry, please enter a number.");
            return strategy( availableSticks );  // recurse, then bubble up new pulledSticks

        }
        catch (Exception e) {
            throw new RuntimeException(e);
            // Any other type of exception is simply passed on
        }

        // rules check
        if( ! rulesCheck(pulledSticks, availableSticks) ) {  // I miss an "unless" conditional
            System.out.println("Sorry, illegal move.");
            return strategy( availableSticks );
        }
        else {
            return pulledSticks;
        }

    }

    private boolean rulesCheck( int pulled, int available )   {
        return ( (pulled < 1) || (pulled > available/2) ) ? false : true;
    }

}
