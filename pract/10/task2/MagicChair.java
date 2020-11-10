package com.company.task2;

public class MagicChair implements Chair {
    @Override
    public String toString() {
        return "Magic Chair";
    }

    public void doMagic(){
        System.out.println("Magic happens...");

    }
}
