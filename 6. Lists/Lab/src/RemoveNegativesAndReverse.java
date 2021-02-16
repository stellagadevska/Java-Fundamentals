import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] parts = scanner.nextLine().split(" ");

        List<Integer> numbers = Arrays.stream(parts)
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        removeNegatives(numbers);

        Collections.reverse(numbers);

        if (numbers.isEmpty()) {
            System.out.println("empty");
        } else {
            printArray(numbers);
        }
    }

    private static void removeNegatives(List<Integer> numbers) {
        numbers.removeIf(num -> num < 0);
    }

    private static void printArray(List<Integer> numbers) {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
