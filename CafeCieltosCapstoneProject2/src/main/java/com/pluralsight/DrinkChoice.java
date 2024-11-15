package com.pluralsight;

public enum DrinkChoice {
    COKE(2.00, 2.50, 3.00),
    SPRITE(2.00,2.50,3.00),
    LEMONADE(2.00,2.50,3.00),
    NON_SWEET_ICED_TEA(2.00,2.50,3.00),
    RASBERRY_ICED_TEA(2.00,2.50,3.00),
    MATCHA_ICED_LATTE(6.50,7.50,8.25),
    ICED_LATTE(4.50,7.50,8.25),
    AMERICANO(4.50,7.50,8.25);


    private final double smallCost;
    private final double mediumCost;
    private final double largeCost;

    //Constructor
    DrinkChoice(double smallCost, double mediumCost, double largeCost){
        this.smallCost = smallCost;
        this.mediumCost = mediumCost;
        this.largeCost = largeCost;
    }

    //Getters

    public double getSmallCost() {
        return smallCost;
    }

    public double getMediumCost() {
        return mediumCost;
    }

    public double getLargeCost() {
        return largeCost;
    }
}
