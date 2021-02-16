import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int smallest = getSmallestNum(num1, num2, num3);
        System.out.println(smallest);
    }

    private static int getSmallestNum(int num1, int num2, int num3) {
        int smallest = 123445;

        if (num1 < num2 && num1 < num3) {
            smallest = num1;
        } else if (num2 < num3 && num2 < num1) {
            smallest = num2;
        } else {
            smallest = num3;
        }

        return smallest;
    }
}
