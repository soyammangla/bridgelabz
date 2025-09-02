import java.util.Scanner;

public class BMICalculator {
    public static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }

    public static String[][] computeBMI(double[][] hw) {
        String[][] result = new String[hw.length][4];
        for (int i = 0; i < hw.length; i++) {
            double weight = hw[i][0];
            double heightCm = hw[i][1];
            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);
            bmi = Math.round(bmi * 100.0) / 100.0;
            result[i][0] = String.valueOf(weight);
            result[i][1] = String.valueOf(heightCm);
            result[i][2] = String.valueOf(bmi);
            result[i][3] = getStatus(bmi);
        }
        return result;
    }

    public static void display(String[][] arr) {
        System.out.println("Weight(kg)\tHeight(cm)\tBMI\tStatus");
        for (String[] row : arr) {
            System.out.println(row[0] + "\t\t" + row[1] + "\t\t" + row[2] + "\t" + row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] hw = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i+1) + ": ");
            hw[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) of person " + (i+1) + ": ");
            hw[i][1] = sc.nextDouble();
        }
        String[][] result = computeBMI(hw);
        display(result);
        sc.close();
    }
}
