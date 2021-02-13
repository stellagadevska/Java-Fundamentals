import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // sum of digits - 5, 7, 11
        // 1 -> False

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num; i++) {
            int sum = 0;
            int currentNum = i;

            while (currentNum != 0) {
                sum += currentNum % 10;
                currentNum = currentNum / 10;
            }

            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.println(i + " -> True");
            } else  {
                System.out.println(i + " -> False");
            }
        }
    }
}
