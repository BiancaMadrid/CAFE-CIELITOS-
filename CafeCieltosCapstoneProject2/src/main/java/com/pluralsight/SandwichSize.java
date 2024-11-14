package com.pluralsight;

public enum SandwichSize{

        FOUR_INCH(5.50), EIGHT_INCH(7.00), TWELVE_INCH(8.50);

        private final double cost;

        SandwichSize(double cost) {
            this.cost = cost;
        }
    }
    enum BreadType{
        WHITE, WHEAT, RYE, WRAP
    }
    enum ToppingType{
        REGULAR, PREMIUM
    }





