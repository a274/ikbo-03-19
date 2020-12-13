package com.company.task5;

import java.util.Scanner;

public class Main {
    static String str;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        System.out.println(getLine());
    }

    static StringBuilder getLine(){
        String string = str;
        String[] words = string.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].charAt(words[i].length() - 1) == words[j].charAt(0)&&
                        !words[i].equals(" ") && !words[j].equals(" ")&&i!=j)
                {
                    stringBuilder.append(words[i]).append(" ").append(words[j]).append(" ");
                    words[i]=" ";
                    int k=-1;
                    while(k<words.length-1){
                        k++;
                        if (words[j].charAt(words[j].length() - 1) == words[k].charAt(0) &&
                                !words[k].equals(" ") && !words[j].equals(" ") && j != k)
                        {
                            stringBuilder.append(words[k]).append(" ");
                            words[j]=words[k];
                            words[k]=" ";
                            k=-1;
                        }
                    }
                    words[j]=" ";
                }
            }
        }
        for (String word : words) {
            if (!word.equals(" "))
                stringBuilder.append(word).append(" ");
        }
        return stringBuilder;
    }
}
