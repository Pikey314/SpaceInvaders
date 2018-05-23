package view.buttons;

import controller.ArrowButtonUpHandler;
import controller.FireButtonHandler;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.shape.Polygon;
import view.stage.MainStage;

public class FireButton extends Button {

    private EventHandler handler;
    private double buttonWidth = MainStage.width/3;
    private double buttonHeight = MainStage.height/15;

    public FireButton() {

        setPrefSize(buttonWidth,buttonHeight);
        setText("FIRE");
        handler = new FireButtonHandler();
        setOnAction(handler);
    }
}
