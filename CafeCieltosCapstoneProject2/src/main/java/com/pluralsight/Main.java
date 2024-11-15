package com.pluralsight;
import java.util.Scanner;

public class Main {
    private static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
    //Making HomeScreen w/ order option and exit option
        boolean exit = false;
        while (!exit) {
            System.out.println("Welcome to Café Cielitos");
            System.out.println("1. New Order");
            System.out.println("2. Display Menu");
            System.out.println("3. Exit");
            System.out.print("Please select an option: ");

            int choice = reader.nextInt();
            reader.nextLine(); // Consume newline

        System.out.println("Test One");
    }
}