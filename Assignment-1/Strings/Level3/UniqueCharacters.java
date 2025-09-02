import java.util.Scanner;

public class UniqueCharacters {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static char[] findUnique(String str) {
        int n = findLength(str);
        char[] temp = new char[n];
        int idx = 0;

        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == c) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) temp[idx++] = c;
        }

        char[] unique = new char[idx];
        for (int i = 0; i < idx; i++) unique[i] = temp[i];
        return unique;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        char[] unique = findUnique(input);
        System.out.print("Unique characters: ");
        for (char c : unique) System.out.print(c + " ");
        sc.close();
    }
}
