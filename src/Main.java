import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Server server = new Server();
        server.start(8000);

        Client client1 = new Client("Дед Максим", "localhost", 8000);
        client1.start();

        Client client2 = new Client("Семён", "localhost", 8000);
        client2.start();
    }
}
