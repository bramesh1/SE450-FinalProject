package edu.depaul;

public class Electronics extends AbstractProduct {
    private String brand;
    private static String categoryHeader = "ELECTRONICS:\n";
    
    public Electronics(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    public double getPrice() {
        return price; 
    }
    @Override
    public String toString() {
    	if (!categoryHeader.isEmpty()) {
            System.out.println(categoryHeader);
            categoryHeader = ""; 
        }
        return getName() + " (Brand: " + brand + "), Price: $" + getPrice();
    }
}
