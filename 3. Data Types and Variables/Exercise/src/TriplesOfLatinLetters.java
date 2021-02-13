import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 97; i < (num + 97); i++) {
            for (int j = 97; j < (num + 97); j++) {
                for (int k = 97; k < (num + 97) ; k++) {
                    System.out.printf("%c%c%c%n", i, j, k);
                }
            }
        }
    }
}
