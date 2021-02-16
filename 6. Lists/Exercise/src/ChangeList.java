import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String values = scanner.nextLine();
        List<Integer> intList = Arrays.stream(values.split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] inputParts = input.split("\\s+");
            String command = inputParts[0];
            int element = Integer.parseInt(inputParts[1]);

            switch (command) {
                case "Delete":
                    while (intList.contains(element)) {
                        intList.remove(Integer.valueOf(element));
                    }
//                    intList.removeIf(el -> el == element);
                    break;
                case "Insert":
                    int position = Integer.parseInt(inputParts[2]);
                    if (position < intList.size()) {
                        intList.add(position, element);
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        for (int elem : intList) {
            System.out.print(elem + " ");
        }

//        String output = joinElementsByDelimiter(intList, " ");
//        System.out.println(output);

    }

//    static String joinElementsByDelimiter(List<Integer> items, String delimiter) {
//        String output = "";
//        for (Integer item : items)
//            output += (item + delimiter);
//        return output;
//    }

}
