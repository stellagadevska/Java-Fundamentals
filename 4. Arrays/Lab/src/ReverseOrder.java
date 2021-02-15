import java.util.Scanner;

public class ReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[num];

        // input numbers
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        // reverse numbers
        for (int i = num-1; i >= 0; i--) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
