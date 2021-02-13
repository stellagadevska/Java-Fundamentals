import java.util.Scanner;

public class PokeMon_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pokePower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());

        int currentPokePower = pokePower;
        int targetsCount = 0;

        while (currentPokePower >= distance) {
            currentPokePower -= distance;
            targetsCount++;
            if ((currentPokePower == pokePower / 2.0) && exhaustionFactor != 0) {
                currentPokePower /= exhaustionFactor;
            }
        }

        System.out.println(currentPokePower);
        System.out.println(targetsCount);
    }
}
