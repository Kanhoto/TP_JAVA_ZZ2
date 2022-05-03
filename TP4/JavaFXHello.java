import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class JavaFXHello extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        Button btn = new Button();
        Button otherButton = new Button("autre essai");
        btn.setText("Say 'Hello World'");

        btn.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World! de btn");
            }
        });

        otherButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World! de otherButton");
            }
        });

        StackPane root = new StackPane();
        primaryStage.setScene(new Scene(root, 600, 600));
        primaryStage.show();

        root.getChildren().add(btn);
        root.getChildren().add(otherButton);

    }
}