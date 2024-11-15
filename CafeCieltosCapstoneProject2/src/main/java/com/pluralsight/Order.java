package com.pluralsight;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Food> items; //list of orders items

    public Order() {
        this.items = new ArrayList<>();
    }

    public void addItem(Food item) {
        items.add(item);

    }

    //Calculate the total cost of order
    public double calculateTotal() {
        double totalCost = 0;
        for (Food item : items) {
            totalCost += item.getCost();
        }
        return totalCost;
    }

    //Collecting order details
    public String getOrderDetails() {
        StringBuilder details = new StringBuilder("Order Details: \n");
        for (Food item : items) {
            details.append(item.getDescription()).append("\n");
        }
        details.append("Total: $").append(calculateTotal());
        return details.toString();
    }

}
