package view.buttons;

import controller.*;
import javafx.scene.control.Button;

import javafx.event.EventHandler;
import javafx.scene.shape.Polygon;
import view.stage.MainStage;

public class ArrowButton extends Button {

    private EventHandler handler;
    private Polygon polygon;
    private double buttonWidth = MainStage.width/3;
    private double buttonHeight = MainStage.height/15;


    private Double upArrowShape[] = {
            buttonWidth/2, 0.0,
            0.0, buttonHeight,
            buttonWidth, buttonHeight };

    private Double downArrowShape[] = {
            buttonWidth/2, buttonHeight,
            0.0, 0.0,
            buttonWidth, 0.0 };

    private Double leftArrowShape[] = {
            0.0, buttonHeight/2,
            buttonWidth, 0.0,
            buttonWidth, buttonHeight };

    private Double rightArrowShape[] = {
            buttonWidth, buttonHeight/2,
            0.0, 0.0,
            0.0, buttonHeight };

    public ArrowButton(String direction){
        setPrefSize(buttonWidth,buttonHeight);
        switch (direction) {
        case "up":
            setText("UP");
            handler = new ArrowButtonUpHandler();
            setOnAction(handler);
            polygon = new Polygon();
            polygon.getPoints().addAll(upArrowShape);
            setShape(polygon);

            break;
        case "down":
            setText("DOWN");
            handler = new ArrowButtonDownHandler();
            setOnAction(handler);
            polygon = new Polygon();
            polygon.getPoints().addAll(downArrowShape);
            setShape(polygon);
            break;
        case "left":
            setText("LEFT");
            handler = new ArrowButtonLeftHandler();
            setOnAction(handler);
            polygon = new Polygon();
            polygon.getPoints().addAll(leftArrowShape);
            setShape(polygon);
            break;
        case "right":
            setText("RIGHT");
            handler = new ArrowButtonRightHandler();
            setOnAction(handler);
            polygon = new Polygon();
            polygon.getPoints().addAll(rightArrowShape);
            setShape(polygon);
            break;
        default:
            System.out.println("Can't create arrowButton");
    }
   }
}