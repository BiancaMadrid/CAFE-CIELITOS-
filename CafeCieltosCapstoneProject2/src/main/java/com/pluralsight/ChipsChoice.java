package com.pluralsight;

public enum ChipsChoice implements Food{
   LAYS, RUFFLES_CHEDDAR, VINEGAR_AND_SALT, HOT_CHEETOS, JALAPENOS_BAKED;

    private String ChipType;
    private final double cost = 1.50;

    //Constructor
    ChipsChoice(){
        this.ChipType = this.name();
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return ChipType + "chips";
    }

}
