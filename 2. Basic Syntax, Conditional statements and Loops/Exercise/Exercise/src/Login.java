import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        boolean isLogged = false;

        String reverse = "";
        for (int i = username.length() - 1; i >= 0; i--) {
            reverse += username.charAt(i);
        }

        String password = scanner.nextLine();
        for (int i = 1; i < 4; i++) {
            if (password.equals(reverse)) {
                isLogged = true;
                System.out.printf("User %s logged in.", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            password = scanner.nextLine();
        }

        if (!isLogged) {
            System.out.printf("User %s blocked!", username);
        }

    }
}
