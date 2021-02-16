import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine().toLowerCase();
        int vowelsCount = getVowelsCount(word);
        System.out.println(vowelsCount);
    }

    private static int getVowelsCount(String word) {
        int vowelsCount = 0;

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                vowelsCount++;
            }
        }

        return vowelsCount;
    }
}
