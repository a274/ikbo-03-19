package com.company.task2;

public class Client {
    private Chair chair;

    public void sit() {
        System.out.printf("Client is sitting on a %s.%n", chair);
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
