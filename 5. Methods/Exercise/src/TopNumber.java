import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        printTopNumbers(num);
    }

    // Its sum of digits is divisible by 8, e.g. 8, 16, 88.
    // Holds at least one odd digit, e.g. 232, 707, 87578.
    private static void printTopNumbers(int num) {
        for (int i = 1; i <= num; i++) {
            int sum = 0;
            boolean oddDigit = false;
            int cpy = i;

            while (true) {
                if (cpy == 0) break;
                int right = cpy % 10;
                sum += right;
                if (!(right % 2 == 0)) oddDigit = true;
                cpy /= 10;
            }

            if(sum % 8 == 0 && oddDigit) {
                System.out.println(i);
            }
        }
    }

}
