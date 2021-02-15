import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int[] array = new int[num];
        int sum = 0;

        for (int i = 0; i < num; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
            sum += array[i];
        }

        for (int i = 0; i < num; i++) {
            System.out.printf("%d ", array[i]);
        }

        System.out.println();
        System.out.println(sum);
    }
}
