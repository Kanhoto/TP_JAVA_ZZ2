package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class Gestionnaire implements EventHandler<ActionEvent> {
    Button bouton;

    public Gestionnaire(Button b) {
        bouton = b;
    }

    @Override
    public void handle(ActionEvent event) {
        int v = Integer.parseInt(bouton.getText());
        bouton.setText(String.valueOf(v+1));
    }
}
