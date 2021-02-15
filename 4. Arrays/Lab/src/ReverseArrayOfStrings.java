import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] elements = scanner.nextLine().split(" ");

        for (int i = 0; i < elements.length/2; i++) {
            String temp = elements[i];
            elements[i] = elements[elements.length - (1 + i)];
            elements[elements.length - (1 + i)] = temp;
        }

        for (String element:elements) {
            System.out.printf("%s ", element);
        }
    }
}
