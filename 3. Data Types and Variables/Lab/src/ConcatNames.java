import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String surname = scanner.nextLine();
        String delimiter = scanner.nextLine();

        System.out.println(name + delimiter + surname);
    }
}
