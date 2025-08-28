
import java.util.Scanner;

public class CricketScoreAnalyzer {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int highestScore = 0;
    int lowestScore = arr[0];
    int totalScore = 0;
    int avg = 0;
    int centuryScore = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] > highestScore) {
        highestScore = arr[i];
      }
      if (arr[i] < lowestScore) {
        lowestScore = arr[i];
      }
      totalScore += arr[i];
      avg = totalScore / n;
      if (arr[i] >= 100) {
        centuryScore++;
      }
    }
    System.out.println("\nHighest Score: " + highestScore);
    System.out.println("Lowest Score: " + lowestScore);
    System.out.println("Average Score: " + avg);
    System.out.println("Centuries Scored: " + centuryScore);
  }
}