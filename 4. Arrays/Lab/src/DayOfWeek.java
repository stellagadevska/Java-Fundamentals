import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int num = Integer.parseInt(scanner.nextLine());
        if (num >= 1 && num <= 7) {
            System.out.println(array[num - 1]);
        } else {
            System.out.println("Invalid day!");
        }

    }
}
