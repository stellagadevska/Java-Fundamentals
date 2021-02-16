import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        double division = factorialDivision(num1, num2);
        System.out.printf("%.2f", division);
    }

    private static double factorialDivision(int num1, int num2) {
        return factorial(num1) / factorial(num2);
    }

    private static double factorial(int num) {
        double factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
