package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapStudentIds {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer newId;

        System.out.println("Enter Student ID (or ENTER to finish): ");

        do {
            System.out.print("Student ID: ");
            newId = input.nextInt();

            if (!newId.equals(null)) {
                System.out.print("Student Name: ");
                String newName = input.nextLine();
                students.put(newId, newName);

                input.nextLine();
            }
        } while(!newId.equals(null));

        System.out.println("\nClass roster: ");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }
    }
}
