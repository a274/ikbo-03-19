package task1;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Client name");
        CheckINN.check(client, 123456);
    }
}
