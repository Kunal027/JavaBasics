package com.intermediate.inheritance.athelete;

import java.util.Random;

public class BasketballPlayer extends Athlete {


    private double freeThrowPercentage;
    private double pointsPerGame;


    public BasketballPlayer(String name, String nickname, int yearOfBorn, String team, double freeThrowPercentage, double pointsPerGame, int gamesPlayed) {
        super(name, nickname, yearOfBorn, team, gamesPlayed);
        this.freeThrowPercentage = freeThrowPercentage;
        this.pointsPerGame = pointsPerGame;

    }

    public  void freeThrow(){
        Random randomNumberGenerator = new Random();

        if((randomNumberGenerator.nextDouble() * 100) > freeThrowPercentage){
            System.out.println(super.getName() + " failed to score free through");
        }
        else{
            System.out.println(super.getName() + " Scored a free through!!");
        }

    }

    @Override
    public void getBio(){
        super.getBio();
        System.out.println("Free throw percentage : " + freeThrowPercentage);
        System.out.println("Points Per game : " + pointsPerGame);
    }
}
