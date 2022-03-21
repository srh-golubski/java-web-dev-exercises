package org.launchcode.java.demos.lsn2controlflowandcollections;

public class ArrayListExerciseNumbers {
    public static void main(String[] args) {
        int[] numbersArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numbersSum = 0;
        for (int i = 0; i < numbersArray.length; i++) {
            numbersSum += numbersArray[i];
        }
        System.out.println(numbersSum);
    }
}
