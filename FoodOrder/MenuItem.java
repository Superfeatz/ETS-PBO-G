// File: MenuItem.java
 

import java.util.UUID;

public class MenuItem {
    private String id;
    private String name;
    private double price;
    private String description;
    private String category;
    
    // Constructor dan method lainnya tetap sama
    public MenuItem(String name, double price, String description, String category) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
    }

    // Getters
    public String getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getDescription() { return description; }
    public String getCategory() { return category; }
}
