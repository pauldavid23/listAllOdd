package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter number of digits: ");

        int num = scanner.nextInt();
        scanner.nextLine();

    int i = 0;
    while (i <= num) {

        if (i%2 != 0) {
            System.out.println(i);
        }

        i++;
    }


    }
}
