import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGameCnt = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headsetCrashCnt = 0;
        int mouseCrashCnt = 0;
        int keyboardCrashCnt = 0;
        int displayCrashCnt = 0;
        double expenses = 0;

        for (int i = 1; i <= lostGameCnt; i++) {
            if (i % 2 == 0) {
                headsetCrashCnt++;
            }
            if (i % 3 == 0) {
                mouseCrashCnt++;
            }
            if (i % 2 == 0 && i % 3 == 0) {
                keyboardCrashCnt++;
            }
        }
        displayCrashCnt = keyboardCrashCnt / 2;
        expenses = (headsetCrashCnt * headsetPrice)
                + (mouseCrashCnt * mousePrice) +
                (keyboardCrashCnt * keyboardPrice) + (displayCrashCnt * displayPrice);
        System.out.printf("Rage expenses: %.2f lv.",expenses);
    }
}