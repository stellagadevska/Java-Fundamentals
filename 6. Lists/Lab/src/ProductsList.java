import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductsList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        List<String> products = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String current = scanner.nextLine();

            products.add(current);
        }

        Collections.sort(products);

        for (int i = 1; i < products.size() + 1; i++) {
            System.out.println(i + "." + products.get(i-1));
        }
    }
}
