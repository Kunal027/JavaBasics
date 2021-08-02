package com.intermediate.classandobjects;

public class DodgeChallenger {

        byte numberOfSeats = 5;
        byte numberOfDoors = 3;
        byte numberOfVehicleOwners = 1;

        short power = 362;
        short horsePower = 492;
        short co2Emission = 333;
        short cubicCapacity = 6417;

        int price = 29999;
        int mileage =14999;

        long registrationNumber = 123231255488474L;

        float fuelConsumptionCombined = 15.5f;
        float fuelConsumptionUrban = 21.4f;
        float fuelConsumptionExtraUrban = 13.6f;

        double fuelConsumptionPreciseAverage = 153.245656448-1;

        boolean isDamaged = true;

        String  energyEfficiency = "G";

        String color;

        DodgeChallenger(String color)
        {
                this.color = color;
                System.out.println("Color of the dodge challenger is : " + color);
        }

        public void startEngine(){
            System.out.println("The engine is started");
        }

        DodgeChallenger(){
                System.out.println("Dodge challenger is created");
        }

        public void getDescription(){
                System.out.println("2018 Dodge challenger");
                System.out.println("Price : " + price);
                System.out.println("Mileage : " + mileage + "kms");
                System.out.println("Is the car damaged : ");
                System.out.println("Registration number : " + registrationNumber);
                System.out.println("Cubic Capacity : " + cubicCapacity);
                System.out.println("Power : " + power + "KW(" + horsePower + "hp)");
                System.out.println("CO2 Emission : " + co2Emission);

        }

    }

