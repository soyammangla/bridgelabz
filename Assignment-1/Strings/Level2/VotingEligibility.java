import java.util.Random;
import java.util.Scanner;

public class VotingEligibility {
    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) ages[i] = rand.nextInt(90) + 10;
        return ages;
    }

    public static String[][] canVote(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) result[i][1] = "false";
            else result[i][1] = (ages[i] >= 18) ? "true" : "false";
        }
        return result;
    }

    public static void displayTable(String[][] arr) {
        System.out.println("Age\tCanVote");
        for (String[] row : arr) System.out.println(row[0] + "\t" + row[1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] ages = generateAges(n);
        String[][] table = canVote(ages);
        displayTable(table);
        sc.close();
    }
}
