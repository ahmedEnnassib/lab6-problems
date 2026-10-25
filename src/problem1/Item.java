package problem1;

public class Item {
    private String name;
    private double price;
    private int quantity;


    public Item(String itemName, double itemPrice, int numPurchased) {
        name = itemName;
        price = itemPrice;
        quantity = numPurchased;
    }
    public double getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public int getQuantity() {
        return quantity;
    }
}