import java.util.Scanner;

public class SymmetricDiff {
    static void symmDiff(int[] arr1, int[] arr2, int n, int m) {
        // Traverse both arrays simultaneously.
        int i = 0, j = 0;
        while (i < n && j < m) {
            // Print smaller element and move
            // ahead in array with smaller element
            if (arr1[i] < arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
            } else if (arr2[j] < arr1[i]) {
                System.out.print(arr2[j] + " ");
                j++;
            }

            // If both elements same, move ahead
            // in both arrays.
            else {
                i++;
                j++;
            }
        }
    }

    // Driver code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 8 12 9 1
        //8 10 9
        int N = Integer.parseInt(scanner.next());
        int M = Integer.parseInt(scanner.next());
        int[] arrayN = new int[N];
        int[] arrayM = new int[M];

        for (int i = 0; i < N; i++) {
            arrayN[i] = scanner.nextInt();
        }

        for (int i = 0; i < M; i++) {
            arrayM[i] = scanner.nextInt();
        }

        symmDiff(arrayN, arrayM, N, M);
    }
}
