import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] parts = scanner.nextLine().split(" ");

        List<Double> numbers = new ArrayList<>();
        for (String part: parts) {
            double num = Double.parseDouble(part);

            numbers.add(num);
        }

        for (int i = 0; i < numbers.size() - 1; i++) {
            double current = numbers.get(i);
            double next = numbers.get(i + 1);

            if (current == next) {
                numbers.remove(i + 1);
                numbers.set(i, current + next);
                i = -1;
            }
        }

        DecimalFormat decimalFormat = new DecimalFormat("0.#");
        for (Double number: numbers) {
            System.out.print(decimalFormat.format(number) + " ");
        }
    }
}
