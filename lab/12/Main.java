package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Pattern pattern = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher matcher = pattern.matcher("abc");
        System.out.println(matcher.matches());
        matcher = pattern.matcher("abcdefghijklmnopqrstuv18340");
        System.out.println(matcher.matches());
    }
}
