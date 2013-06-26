package oopj13stu2;

import oopj13stu2.*;

public abstract class Player {

    protected String playerName;

    public Player( String myName ) {
        playerName = myName;

        System.out.println("Player added: " + playerName );
    }

    // devise how many sticks to pick in a move, give the current number of sticks in the game
    abstract int strategy( int sticks );

    // log outcome of the move to stdout
    abstract void annotation( int sticks);

}

