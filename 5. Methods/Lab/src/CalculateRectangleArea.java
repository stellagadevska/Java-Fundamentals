import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int area = calculateArea(width, height);
        System.out.println(area);
    }

    public static int calculateArea(int width, int height) {
        return width * height;
    }
}


