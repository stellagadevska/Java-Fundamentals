import java.util.Scanner;

public class SpiceMustFlow_ {
    public static void main(String[] args) {
        // Day 1 we extract 111 spice and at the end of the shift, the workers consume 26, leaving 85. The yield drops by 10 to 101.
        // Day 2 we extract 101 spice, the workers consume 26, leaving 75. The total is 160 and the yield has dropped to 91.
        // Since the expected yield is less than 100, we abandon the source. The workers take another 26, leaving 134. The mine has operated 2 days.
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());

        int days = 0;
        int totalAmountOfSpice = 0;

        while (startingYield >= 100) {
            days++;
            totalAmountOfSpice += startingYield;
            totalAmountOfSpice -= 26;
            startingYield -= 10;

            if (startingYield < 100) {
                totalAmountOfSpice -= 26;
            }
        }

        System.out.println(days);
        System.out.println(totalAmountOfSpice);
    }
}
