import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        double price = calculatePrice(product, count);
        System.out.printf("%.2f", price);

    }

    private static double calculatePrice(String product, int count) {
        double price = 0.00;
        switch (product) {
            case "coffee":
                price = 1.50 * count;
                break;
            case "water":
                price = 1.00 * count;
                break;
            case "coke":
                price = 1.40 * count;
                break;
            case "snacks":
                price = 2.00 * count;
                break;
        }

        return price;
    }
}
