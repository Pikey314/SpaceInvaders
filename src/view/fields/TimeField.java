package view.fields;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import view.stage.MainStage;

public class TimeField extends HBox {
    private double fieldWidth = MainStage.width/4;
    private double fieldHeight = MainStage.height/30;
    private Label label = new Label("Time: ");
    private TextField textField = new TextField("0");


    public TimeField(){
        setPrefSize(fieldWidth,fieldHeight);
        setAlignment(Pos.CENTER);
        label.setFont(new Font("Arial", 15));
        getChildren().add(label);
        textField.setPrefSize(fieldWidth/2,fieldHeight/2);
        getChildren().add(textField);


    }
}
