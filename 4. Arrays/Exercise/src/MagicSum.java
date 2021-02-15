import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1 7 6 2 19 23     1 7
        // 8                 6 2

        String[] input = scanner.nextLine().split(" ");
        int magicSum = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[input.length];

        // Преобразуваме входния масив (String) към int масив
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i+1; j <= numbers.length - 1; j++) {
                if (numbers[i] + numbers[j] == magicSum) {
                    System.out.println(numbers[i] + " " + numbers[j]);
                }
            }
        }



    }
}
