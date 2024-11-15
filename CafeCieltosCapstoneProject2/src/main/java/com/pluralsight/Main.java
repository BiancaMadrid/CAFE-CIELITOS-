package com.pluralsight;
import java.util.Scanner;

public class Main {
    // Scanner to read user input
    private static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        // Making HomeScreen with order option and exit option
        boolean exit = false;
        while (!exit) {
            // Display the main menu options
            System.out.println("Welcome to Café Cielitos");
            System.out.println("1. New Order");
            System.out.println("2. Display Menu");
            System.out.println("3. Exit");
            System.out.print("Please select an option: ");

            // Get user choice
            int choice = reader.nextInt();
            reader.nextLine(); // Consume newline

        System.out.println("Test One");
            // Use Switch case to move between menu options
            switch (choice) {
                case 1:
                    // Start a new order
                    newOrder();
                    break;
                case 2:
                    // Display the full menu
                    displayMenu();
                    break;
                case 3:
                    // Exit the application
                    exit = true;
                    System.out.println("Thank you for visiting Café Cielitos. Goodbye!");
                    break;
                default:
                    // Handle invalid input
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

    // Method to handle new orders
    private static void newOrder() {
        Order order = new Order();
        boolean ordering = true;

        while (ordering) {
            // Display the order menu options
            System.out.println("\nOrder Menu:");
            System.out.println("1. Add Sandwich");
            System.out.println("2. Add Drink");
            System.out.println("3. Add Chips");
            System.out.println("4. Add Dessert");
            System.out.println("5. Checkout");
            System.out.println("6. Cancel Order");
            System.out.print("Please select an option: ");

            // Get user choice for the order menu
            int choice = reader.nextInt();
            reader.nextLine(); // Consume newline

            // Handle different order menu options
            switch (choice) {
                case 1:
                    // Add a sandwich to the order
                    addSandwich(order);
                    break;
                case 2:
                    // Add a drink to the order
                    addDrink(order);
                    break;
                case 3:
                    // Add chips to the order
                    addChips(order);
                    break;
                case 4:
                    // Add a dessert to the order
                    addDessert(order);
                    break;
                case 5:
                    // Checkout and complete the order
                    checkout(order);
                    ordering = false;
                    break;
                case 6:
                    // Cancel the order
                    System.out.println("Order canceled.");
                    ordering = false;
                    break;
                default:
                    // Handle invalid input
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
    // Method to add a sandwich to the order
    private static void addSandwich(Order order) {
        System.out.println("\nSelect Sandwich Size:");
        for (SandwichSize size : SandwichSize.values()) {
            System.out.println(size.ordinal() + 1 + ". " + size);
        }
        int sizeChoice = reader.nextInt();
        reader.nextLine();

        SandwichSize sandwichSize = SandwichSize.values()[sizeChoice - 1];

        System.out.println("Select Bread Type:");
        for (BreadType bread : BreadType.values()) {
            System.out.println(bread.ordinal() + 1 + ". " + bread);
        }
        int breadChoice = reader.nextInt();
        reader.nextLine();

        BreadType breadType = BreadType.values()[breadChoice - 1];

        System.out.println("Do you want it toasted? (yes/no): ");
        boolean toasted = reader.nextLine().equalsIgnoreCase("yes");

        Sandwich sandwich = new Sandwich(sandwichSize, breadType, toasted);

        // Add meats to the sandwich
        System.out.println("Select Meats (type the number, separated by commas):");
        for (MeatChoice meat : MeatChoice.values()) {
            System.out.println(meat.ordinal() + 1 + ". " + meat);
        }
        String meatChoices = reader.nextLine();
        String[] meatIndices = meatChoices.split(",");
        for (String index : meatIndices) {
            MeatChoice meat = MeatChoice.values()[Integer.parseInt(index.trim()) - 1];
            sandwich.addMeat(meat);
        }

        // Add cheeses to the sandwich
        System.out.println("Select Cheeses (type the number, separated by commas):");
        for (CheeseChoices cheese : CheeseChoices.values()) {
            System.out.println(cheese.ordinal() + 1 + ". " + cheese);
        }
        String cheeseChoices = reader.nextLine();
        String[] cheeseIndices = cheeseChoices.split(",");
        for (String index : cheeseIndices) {
            CheeseChoices cheese = CheeseChoices.values()[Integer.parseInt(index.trim()) - 1];
            sandwich.addCheese(cheese);
        }


        // Add extra meat and cheese
        System.out.println("How many extra servings of meat?");
        int extraMeat = reader.nextInt();
        reader.nextLine();
        sandwich.setExtraMeat(extraMeat);

        System.out.println("How many extra servings of cheese?");
        int extraCheese = reader.nextInt();
        reader.nextLine();
        sandwich.setExtraCheese(extraCheese);

        // Add veggies to the sandwich
        System.out.println("Select Veggies (type the number, separated by commas):");
        for (VeggieChoice veggie : VeggieChoice.values()) {
            System.out.println(veggie.ordinal() + 1 + ". " + veggie);
        }
        String veggieChoices = reader.nextLine();
        String[] veggieIndices = veggieChoices.split(",");
        for (String index : veggieIndices) {
            VeggieChoice veggie = VeggieChoice.values()[Integer.parseInt(index.trim()) - 1];
            sandwich.addVeggie(veggie);
        }

        // Add sauces to the sandwich
        System.out.println("Select Sauces (type the number, separated by commas):");
        for (SauceChoices sauce : SauceChoices.values()) {
            System.out.println(sauce.ordinal() + 1 + ". " + sauce); }
        String sauceChoices = reader.nextLine();
        String[] sauceIndices = sauceChoices.split(",");
        for (String index : sauceIndices) {
            SauceChoices sauce = SauceChoices.values()[Integer.parseInt(index.trim()) - 1];
            sandwich.addSauce(sauce);
        }

        // Add the sandwich to the order
        order.addItem(sandwich);
        System.out.println("Sandwich added to order.");
    }


    // Method to add a drink to the order
    private static void addDrink(Order order) {
        System.out.println("\nSelect Drink:");
        for (DrinkChoice drink : DrinkChoice.values()) {
            System.out.println(drink.ordinal() + 1 + ". " + drink);
        }
        int drinkChoice = reader.nextInt();
        reader.nextLine();

        DrinkChoice drinkType = DrinkChoice.values()[drinkChoice - 1];
        System.out.println("Select Size (small/medium/large): ");
        String size = reader.nextLine().toLowerCase();

        Drinks drink = new Drinks(drinkType);
        Drinks drink = new Drinks(drinkType, size);
        order.addItem(drink);
        System.out.println("Drink added to order.");
    }


    // Method to add chips to the order
    private static void addChips(Order order) {
        System.out.println("\nSelect Chips:");
        for (ChipsChoice chips : ChipsChoice.values()) {
            System.out.println(chips.ordinal() + 1 + ". " + chips);
        }
        int chipsChoice = reader.nextInt();
        reader.nextLine();

        ChipsChoice chipsType = ChipsChoice.values()[chipsChoice - 1];

        order.addItem(chipsType);
        System.out.println("Chips added to order.");
    }


    // Method to add a dessert to the order
    private static void addDessert(Order order) {
        System.out.println("\nSelect Dessert:");
        for (DesertChoice dessert : DesertChoice.values()) {
            System.out.println(dessert.ordinal() + 1 + ". " + dessert);
        }
        int dessertChoice = reader.nextInt();
        reader.nextLine();

        DesertChoice dessertType = DesertChoice.values()[dessertChoice - 1];
        order.addItem(dessertType);
        System.out.println("Dessert added to order.");
    }


    // Method checkout and complete the order
    private static void checkout(Order order) {
        System.out.println("\n" + order.getOrderDetails());
        Receipt.saveReceipt(order);
        System.out.println("Order completed and receipt saved.");
    }


    // Display the full menu for the customer
    private static void displayMenu() {
        System.out.println("\nMenu:");

        System.out.println("\nSandwich Sizes and Prices:");
        for (SandwichSize size : SandwichSize.values()) {
            System.out.printf("%s: $%.2f\n", size.name(), size.getBaseCost());
        }
        
        System.out.println("\nBread Types:");
        for (BreadType bread : BreadType.values()) {
            System.out.println(bread.name());
        }

        System.out.println("\nDrinks and Prices (Small, Medium, Large):");
        System.out.println("\nDrinks Prices:");
        System.out.println("Small: $2.00");
        System.out.println("Medium: $2.50");
        System.out.println("Large: $3.00");
        System.out.println("\nDrink Choices:");
        for (DrinkChoice drink : DrinkChoice.values()) {
            System.out.printf("%s: Small $%.2f, Medium $%.2f, Large $%.2f\n",
                    drink.name(), drink.getSmallCost(), drink.getMediumCost(), drink.getLargeCost());
            System.out.println(drink.name());
        }

        System.out.println("\nChips and Price:");
        for (ChipsChoice chips : ChipsChoice.values()) {
            System.out.printf("%s: $%.2f\n", chips.name(), chips.getCost());
        }

        System.out.println("\nDesserts and Prices:");
        for (DesertChoice dessert : DesertChoice.values()) {
            System.out.printf("%s: $%.2f\n", dessert.name(), dessert.getCost());
        }

        System.out.println("\nMeat Choices:");
        for (MeatChoice meat : MeatChoice.values()) {
            System.out.println(meat.name());
        }

        System.out.println("\nCheese Choices:");
        for (CheeseChoices cheese : CheeseChoices.values()) {
            System.out.println(cheese.name());
        }
    }
}
