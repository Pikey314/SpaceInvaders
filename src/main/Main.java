package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import view.buttons.ArrowButton;
import view.stage.MainStage;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage = new MainStage();
        primaryStage.show();

        /*Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();*/
    }






    public static void main(String[] args) {

        launch(args);
    }
}
