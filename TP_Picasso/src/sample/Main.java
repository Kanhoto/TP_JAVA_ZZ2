package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Random;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    public static void main(String[] args) {
        final int MAX=8;
        launch(args);

        Task task = new Task<Void>() {

            @Override public Void call() {
                Group group = new Group();
                for (int i=1; i<=MAX; i++) {
                    if (isCancelled())
                        break;

                    // ce qu'il y a à faire
                    // mise à jour de la barre de progression

                }

                // remplacer le noeud

                return null;
            }

        };



        Thread proc = new Thread(task);
        proc.start();


    }
}
