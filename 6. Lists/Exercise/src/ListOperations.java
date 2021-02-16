import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String values = scanner.nextLine();
        List<Integer> intList = Arrays.stream(values.split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] commandParts = input.split(" ");
            String command = commandParts[0];

            switch (command) {
                case "Add":
                    int num = Integer.parseInt(commandParts[1]);
                    intList.add(num);
                    break;
                case "Insert":
                    int n = Integer.parseInt(commandParts[1]);
                    int i = Integer.parseInt(commandParts[2]);
                    if (i < 0 || i > intList.size() - 1) {
                        System.out.println("Invalid index");
                    } else {
                        intList.add(i, n);
                    }
                    break;
                case "Remove":
                    int index = Integer.parseInt(commandParts[1]);
                    if (index < 0 || index > intList.size() - 1) {
                        System.out.println("Invalid index");
                    } else {
                        intList.remove(index);
                    }
                    break;
                case "Shift":
                    String direction = commandParts[1];
                    int count = Integer.parseInt(commandParts[2]);

                    if (direction.equals("left")) {
                        for (int j = 0; j < count ; j++) {
                            int temp = intList.remove(0);
                            intList.add(temp);
                        }
                    } else {
                        for (int j = 0; j < count ; j++) {
                            int temp = intList.remove(intList.size() - 1);
                            intList.add(0, temp);
                        }
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        printList(intList);
    }

    private static void printList(List<Integer> intList) {
        for (Integer e: intList) {
            System.out.print(e + " ");
        }
    }
}
