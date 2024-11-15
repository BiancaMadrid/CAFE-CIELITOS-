package com.pluralsight;

public enum DesertChoice implements Food{
    COOKIE(3.50),
    BROWNIE(4.45),
    CROISSANT(4.50),
    SLICE_OF_TIRAMISU_CAKE(4.75),
    STRAWBERRY_SHORTCAKE(5.99);

    private final double cost;

    // Constructor
    DesertChoice(double cost) {
        this.cost = cost; }

    // Getter for cost
    public double getCost() {
        return cost; }

    @Override
    public String getDescription() {
        return this.name() + ": $" + cost;
    }
}

}
