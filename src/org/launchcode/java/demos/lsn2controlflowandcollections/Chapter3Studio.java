package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Chapter3Studio {
    public static void main(String[] args) {
        HashMap<Character, Integer> charCounter = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String myString;

        //Take user input for a sentence to count
        System.out.println("Enter a sentence to count each character: ");
        myString = input.nextLine();
        myString = myString.toUpperCase();
        input.close();
        //Convert string to an array of characters
        char[] charactersArray = myString.toCharArray();

        //Remove all non-alphabetical characters
        //Loop through characters array and count occurrence of each character
        for (char c : charactersArray) {
            if (Character.isLetter(c)) {
                if (charCounter.containsKey(c)) {
                    charCounter.put(c, charCounter.get(c) + 1);
                } else {
                    charCounter.put(c, 1);
                }
            }

        }
        //Print map of characters and counts
        for (Map.Entry<Character, Integer> character : charCounter.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }
    }
}
