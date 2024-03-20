package edu.depaul;

public class Beauty extends AbstractProduct {
    private String type; 
    private static String categoryHeader = "BEAUTY:\n";

    public Beauty(String name, double price, String type) {
        super(name, price);
        this.type = type;
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
        return getName() + " (" + type + "), Price: $" + getPrice();
    }
    
}
