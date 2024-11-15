package com.pluralsight;

public class Drinks implements Food{
    private DrinkChoice type;

    public Drinks(DrinkChoice type){
        this.type = type;
    }

    @Override
    public double getCost() {
        return type.getSmallCost();
    }

    @Override
    public String getDescription() {
        return "Drink: " + type.name();
    }
}
