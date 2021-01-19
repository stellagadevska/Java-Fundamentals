import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        double lightsabersTotalPrice = Math.ceil(studentsCount * 1.1) *lightsaberPrice;
        double robesTotalPrice = studentsCount * robePrice;
        int freeBeltsCount = studentsCount / 6;
        double beltsTotalPrice = (studentsCount - freeBeltsCount) * beltPrice;

        double finalPrice = lightsabersTotalPrice + robesTotalPrice + beltsTotalPrice;

        if (finalPrice <= money) {
            System.out.printf("The money is enough - it would cost %.2flv.", finalPrice);
        } else {
            double moneyNeed = finalPrice - money;
            System.out.printf("Ivan Cho will need %.2flv more.", moneyNeed);
        }

        // •	If the calculated price of the equipment is less or equal to the money Ivan Cho has:
        //o	"The money is enough - it would cost {the cost of the equipment}lv."
        //•	If the calculated price of the equipment is more than the money Ivan Cho has:
        //o	 "Ivan Cho will need {neededMoney}lv more."
        //•	All prices must be rounded to two digits after the decimal point.


    }
}
