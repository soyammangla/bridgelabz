import java.util.Scanner;

public class WordLength {
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

    public static String[] customSplit(String str) {
        int n = findLength(str);
        int wordCount = 1;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ' ') wordCount++;
        }
        String[] words = new String[wordCount];
        int start = 0, idx = 0;
        for (int i = 0; i <= n; i++) {
            if (i == n || str.charAt(i) == ' ') {
                String word = "";
                for (int j = start; j < i; j++) {
                    word += str.charAt(j);
                }
                words[idx++] = word;
                start = i + 1;
            }
        }
        return words;
    }

    public static String[][] wordWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String input = sc.nextLine();
        String[] words = customSplit(input);
        String[][] table = wordWithLength(words);
        System.out.println("Word\tLength");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + Integer.parseInt(table[i][1]));
        }
        sc.close();
    }
}
