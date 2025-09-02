import java.util.ArrayList;
import java.util.Scanner;

class CartItem {
    String itemName;
    double price;
    int quantity;

    // Constructor
    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    double totalCost() {
        return price * quantity;
    }

    void displayItem() {
        System.out.println(itemName + " - Price: " + price + ", Quantity: " + quantity + ", Total: " + totalCost());
    }
}

public class ShoppingCart {
    ArrayList<CartItem> cart = new ArrayList<>();

    void addItem(CartItem item) {
        cart.add(item);
        System.out.println(item.itemName + " added to cart.");
    }

    void removeItem(String itemName) {
        boolean removed = cart.removeIf(item -> item.itemName.equalsIgnoreCase(itemName));
        if (removed) {
            System.out.println(itemName + " removed from cart.");
        } else {
            System.out.println(itemName + " not found in cart.");
        }
    }

    void displayCartTotal() {
        double total = 0;
        System.out.println("\nCart Items:");
        for (CartItem item : cart) {
            item.displayItem();
            total += item.totalCost();
        }
        System.out.println("Total Cart Cost: " + total + "\n");
    }

    public static void main(String[] args) {
        ShoppingCart myCart = new ShoppingCart();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Cart");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    myCart.addItem(new CartItem(name, price, quantity));
                    break;
                case 2:
                    System.out.print("Enter item name to remove: ");
                    String removeName = sc.nextLine();
                    myCart.removeItem(removeName);
                    break;
                case 3:
                    myCart.displayCartTotal();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
