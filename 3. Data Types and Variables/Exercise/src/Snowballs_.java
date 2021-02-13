import java.util.Scanner;

public class Snowballs_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfBallsMade = Integer.parseInt(scanner.nextLine());

        double bestSnowball = -1.0;
        int bestSnow = 0;
        int bestTime = 0;
        int bestQuality = 0;

        for (int i = 1; i <= numberOfBallsMade; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow((snowballSnow / snowballTime), snowballQuality);
            if (snowballValue >= bestSnowball) {
                bestSnowball = snowballValue;
                bestSnow = snowballSnow;
                bestTime = snowballTime;
                bestQuality = snowballQuality;
            }
        }

        System.out.printf("%d : %d = %.0f (%d)", bestSnow, bestTime, bestSnowball, bestQuality);
    }
}
