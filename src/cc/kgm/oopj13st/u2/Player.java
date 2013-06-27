/*
    Inlämningsuppgift 2 Objektorienterad programmering med Java sommaren 2013
    Kristian Grossman-Madsen
    https://github.com/kilskrift/oopj13stu2.git
 */

package cc.kgm.oopj13st.u2;

public abstract class Player {

    protected String playerName;

    public Player( String myName ) {
        playerName = myName;
    }

    // getter for playerName
    public String getPlayerName() {
        return playerName;
    }

    // devise how many sticks to pick in a move, give the current number of sticks in the game
    abstract int strategy( int sticks );
}

