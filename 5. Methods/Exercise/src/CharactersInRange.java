import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char rangeBeg = scanner.nextLine().charAt(0);
        char rangeEnd = scanner.nextLine().charAt(0);

        if (rangeBeg < rangeEnd) {
            printRange(rangeBeg, rangeEnd);
        } else {
            printRange(rangeEnd, rangeBeg);
        }
    }

    private static void printRange(char rangeBeg, char rangeEnd) {
        for (int i = ++rangeBeg; i < rangeEnd; i++) {
            System.out.printf("%c ", i);
        }
    }
}
