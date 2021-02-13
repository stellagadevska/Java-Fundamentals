import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleToElevate = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int rounds = 0;
        while (peopleToElevate > 0) {
            peopleToElevate -= capacity;
            rounds++;
        }

        System.out.println(rounds);
    }
}
