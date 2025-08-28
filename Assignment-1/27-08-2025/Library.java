import java.util.Scanner;
public class Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter number of students: ");
            int numStudents = sc.nextInt();
            int student = 1;
            while (student <= numStudents) {
                System.out.print("\nEnter number of books borrowed by Student " + student + ": ");
                int numBooks = sc.nextInt();
                int totalFine = 0;
                for (int i = 1; i <= numBooks; i++) {
                    System.out.print("\nEnter book category for Book " + i + " (1. Regular, 2. Reference, 3. Magazine): ");
                    int category = sc.nextInt();
                    String categoryName;
                    switch (category) {
                        case 1: categoryName = "Regular"; break;
                        case 2: categoryName = "Reference"; break;
                        case 3: categoryName = "Magazine"; break;
                        default: categoryName = "Unknown"; break;
                    }
                    System.out.print("Enter days late for Book " + i + ": ");
                    int daysLate = sc.nextInt();
                    int fine = 0;
                    if (daysLate >= 1 && daysLate <= 5) {
                        fine = daysLate * 10;
                    } else if (daysLate >= 6 && daysLate <= 10) {
                        fine = daysLate * 20;
                    } else if (daysLate > 10) {
                        fine = daysLate * 50;
                    }
                    
                    System.out.println("Fine for Book " + i + " (" + categoryName + "): Rs. " + fine);
                    totalFine += fine;
                }
                System.out.println("Total fine for Student " + student + ": Rs. " + totalFine);
                student++;
            }
            System.out.print("\nDo you want to calculate fine for another batch? (yes/no): ");
        } while (sc.next().equalsIgnoreCase("yes"));
        sc.close();
    }
}