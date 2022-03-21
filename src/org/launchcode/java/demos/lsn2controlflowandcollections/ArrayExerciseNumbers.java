package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.Scanner;

public class ArrayExerciseNumbers {
    public static void main(String[] args) {
        int maxNumbers = 6;
        int[] defaultNumbers = new int[] {
                1, 1, 2, 3, 5, 8
        };

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < maxNumbers; i++) {
            if (defaultNumbers[i]%2==0) {
                System.out.print(defaultNumbers[i] + ", ");
            }
        }
    }
}
