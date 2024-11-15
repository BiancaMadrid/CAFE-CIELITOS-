package com.pluralsight;

public enum SandwichSize {
        FOUR_INCH(5.50, 1.00, 0.75, 0.50,0.30),
        EIGHT_INCH(7.00, 2.00, 1.50,1.00,0.60),
        TWELVE_INCH(8.50, 3.00, 2.25,1.50,0.90);

    private final double baseCost;
    private final double meatCost;
    private final double cheeseCost;
    private final double extraMeatCost;
    private final double extraCheeseCost;

    //Constructor
    SandwichSize(double baseCost, double meatCost, double cheeseCost, double extraMeatCost, double extraCheeseCost) {
        this.baseCost = baseCost;
        this.meatCost = meatCost;
        this.cheeseCost = cheeseCost;
        this.extraMeatCost = extraMeatCost;
        this.extraCheeseCost = extraCheeseCost;
    }

    //Getters
    public double getBaseCost(){
        return baseCost;
    }

    public double getMeatCost() {
        return meatCost;
    }

    public double getCheeseCost() {
        return cheeseCost;
    }

    public double getExtraMeatCost() {
        return extraMeatCost;
    }

    public double getExtraCheeseCost() {
        return extraCheeseCost;
    }

}
