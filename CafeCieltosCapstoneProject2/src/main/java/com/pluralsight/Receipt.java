package com.pluralsight;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Receipt {
    //Method to save receipt to file w/ time
    //Creating new file
    //writing order to receipt file
    public static void saveReceipt(Order order) {
        String receiptContent = order.getOrderDetails();
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss"));
        String directoryPath = "receipts";
        String filename = "receipts/" + timestamp + ".txt";

        //Creating directory
        File directory = new File(directoryPath);
        if (!directory.exists()) {
            boolean created = directory.mkdir();
            if (created) {
                System.out.println("Receipts directory created. ");
            } else {
                System.out.println("Failed to created.");
            }
        }

        try {
            File file = new File(filename);
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write("Order Receipt\n");
                writer.write("================\n");
                writer.write(receiptContent);
                writer.write("Total Cost: $" + order.calculateTotal());
                writer.write("\nThank you for your order!\n Have a great day!");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

