package com.company.task2;

public class Test {
    public static void main(String[] args) {
        Client client = new Client();
        ChairFactory factory = new ChairFactory();
        client.setChair(factory.createVictorianChair());
        client.sit();
        client.setChair(factory.createFunctionalChair());
        client.sit();
        client.setChair(factory.createMagicChair());
        client.sit();
    }
}
