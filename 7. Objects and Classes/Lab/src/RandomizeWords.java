import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        Random rand = new Random();
        for (int i = 0; i < words.length; i++) {
            int randomIndex = 0;

            rand.nextInt(words.length);

            String temp = words[i];
            words[i] = words[randomIndex];
            words[randomIndex] = temp;

        }

        for (String random: words) {
            System.out.println(random);
        }
    }
}
