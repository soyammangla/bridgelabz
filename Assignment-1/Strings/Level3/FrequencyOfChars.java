import java.util.Scanner;

public class FrequencyOfChars {
    public static String[][] findFrequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        String[][] result = new String[text.length()][2];
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] > 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                freq[ch] = 0;
                index++;
            }
        }

        String[][] trimmed = new String[index][2];
        for (int i = 0; i < index; i++) trimmed[i] = result[i];
        return trimmed;
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
