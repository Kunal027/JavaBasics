package com.intermediate.classandobjects;

import java.util.Locale;

public class CarApp {
    public static void main(String[] args) {
        DodgeChallenger dodgeChallenger = new DodgeChallenger();
        dodgeChallenger.mileage = 0;
        dodgeChallenger.startEngine();
        dodgeChallenger.getDescription();


        System.out.println(".................");

        DodgeChallenger orangeDodgeChallenger = new DodgeChallenger( "Orange");
        System.out.println(orangeDodgeChallenger.color.toUpperCase());
        //orangeDodgeChallenger.getDescription();
        orangeDodgeChallenger.startEngine();


    }
}
