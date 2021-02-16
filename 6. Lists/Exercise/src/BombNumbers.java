import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // read data
        String input = scanner.nextLine();
        List<Integer> sequence = Arrays.stream(input.split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String[] tokens = scanner.nextLine().split("\\s+");
        int bomb = Integer.parseInt(tokens[0]);
        int power = Integer.parseInt(tokens[1]);

        // detonation
        while (sequence.contains(bomb)) {
            int indexOfBomb = sequence.indexOf(bomb);
            int leftBound = Math.max(indexOfBomb - power,0);
            int rightBound = Math.min(indexOfBomb + power, sequence.size() - 1);

            for (int i = rightBound; i >= leftBound ; i--) {
                sequence.remove(i);
            }
        }

        // sum elements
        int sum = 0;
        for (int e:sequence) {
            sum += e;
        }

        // print sum
        System.out.println(sum);

    }
}
