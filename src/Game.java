package oopj13stu2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

import oopj13stu2.*;

public class Game {

    int playerTurnsElapsed;
    int sticksRemaining;
    ArrayList<Player> players;

    public Game( int sticksToStartWith ) {

        playerTurnsElapsed = 0;

        // Läs in antal stickor från första argumentet
        sticksRemaining = sticksToStartWith;
        System.out.println("This game is played with " + sticksRemaining + " sticks."); //DEBUG

        // Create Player objects and populate players list
        players = new ArrayList<Player>();

        players.add( new BotPlayer( "Computer 1") );
        players.add( new BotPlayer( "Computer 2") );
    }

    public void play() {

        // play the game until there's only one stick left to pick, if so the player in turn loses
        while( sticksRemaining > 1 ) {

           Player phasingPlayer = players.get( playerTurnsElapsed % players.size() );

           int drawnSticks = phasingPlayer.strategy( sticksRemaining );
           phasingPlayer.annotation( drawnSticks );

           sticksRemaining -= drawnSticks;

           playerTurnsElapsed += 1;

        }
        System.out.println("Game over, turn " + playerTurnsElapsed + " sticks left " + sticksRemaining); //DEBUG

    }

    // autorun
    public static void main (String[] arg) {

        Game nm = new Game( Integer.parseInt( arg[0] ) ); //TODO: error handling if no args given

        nm.play();


    }
}


/*



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

*/