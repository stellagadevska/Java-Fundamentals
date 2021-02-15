import java.util.Scanner;

public class SimmetricDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.next());
        int M = Integer.parseInt(scanner.next());
        int difference = 0;

        int[] arrayN = new int[N];
        int[] arrayM = new int[M];

        for (int i = 0; i < N; i++) {
            arrayN[i] = scanner.nextInt();
        }

        for (int i = 0; i < M; i++) {
            arrayM[i] = scanner.nextInt();
        }

        int diff = 0;
        int sum = 0;
        boolean areEqual = true;
        for (int i = 0; i < arrayN.length; i++) {
            if (arrayN[i] != arrayN[i]) {
                diff = i;
                areEqual = false;
                break;
            }
            sum += arrayN[i];
        }

        // Print
//        for (int element: arrayN) {
//            System.out.printf("%d ", element);
//        }
//
//        System.out.println();
//
//        for (int element: arrayM) {
//            System.out.printf("%d ", element);
//        }


    }
}

