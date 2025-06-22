package pl.umcs.oop.client;

import java.io.IOException;
import java.net.Socket;

public class RandomWordsClient {
    private static final String SERVER_HOST = "localhost";
    private static final int SERVER_PORT = 8765;
    public static void main(String[] args) {
        try {
            Socket socket = new Socket(SERVER_HOST, SERVER_PORT);


            socket.close();
        }
        catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
