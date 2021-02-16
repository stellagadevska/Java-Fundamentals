import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> player1 = readIntList(scanner);
        List<Integer> player2 = readIntList(scanner);

        while (!player1.isEmpty() && !player2.isEmpty()) {
            if (player1.get(0).equals(player2.get(0))) {
                player1.remove(0);
                player2.remove(0);
            } else if (player1.get(0) > player2.get(0)) {
                player1.add(player1.get(0));
                player1.add(player2.get(0));
                player1.remove(0);
                player2.remove(0);
            } else if (player2.get(0) > player1.get(0)) {
                player2.add(player2.get(0));
                player2.add(player1.get(0));
                player2.remove(0);
                player1.remove(0);
            }
        }

        String winner = " ";
        int sum = 0;
        if (player1.isEmpty()) {
            winner = "Second";
            for (int card : player2) {
                sum += card;
            }
        } else {
            winner = "First";
            for (int card : player1) {
                sum += card;
            }
        }
        System.out.printf("%s player wins! Sum: %d", winner, sum);
    }

    private static List<Integer> readIntList(Scanner scanner) {
        String input = scanner.nextLine();
        List<Integer> sequence = Arrays.stream(input.split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        return sequence;
    }
}
