
// File: Restaurant.java
 

import java.util.ArrayList;

public class Restaurant {
    private ArrayList<MenuItem> menu;
    private ArrayList<Order> orders;

    public Restaurant() {
        this.menu = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public void addMenuItem(MenuItem item) {
        menu.add(item);
    }

    public void displayMenu() {
        System.out.println("\n=== MENU RESTORAN ===");
        System.out.println("No.\tNama\t\tHarga");
        System.out.println("------------------------");
        for (int i = 0; i < menu.size(); i++) {
            MenuItem item = menu.get(i);
            System.out.printf("%d.\t%-15s Rp %,.0f%n", 
                (i + 1), 
                item.getName(), 
                item.getPrice()
            );
        }
        System.out.println("------------------------");
    }

    public MenuItem getMenuItem(int index) {
        if (index >= 0 && index < menu.size()) {
            return menu.get(index);
        }
        return null;
    }

    public Order createOrder() {
        Order newOrder = new Order();
        orders.add(newOrder);
        return newOrder;
    }
}
