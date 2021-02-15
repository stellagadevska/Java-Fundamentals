import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfStrings = Integer.parseInt(scanner.nextLine());

        // Read Strings
        String[] sequences = new String[numOfStrings];
        for (int i = 0; i < numOfStrings; i++) {
            sequences[i] = scanner.nextLine();
        }

        // Encrypt Strings
        int[] encrypted = new int[numOfStrings];
        for (int i = 0; i < numOfStrings; i++) {
            String temp = sequences[i];
            int calc = 0;
            for (int j = 0; j < temp.length(); j++) {
                char letter = temp.charAt(j);
                if (letter == 'a' || letter == 'e'|| letter == 'i'|| letter == 'o' || letter == 'u'
                        || letter == 'A' || letter == 'E'|| letter == 'I'|| letter == 'O' || letter == 'U') {
                    // check vowel -> multiply by temp.length
                    calc = letter * temp.length();
                } else {
                    // check consonant -> divide by temp.length
                    calc = letter / temp.length();
                }
                encrypted[i] += calc;
            }

        }
        // • The code of each vowel multiplied by the string length
        //•	The code of each consonant divided by the string length

        // Sort Strings
        Arrays.sort(encrypted);

        // Print Strings
        for (int elem: encrypted) {
            System.out.println(elem);
        }
    }
}
