import java.util.Scanner;

public class FriendsInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i]);
            System.out.print("Enter Age: ");
            ages[i] = sc.nextInt();
            System.out.print("Enter Height (in cm): ");
            heights[i] = sc.nextDouble();
        }

        // Find youngest
        int minAgeIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[minAgeIndex]) {
                minAgeIndex = i;
            }
        }

        // Find tallest
        int maxHeightIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[maxHeightIndex]) {
                maxHeightIndex = i;
            }
        }

        // Output
        System.out.println("\nResult:");
        System.out.println("Youngest Friend: " + names[minAgeIndex] + " (Age: " + ages[minAgeIndex] + ")");
        System.out.println("Tallest Friend: " + names[maxHeightIndex] + " (Height: " + heights[maxHeightIndex] + " cm)");

        sc.close();
    }
}
