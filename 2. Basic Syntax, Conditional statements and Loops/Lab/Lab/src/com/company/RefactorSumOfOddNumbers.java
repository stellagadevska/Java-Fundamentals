package com.company;

import java.util.Scanner;

//1
//3
//5
//7
//9
//Sum: 25

public class RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int oddNum = 2 * i + 1;
            System.out.println(oddNum);
            sum += oddNum;
        }
        System.out.printf("Sum: %d%n", sum);

    }
}
