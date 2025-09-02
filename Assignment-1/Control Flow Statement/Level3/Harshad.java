import java.util.Scanner;

public class Harshad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(), sum = 0, temp = number;

        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println(number % sum == 0 ? "Harshad Number" : "Not Harshad");
    }
}
