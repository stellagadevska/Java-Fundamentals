import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());
        System.out.println(new DecimalFormat("0.####").format(onPower(num,power)));
    }

    private static double onPower(double num, int power) {
        double result = num;
        for (int i = 1; i < power; i++) {
            result *= num;
        }

        return result;
    }
}
