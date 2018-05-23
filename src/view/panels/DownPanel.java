package view.panels;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import view.buttons.ArrowButton;
import view.buttons.FireButton;
import view.stage.MainStage;
import javafx.scene.shape.*;

public class DownPanel extends VBox {

    public DownPanel() {
        setHeight(MainStage.height/5);
        setWidth(MainStage.width);
        getStylesheets().add(getClass().getResource("panelStyles\\DownPanelStyle.css").toExternalForm());
        getStyleClass().add("vbox");


        Button buttonUp = new ArrowButton("up");
        Button shootButton = new FireButton();
        Button buttonL = new ArrowButton("left");
        Button buttonR = new ArrowButton("right");
        Button buttonD = new ArrowButton("down");








        HBox topRow = new HBox();
        topRow.setPrefHeight(MainStage.height/15);

        topRow.getChildren().add(buttonUp);
        topRow.setAlignment(Pos.CENTER);
        


        HBox middleRow = new HBox();
        middleRow.setPrefHeight(MainStage.height/15);

        middleRow.getChildren().add(buttonL);
        middleRow.getChildren().add(shootButton);
        middleRow.getChildren().add(buttonR);
        middleRow.setAlignment(Pos.CENTER);



        HBox bottomRow = new HBox();
        bottomRow.setPrefHeight(MainStage.height/15);

        bottomRow.getChildren().add(buttonD);
        bottomRow.setAlignment(Pos.CENTER);

        getChildren().add(topRow);
        getChildren().add(middleRow);
        getChildren().add(bottomRow);






    }
}
