import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] parts = scanner.nextLine().split(" ");

        List<Integer> numbers = Arrays.stream(parts)
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] commandParts = command.split(" ");
            String commandName = commandParts[0];

            switch (commandName) {
                case "Contains":
                    int num = Integer.parseInt(commandParts[1]);
                    containsNum(numbers, num);
                    break;

                case "Print":
                    String word = commandParts[1];
                    if (word.equals("even")) {
                        printEven(numbers);
                    } else {
                        printOdd(numbers);
                    }
                    break;

                case "Get":
                    int sum = getSum(numbers);
                    System.out.println(sum);
                    break;

                case "Filter":
                    String condition = commandParts[1];
                    int number = Integer.parseInt(commandParts[2]);
                    filter(condition, number, numbers);
                    break;
            }

            command = scanner.nextLine();
        }


    }

    private static void containsNum(List<Integer> numbers, int num) {
        if (numbers.contains(num)) {
            System.out.println("Yes");
        } else {
            System.out.println("No such number");
        }
    }

    private static void printEven(List<Integer> numbers) {
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        System.out.println();
    }


    private static void printOdd(List<Integer> numbers) {
        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }

        System.out.println();
    }

    private static int getSum(List<Integer> numbers) {
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        return sum;
    }


    //Filter ({condition} {number}) – print all the numbers that fulfill that condition.
    // The condition will be either '<', '>', ">=", "<="
    private static void filter(String condition, int number, List<Integer> numbers) {
        for (int num : numbers) {
            switch (condition) {
                case "<":
                    if (num < number) {
                        System.out.print(num + " ");
                    }
                    break;
                case ">":
                    if (num > number) {
                        System.out.print(num + " ");
                    }
                    break;
                case ">=":
                    if (num >= number) {
                        System.out.print(num + " ");
                    }
                    break;
                case "<=":
                    if (num <= number) {
                        System.out.print(num + " ");
                    }
                    break;
            }
        }

        System.out.println();
    }

}
