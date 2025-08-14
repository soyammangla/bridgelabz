import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input base and height in cm
        System.out.print("Enter the base of the triangle in cm: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle in cm: ");
        double height = scanner.nextDouble();

        // Calculate area in square centimeters
        double areaCm = 0.5 * base * height;

        // Convert area to square inches (1 inch = 2.54 cm, so 1 sq in = 2.54 * 2.54 sq cm)
        double areaIn = areaCm / (2.54 * 2.54);

        // Output the results
        System.out.printf("The Area of the triangle in sq in is %.2f and sq cm is %.2f%n", areaIn, areaCm);

        scanner.close();
    }
}
