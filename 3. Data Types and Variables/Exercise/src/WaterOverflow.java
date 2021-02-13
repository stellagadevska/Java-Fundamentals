import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = 255;

        int n = Integer.parseInt(scanner.nextLine());
        int litres = 0;
        int filledCapacity = 0;

        for (int i = 0; i < n; i++) {
            litres = Integer.parseInt(scanner.nextLine());
            if ((filledCapacity + litres) > 255) {
                System.out.println("Insufficient capacity!");
            } else {
                filledCapacity += litres;
            }
        }

        System.out.println(filledCapacity);
    }
}
