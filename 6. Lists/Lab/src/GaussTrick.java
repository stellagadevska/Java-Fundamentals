import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] parts = scanner.nextLine().split(" ");

        List<Integer> numbers = new ArrayList<>();
        for (String part: parts) {
            int num = Integer.parseInt(part);

            numbers.add(num);
        }

        for (int i = 0; i < numbers.size(); i++) {
            if (i == numbers.size() - 1) {
                break;
            }

            int lastElement = numbers.get(numbers.size() - 1);
            int current = numbers.get(i);

            numbers.set(i, current + lastElement);
            numbers.remove(numbers.size() - 1);
        }

        for (Integer number: numbers) {
            System.out.print(number + " ");
        }
    }
}
