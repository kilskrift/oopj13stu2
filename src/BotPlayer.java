package oopj13stu2;

import oopj13stu2.*;

public class BotPlayer extends Player {

    public BotPlayer( String myName ) {
        super( myName );
    }


    @Override
    int strategy( int sticks ) {
        return 1;
    }

    @Override
    void annotation( int sticks ) {

    }

}
