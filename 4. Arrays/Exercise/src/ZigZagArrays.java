import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] array1 = new String[n];
        String[] array2 = new String[n];

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String element1 = input[0];
            String element2 = input[1];

            if (i % 2 == 0) {
                array1[i] = element1;
                array2[i] = element2;
            } else {
                array1[i] = element2;
                array2[i] = element1;
            }

        }

        System.out.println(String.join(" ", array1));
        System.out.println(String.join(" ", array2));
    }
}
