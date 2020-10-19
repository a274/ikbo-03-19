package com.company;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("D:\\Projects\\java\\lab8\\file.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}