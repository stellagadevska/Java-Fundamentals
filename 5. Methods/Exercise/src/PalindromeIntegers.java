import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("END")) {
            int num = Integer.parseInt(input);
            System.out.println(isPalindrome(num));
            input = scanner.nextLine();
        }

    }

    private static boolean isPalindrome(int num) {
        int palindrome = num;
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        return num == reverse;
    }
}
