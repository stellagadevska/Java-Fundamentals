import java.util.Scanner;

public class SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String sign = returnSign(num);

        System.out.printf("The number %d is %s.", num, sign);
    }

    public static String returnSign(int num) {
        if (num > 0) {
            return "positive";
        } else if (num == 0) {
            return "zero";
        } else {
            return "negative";
        }
    }
}
