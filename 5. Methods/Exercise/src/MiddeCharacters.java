import java.util.Scanner;

import static java.lang.String.valueOf;

public class MiddeCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String middle = getMiddleCharacter(input);
        System.out.println(middle);

    }

    private static String getMiddleCharacter(String input) {
        String middle = " ";
        if (input.length() % 2 != 0) {
            // one middle
            char character = input.charAt(input.length()/2);
            middle = valueOf(character);
        } else {
            middle = input.substring(input.length()/2 - 1, input.length()/2 + 1);
        }

        return middle;
    }
}
