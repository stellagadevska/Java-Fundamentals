import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array1 = scanner.nextLine().split(" ");
        String[] array2 = scanner.nextLine().split(" ");

        for (String elementOne: array2) {
            for (String elementTwo: array1) {
                if(elementOne.equals(elementTwo)) {
                    System.out.printf("%s ", elementOne);
                }
            }
        }

    }
}
