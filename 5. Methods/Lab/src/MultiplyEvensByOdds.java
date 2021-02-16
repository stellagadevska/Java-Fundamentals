import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        num = Math.abs(num);
        int multiplication = getEvensAndOddsMultiplication(num);
        System.out.println(multiplication);
    }

    private static int getEvensAndOddsMultiplication(int num) {
        int evenSum = getSumOfEvenDigits(num);
        int oddSum = getSumOfOddDigits(num);

        return evenSum * oddSum;
    }

    private static int getSumOfEvenDigits(int num) {
        int evenSum = 0;

        while (num > 0) {
            int digit = 0;
            digit = num % 10;
            if (digit % 2 == 0) {
                evenSum += digit;
            }
            num = num / 10;
        }

        return evenSum;
    }

    private static int getSumOfOddDigits(int num) {
        int oddSum = 0;

        while (num > 0) {
            int digit = 0;
            digit = num % 10;
            if (digit % 2 != 0) {
                oddSum += digit;
            }
            num = num / 10;
        }

        return oddSum;
    }


}
