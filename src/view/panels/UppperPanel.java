package view.panels;

import javafx.scene.layout.HBox;
import view.fields.LevelField;
import view.fields.LifesField;
import view.fields.ScoreField;
import view.fields.TimeField;
import view.stage.MainStage;

public class UppperPanel extends HBox {

    public UppperPanel(){
        setHeight(MainStage.height/30);
        setWidth(MainStage.width);

        getStylesheets().add(getClass().getResource("panelStyles\\UpperPanelStyle.css").toExternalForm());
        getStyleClass().add("hbox");

        HBox lifesField = new LifesField();
        HBox timeField = new TimeField();
        HBox levelField = new LevelField();
        HBox scoreField = new ScoreField();

        getChildren().add(lifesField);
        getChildren().add(levelField);
        getChildren().add(scoreField);
        getChildren().add(timeField);
    }
}
