import java.util.Scanner;

public class Split {
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
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }
        int[] spaceIndexes = new int[wordCount + 1];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndexes[++idx] = i;
            }
        }
        spaceIndexes[++idx] = n;
        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount; i++) {
            int end = spaceIndexes[i + 1];
            String word = "";
            for (int j = start; j < end; j++) {
                if (str.charAt(j) != ' ') {
                    word += str.charAt(j);
                }
            }
            words[i] = word;
            start = end + 1;
        }
        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String input = sc.nextLine();
        String[] customWords = customSplit(input);
        String[] builtInWords = input.split(" ");
        System.out.println("Custom split:");
        for (String w : customWords) System.out.println(w);
        System.out.println("Built-in split:");
        for (String w : builtInWords) System.out.println(w);
        System.out.println("Arrays are equal: " + compareArrays(customWords, builtInWords));
        sc.close();
    }
}
