public class Product {
    // Static
    private static double discount = 5.0; // %
    
    // Instance variables
    private String productName;
    private double price;
    private int quantity;
    private final int productID; // Final

    // Constructor
    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to: " + discount + "%");
    }

    // Display details
    public void displayDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product(101, "Laptop", 50000, 2);
        Product p2 = new Product(102, "Mobile", 20000, 3);

        p1.displayDetails();
        p2.displayDetails();

        Product.updateDiscount(10.0);
    }
}
