package view.panels;

import javafx.scene.image.Image;
import javafx.scene.image.WritableImage;
import view.stage.MainStage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MiddleGamePanel extends WritableImage {
    private double imageWidth = MainStage.width;
    private double imageHeight = MainStage.height - MainStage.height/30 - MainStage.height/5;

    public MiddleGamePanel() throws FileNotFoundException {
        super(MainStage.width, MainStage.height - MainStage.height/30 - MainStage.height/5);

        Image background = new Image(new FileInputStream("C:\\Users\\Maciek P\\Desktop\\Malaga Erasmus\\Semestr 2\\ZajęciaS2\\Object oriented programming\\Space Invaders\\Git Support\\src\\view\\panels\\panelStyles\\space.jpg"),MainStage.width,(MainStage.height - MainStage.height/30 - MainStage.height/5),false,false );

        for (int i = 0; i<this.imageWidth; i++){
            for (int j =0; j<this.imageHeight; j++) {
                int argb = background.getPixelReader().getArgb(i,j);
                getPixelWriter().setArgb(i,j,argb);
            }
        }

    }


}
