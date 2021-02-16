import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();

        List<Integer> first = inputToList(firstInput);
        List<Integer> second = inputToList(secondInput);

        int minLength = Math.min(first.size(), second.size());

        for (int i = 0; i < minLength; i++) {
            System.out.print(first.get(i) + " ");
            System.out.print(second.get(i) + " ");
        }

        printAfterIndex(first, minLength);
        printAfterIndex(second, minLength);

    }

    private static void printAfterIndex(List<Integer> list, int startIndex) {
        for (int i = startIndex; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static List<Integer> inputToList(String input) {
        String[] parts = input.split(" ");

        List<Integer> numbers = new ArrayList<>();
        for (String part: parts) {
            int num = Integer.parseInt(part);

            numbers.add(num);
        }

        return numbers;
    }
}
