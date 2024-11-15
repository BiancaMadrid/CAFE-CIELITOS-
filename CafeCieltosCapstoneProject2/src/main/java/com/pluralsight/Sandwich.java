package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Sandwich implements Food {
   private sandwichSize sandwichSize;
   private SandwichSize sandwichSize;
   private List<MeatChoice> meat;
   private BreadType bread;
   private List<CheeseChoices> cheese;
   private List<VeggieChoice> veggies;
   private List<SauceChoices> sauce;
   private int extraCheese = 0;//SERVINGS OF CHEESE $$ EXTRA
   private int extraMeat = 0; //SERVINGS OF MEAT $$ EXTRA
   private boolean toasted;


   //Constructor for Sandwich
   public Sandwich(sandwichSize sandwichSize, BreadType bread, boolean toasted) {
   public Sandwich(SandwichSize sandwichSize, BreadType bread, boolean toasted) {
      this.sandwichSize = sandwichSize;
      this.bread = bread;
      this.toasted = toasted;
      this.meat = new ArrayList<>();
      this.cheese = new ArrayList<>();
      this.veggies = new ArrayList<>();
      this.sauce = new ArrayList<>();

   }
   //Adding topping to sandwich
   public void addMeat(MeatChoice meat) {
      this.meat.add(meat);
   }
   public void addCheese(CheeseChoices cheese) {
      this.cheese.add(cheese);
   }
   public void addVeggie(VeggieChoice veggie) {
      this.veggies.add(veggie);
   }
   public void addSauce(SauceChoices sauce){
      this.sauce.add(sauce);

   }
   public void setExtraMeat(int extraMeat){
      this.extraMeat = extraMeat;
   }
   public void setExtraCheese(int extraCheese) {
      this.extraCheese = extraCheese;

}


   //Calculating total cost of sandwich (implementing Food.getCost())
   @Override
   public double getCost() {
      double totalCost = sandwichSize.getBaseCost(); //Base cost depending on size

      //cost for extra toppings
      totalCost += extraMeat * sandwichSize.getMeatCost();
      totalCost += extraCheese * sandwichSize.getCheeseCost();

      return totalCost;
   }

   //Get Description
   @Override
   public String getDescription() {
      StringBuilder getDescription = new StringBuilder();
      getDescription.append("Size: ").append(sandwichSize).append("\n")
              .append("Bread: ").append(bread).append("\n")
              .append("Toasted: ").append(toasted).append("\n")
              .append("Meats: ").append(meat).append("\n")
              .append("Cheeses: ").append(cheese).append("\n")
              .append("Veggies: ").append(veggies).append("\n")
              .append("Sauce: ").append(sauce).append("\n")
              .append("Extra Cheese: ").append(extraCheese).append("\n")
              .append("Extra Meat: ").append(extraMeat).append("\n");
      return getDescription.toString();


   }
}
















