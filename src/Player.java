public abstract class Player {

    // devise how many sticks to pick in a move, give the current number of sticks in the game
    abstract int strategy( int sticksInGame );

    // log outcome of the move to stdout
    abstract void annotation();

}

class BotPlayer extends Player {

    @Override
    int strategy( int sticksInGame ) {
        this.annotation();
        return sticksInGame;
    }

    void annotation() {

    }

}