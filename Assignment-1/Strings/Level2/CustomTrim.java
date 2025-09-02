import java.util.Scanner;

public class CustomTrim {
    public static int[] findStartEnd(String str) {
        int n = str.length();
        int start = 0, end = n - 1;
        while (start < n && str.charAt(start) == ' ') start++;
        while (end >= 0 && str.charAt(end) == ' ') end--;
        return new int[]{start, end};
    }

    public static String customSubstring(String str, int start, int end) {
        String res = "";
        for (int i = start; i <= end; i++) res += str.charAt(i);
        return res;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String input = sc.nextLine();
        int[] bounds = findStartEnd(input);
        String trimmedCustom = customSubstring(input, bounds[0], bounds[1]);
        String trimmedBuiltIn = input.trim();
        System.out.println("Custom Trim: \"" + trimmedCustom + "\"");
        System.out.println("Built-in Trim: \"" + trimmedBuiltIn + "\"");
        System.out.println("Both Equal? " + compareStrings(trimmedCustom, trimmedBuiltIn));
        sc.close();
    }
}
