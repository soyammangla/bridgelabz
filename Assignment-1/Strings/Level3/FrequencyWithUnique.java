import java.util.Scanner;

public class FrequencyWithUnique {
    public static char[] uniqueCharacters(String text) {
        char[] unique = new char[text.length()];
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                unique[count++] = ch;
            }
        }
        char[] result = new char[count];
        for (int i = 0; i < count; i++) result[i] = unique[i];
        return result;
    }

    public static String[][] findFrequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        char[] unique = uniqueCharacters(text);
        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[][] freq = findFrequency(text);

        System.out.println("Character | Frequency");
        for (String[] row : freq) {
            System.out.println("    " + row[0] + "      |     " + row[1]);
        }
    }
}
