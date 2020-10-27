package task1;

import java.util.Random;

public class Client {
    private int INN;
    private String fullName;

    public Client(String fullName) {
        Random random = new Random();
        this.INN = random.nextInt();
        this.fullName = fullName;
    }

    public int getINN() {
        return INN;
    }

    public String getFullName() {
        return fullName;
    }
}
