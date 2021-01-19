package com.company;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        if (b <= 10) {
            for (int i = b; i <= 10; i++) {
                int multiply = a * i;
                System.out.printf("%d X %d = %d%n", a, i, multiply);
            }
        } else {
            int multiply = a * b;
            System.out.printf("%d X %d = %d%n", a, b, multiply);
        }
    }
}
