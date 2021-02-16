import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        int num2 = Integer.parseInt(scanner.nextLine());

        calculate(num1, operator, num2);
    }

    private static void calculate(int num1, char operator, int num2) {
        switch (operator) {
            case '+':
                add(num1 , num2);
                break;
            case '*':
                multiply(num1 , num2);
                break;
            case '-':
                subtract(num1 , num2);
                break;
            case '/':
                divide(num1 , num2);
                break;
        }
    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    private static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    public static void subtract(int a, int b) {
        System.out.println(a - b);
    }

    private static void divide(int a, int b) {
        System.out.println(a / b);
    }
}
