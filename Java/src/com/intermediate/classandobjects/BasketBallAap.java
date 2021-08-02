package com.intermediate.classandobjects;

public class BasketBallAap {
    public static void main(String[] args) {

        BasketballPlayer kobe = new BasketballPlayer("Kobe Brayant","Black Mamba", 1978,"Lakers",83.7,25.0,1300);
        BasketballPlayer jordan = new BasketballPlayer("Michael Jordan ","MJ", 1963,"Chicago Bulls",83.5,30.1,1072);
        BasketballPlayer magic = new BasketballPlayer("Earvin Johnson","NJ", 1959,"Lakers",84.8,19.5,906);

        BasketballPlayer[] basketballPlayers = new BasketballPlayer[3];

        basketballPlayers[0] = kobe;
        basketballPlayers[1] = jordan;
        basketballPlayers[2] = magic;

        for (BasketballPlayer basketballPlayer : basketballPlayers){
            basketballPlayer.freeThrow();
        }


    }
}
