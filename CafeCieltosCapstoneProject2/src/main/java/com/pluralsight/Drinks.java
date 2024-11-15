package com.pluralsight;

public class Drinks implements Food{
    private DrinkChoice type;
    private String size;

    public Drinks(DrinkChoice type){
    public Drinks(DrinkChoice type, String size){
        this.type = type;
        this.size = size;
    }

    @Override
    public double getCost() {
        return type.getSmallCost();
    @Override public double getCost() {
        switch (size) {
            case "small":
                return type.getSmallCost();
            case "medium":
                return type.getMediumCost();
            case "large":
                return type.getLargeCost();
            default: throw new IllegalArgumentException("Invalid drink size: " + size);
        }
    }

    @Override
    public String getDescription() {
        return "Drink: " + type.name();
        return "Drink: " + type.name() +" (" + size + ")";
    }
}
