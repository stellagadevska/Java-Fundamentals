import java.util.Scanner;

public class GreaterValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int char String
        String command = scanner.nextLine();
        switch (command) {
            case "int":
                int value1 = Integer.parseInt(scanner.nextLine());
                int value2 = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(value1, value2));
                break;
            case "char":
                char char1 = scanner.nextLine().charAt(0);
                char char2 = scanner.nextLine().charAt(0);
                System.out.println(getMax(char1, char2));
                break;
            case "string":
                String str1 = scanner.nextLine();
                String str2 = scanner.nextLine();
                System.out.println(getMax(str1, str2));
                break;
        }
    }

    public static int getMax(int value1, int value2) {
        if (value1 > value2) {
            return value1;
        }

        return value2;
    }

    public static char getMax(char value1, char value2) {
        if (value1 > value2) {
            return value1;
        }

        return value2;
    }

    public static String getMax(String value1, String value2) {
        if (value1.compareTo(value2) >= 0) {
            return value1;
        }

        return value2;
    }
}
