package com.pluralsight;

public enum MeatChoice {
        Steak, HAM, SALAMI, ROAST_BEEF, CHICKEN, BACON;
    Steak, HAM, SALAMI, ROAST_BEEF, CHICKEN, BACON;

//        public double getCost(SandwichSize){
//            double cost = 0.0;
//            //Price based on Size
    //Using Switch case to alternate meat options
    public double getCost(sandwichSize size) {
        switch (size) {
            case FOUR_INCH:
                return 1.00;
            case EIGHT_INCH:
                return 2.00;
            case TWELVE_INCH:
                return 3.00;
            default:
                return 0.00;
        }

    }
    //Using switch case to add extra cost to add additional meat
    public double getExtraCost(sandwichSize size){
        switch (size){
            case FOUR_INCH: return 0.50;
            case EIGHT_INCH: return 1.00;
            case TWELVE_INCH: return 1.50;
            default: return 0.00;
        }
    }
}

