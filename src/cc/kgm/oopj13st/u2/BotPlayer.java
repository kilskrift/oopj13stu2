/*
    Inlämningsuppgift 2 Objektorienterad programmering med Java sommaren 2013
    Kristian Grossman-Madsen
    https://github.com/kilskrift/oopj13stu2.git
 */

package cc.kgm.oopj13st.u2;

import java.util.Random;

public class BotPlayer extends Player {

    public BotPlayer( String myName ) {
        super( myName );
    }

    @Override
    int strategy( int sticks ) {
        Random r = new Random();
        return ( 1 + r.nextInt( sticks/2 ));
    }

}
