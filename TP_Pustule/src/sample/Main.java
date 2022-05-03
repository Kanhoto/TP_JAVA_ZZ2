package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.stage.*;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.event.Event;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("TP_Pustule");
        HBox root = new HBox();
        Button btnClose = new Button("Close");
        Button[] b = new Button[10];

        for(int i=0; i<10; i++)
        {
            b[i] = new Button("0");
            b[i].setOnAction(new Gestionnaire(b[i]));
            b[i].setPrefSize(50,50);
            root.getChildren().add(b[i]);
        }

        Scene scene = new Scene(new Group(), 100, 100);

        primaryStage.setOnCloseRequest(evt -> {
            // allow user to decide between yes and no
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Do you really want to close this application?", ButtonType.YES, ButtonType.NO);

            // clicking X also means no
            ButtonType result = alert.showAndWait().orElse(ButtonType.NO);

            if (ButtonType.NO.equals(result)) {
                // consume event i.e. ignore close request
                evt.consume();
            }
        });

        primaryStage.setScene(new Scene(root, 500, 50));
        primaryStage.show();
    }
}