package com.company.task2;

import java.util.StringTokenizer;

public class Address {
    private final String country, region, city, street, house, corpus, flat;

    public Address(String s) {
        s = s.trim();
        String[] str = s.split(",");
        country = str[0];
        region = str[1];
        city = str[2];
        street = str[3];
        house = str[4];
        corpus = str[5];
        flat = str[6];
    }

    public Address(String s, String split) {
        s = s.trim();
        StringTokenizer st = new StringTokenizer(s, split);
        String[] str = new String[10]; int i = 0;
        while (st.hasMoreTokens()) {
            str[i] = (st.nextToken());
            i++;
        }
        country = str[0];
        region = str[1];
        city = str[2];
        street = str[3];
        house = str[4];
        corpus = str[5];
        flat = str[6];
    }


    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %s %s", country, region, city, street, house, corpus, flat);
    }
}
