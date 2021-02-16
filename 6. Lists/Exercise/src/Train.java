import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // read list
        String values = scanner.nextLine();
        List<Integer> listOfWagons = Arrays.stream(values.split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[]  inputParts = input.split(" ");
            if (inputParts[0].equals("Add")) {
                listOfWagons.add(Integer.parseInt(inputParts[1]));
            } else {
                int passengers = Integer.parseInt(inputParts[0]);

                for (int i = 0; i < listOfWagons.size(); i++) {
                    boolean flag = false;
                    if (passengers + listOfWagons.get(i) <= maxCapacity) {
                        listOfWagons.set(i, listOfWagons.get(i) + passengers);
                        flag = true;
                    }

                    if (flag) {
                        break;
                    }
                }
            }

            input = scanner.nextLine();
        }

        for (int wagon: listOfWagons) {
            System.out.print(wagon + " ");
        }

    }
}
