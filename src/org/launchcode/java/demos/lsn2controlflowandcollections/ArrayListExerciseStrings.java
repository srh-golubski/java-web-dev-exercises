package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExerciseStrings {
    public static void main(String[] args) {
      ArrayList<String> stringsArray = new ArrayList<>();
      ArrayList<String> otherStringsArray = new ArrayList<>();
      int searchTerm;
      Scanner input = new Scanner(System.in);

      stringsArray.add("apple");
      stringsArray.add("banana");
      stringsArray.add("ham");
      stringsArray.add("cheese");
      stringsArray.add("bread");
      stringsArray.add("soup");

      System.out.println("Enter a number of letters per word: ");
      searchTerm = input.nextInt();

      for (int i = 0; i < stringsArray.size(); i++) {
          if (stringsArray.get(i).length() == searchTerm) {
              System.out.println(stringsArray.get(i));
              continue;
//              otherStringsArray.add(stringsArray.get(i));
          }
//    System.out.println(otherStringsArray);
        }
    }
}
