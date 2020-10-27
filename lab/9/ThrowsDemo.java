package com.company;

import java.util.Scanner;

public class ThrowsDemo {
    public static void getKey() {
        Scanner myScanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter Key ");
                String key = myScanner.nextLine();
                printDetails(key);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private static String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }
}