// File: Order.javp
 

import java.util.ArrayList;
import java.util.UUID;

public class Order {
    @SuppressWarnings("unused")
    private String orderId;
    private ArrayList<MenuItem> menuItems;
    private double totalPrice;
    private boolean isPaid;
    @SuppressWarnings("unused")
    private String orderStatus;
    @SuppressWarnings("unused")
    private double paymentAmount;
    private double change;

    public Order() {
        this.orderId = UUID.randomUUID().toString();
        this.menuItems = new ArrayList<>();
        this.totalPrice = 0.0;
        this.isPaid = false;
        this.orderStatus = "NEW";
        this.paymentAmount = 0.0;
        this.change = 0.0;
    }

    public void addItem(MenuItem item) {
        menuItems.add(item);
        calculateTotalPrice();
    }

    private void calculateTotalPrice() {
        this.totalPrice = menuItems.stream()
                .mapToDouble(MenuItem::getPrice)
                .sum();
    }

    public boolean processPayment(double amount) {
        this.paymentAmount = amount;
        if (amount >= totalPrice) {
            this.isPaid = true;
            this.change = amount - totalPrice;
            this.orderStatus = "PREPARING";
            return true;
        }
        return false;
    }

    // Getters
    public double getTotalPrice() { return totalPrice; }
    public boolean isPaid() { return isPaid; }
    public double getChange() { return change; }
    public ArrayList<MenuItem> getMenuItems() { return menuItems; }
}
