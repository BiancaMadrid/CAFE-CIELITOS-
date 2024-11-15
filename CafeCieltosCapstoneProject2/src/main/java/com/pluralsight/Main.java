package com.pluralsight;
import java.util.Scanner;

public class Main {
    // Scanner to read user input
    private static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
    //Making HomeScreen w/ order option and exit option
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
