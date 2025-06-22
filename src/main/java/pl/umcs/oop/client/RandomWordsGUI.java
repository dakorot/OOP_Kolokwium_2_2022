package pl.umcs.oop.client;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.Socket;

public class RandomWordsGUI extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        try {
            Socket socket = new Socket("localhost", 8765);

            BorderPane borderPane = new BorderPane();
            Scene scene = new Scene(borderPane);
            stage.setScene(scene);
            stage.setTitle("Random Words");
            stage.show();

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}
