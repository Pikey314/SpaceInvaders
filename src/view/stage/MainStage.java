package view.stage;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import view.buttons.ArrowButton;
import view.panels.DownPanel;
import view.panels.UppperPanel;

import java.awt.*;

public class MainStage extends Stage {
    public static final int width = 500;
    public static final int height = 800;

    public MainStage(){
        setTitle("Space Invaders");


        BorderPane layout = new BorderPane();
        VBox downPanel = new DownPanel();
        HBox upperPanel = new UppperPanel();
        layout.setBottom(downPanel);
        layout.setTop(upperPanel);


        Scene scene = new Scene (layout,this.width,this.height);
        setScene(scene);
    }
}
