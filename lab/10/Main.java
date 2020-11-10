package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Array<Integer> array = new Array<>();
        array.add(10);
        array.add(2);
        array.add(4);
        System.out.println(array.get(1));

        Array<String> array1 = new Array<>();
        array1.add("1");
        array1.add("d");
        array1.add("212");
        System.out.println(array1.get(1));
    }
}
