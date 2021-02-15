import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());
        String[] indexes = scanner.nextLine().split(" ");

        int[] field = new int[fieldSize];

        for (int i = 0; i < indexes.length; i++) {
            int index = Integer.parseInt(indexes[i]);
            if (index >= 0 && index < fieldSize) {
                field[index] = 1;
            }
        }

        //0 right 1
        //1 right 1
        //2 right 1
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] commandParts = command.split(" ");
            int ladybugIndex = Integer.parseInt(commandParts[0]);
            String direction = commandParts[1];
            int flyLength = Integer.parseInt(commandParts[2]);

            if (ladybugIndex < 0 || ladybugIndex > fieldSize - 1
                    || field[ladybugIndex] == 0) {
                command = scanner.nextLine();
                continue;
            }

            field[ladybugIndex] = 0;

            if (direction.equals("right")) {
                ladybugIndex += flyLength;
                while (ladybugIndex < fieldSize && field[ladybugIndex] == 1) {
                    ladybugIndex += flyLength;

                }
                if (ladybugIndex < fieldSize) {
                    field[ladybugIndex] = 1;
                }
            } else {
                ladybugIndex -= flyLength;
                while (ladybugIndex >= 0 && field[ladybugIndex] == 1) {
                    ladybugIndex -= flyLength;

                }
                if (ladybugIndex >= 0) {
                    field[ladybugIndex] = 1;
                }
            }

            command = scanner.nextLine();
        }

        for (int ladybug : field) {
            System.out.print(ladybug + " ");
        }

    }
}
