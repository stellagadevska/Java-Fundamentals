import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.nextLine();
        int repeat = Integer.parseInt(scanner.nextLine());

        repeatString(myString, repeat);
    }

    private static void repeatString(String myString, int repeat) {
        for (int i = 0; i < repeat; i++) {
            System.out.print(myString);
        }
    }
}
