import java.util.Scanner;

public class LowerToUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
//        char symbol = scanner.nextLine().charAt(0);

        if (name.equals(name.toLowerCase())) {
            System.out.println("lower-case");
        } else {
            System.out.println("upper-case");
        }

    }
}
