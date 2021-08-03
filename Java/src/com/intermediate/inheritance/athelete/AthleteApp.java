package com.intermediate.inheritance.athelete;

public class AthleteApp {
    public static void main(String[] args) {

        BasketballPlayer kobe = new BasketballPlayer("Kobe Brayant","Black Mamba", 1978,"Lakers",83.7,25.0,1300);
        BasketballPlayer jordan = new BasketballPlayer("Michael Jordan ","MJ", 1963,"Chicago Bulls",83.5,30.1,1072);
        BasketballPlayer magic = new BasketballPlayer("Earvin Johnson","NJ", 1959,"Lakers",84.8,19.5,906);

        BasketballPlayer[] basketballPlayers = new BasketballPlayer[3];

        basketballPlayers[0] = kobe;
        basketballPlayers[1] = jordan;
        basketballPlayers[2] = magic;

        for (BasketballPlayer basketballPlayer : basketballPlayers){
            System.out.println("..................");
            basketballPlayer.getBio();
        }
        FootballPlayer cr = new FootballPlayer("Ronaldo", "CR7", 1977,"Juvantas",9855,9988,6377);
        FootballPlayer messi = new FootballPlayer("Messi", "GOAT", 1977,"Barca",9785,9978,6355);

        FootballPlayer[] footballPlayers = new FootballPlayer[3];
        footballPlayers[0] = cr;
        footballPlayers[1] = messi;

        for (FootballPlayer footballPlayer: footballPlayers){
            System.out.println("..................");
            footballPlayer.getBio();
        }


    }
}
