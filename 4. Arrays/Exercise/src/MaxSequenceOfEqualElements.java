import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];

        // Преобразуваме входния масив (String) към int масив
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        int digit = 0;

        int bestLength = 0;
        int currentLength = 1;
        for (int i = 0; i < numbers.length - 1; i++) {
             int currentElement = numbers[i];
             int nextElement = numbers[i+1];
             if (currentElement == nextElement) {
                 currentLength++;
                 if (currentLength > bestLength) {
                     bestLength = currentLength;
                     digit = currentElement;
                 }
             } else {
                 currentLength = 1;
             }
        }

        for (int i = 0; i < bestLength; i++) {
            System.out.print(digit + " ");
        }
    }
}
