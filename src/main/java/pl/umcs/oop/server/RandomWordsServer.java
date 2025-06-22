package pl.umcs.oop.server;

import jogamp.common.util.locks.SingletonInstanceServerSocket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RandomWordsServer {
    private static final int PORT = 8765;
    private static final ExecutorService threadPool = Executors.newCachedThreadPool();
//    private static final List<ClientHandler> clients
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server is listening on port " + PORT);
            while(true) {
                System.out.println("Waiting for connection...");
                Socket socket = serverSocket.accept();
                System.out.println("Connected to socket " + socket + " successfully");
//                threadPool.submit();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            threadPool.shutdown();
        }
    }
}
