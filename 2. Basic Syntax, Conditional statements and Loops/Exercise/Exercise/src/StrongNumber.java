import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numberAsString = scanner.nextLine();

        int totalSum = 0;

        for (int i = 0; i < numberAsString.length(); i++) {
            int digit = Integer.parseInt("" + numberAsString.charAt(i));
            int currentSum = 1;
            for (int j = 1; j <= digit; j++) {
                currentSum *= j;
            }

            totalSum += currentSum;
        }

        int number = Integer.parseInt(numberAsString);
        if (totalSum == number) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}

// import java.util.Scanner;
//
//public class StrongNumber_06 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int num = Integer.parseInt(scanner.nextLine());
//
//        int sum =0;
//        int originalNum = num;
//        while (num!=0){
//            int factoriel = 1;
//            int digit =0;
//            digit = num%10;
//            for(int i =1;i<=digit;i++){
//                factoriel = factoriel*i;
//            }
//            sum = sum + factoriel;
//            num = num /10;
//        }
//        if(sum==originalNum){
//            System.out.println("yes");
//        }else{
//            System.out.println("no");
//        }
//    }
//}