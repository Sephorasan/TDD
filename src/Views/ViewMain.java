package Views;

import Controllers.ControllerMain;
import Models.Joueur;
import Models.Pion;
import Models.Plateau;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class ViewMain {
    public Group root;
    public Text consoleText;
    public int sizeRectangle = 50;

    public ViewMain(Group root) {
        this.root = root;
        consoleText = new Text();

        root.getChildren().addAll();
    }

    public void initPlateauGUI(Plateau plateau, ControllerMain controllerMain) {
        for (int i = 0; i < plateau.nombreDeCase ; i++) {
            for (int j = 0; j < plateau.nombreDeCase; j++) {
                Rectangle rect = new Rectangle();
                rect.setWidth(sizeRectangle);
                rect.setHeight(sizeRectangle);
                rect.setLayoutX(i*sizeRectangle);
                rect.setLayoutY(j*sizeRectangle);
                rect.setOnMouseClicked(controllerMain);
                root.getChildren().add(rect);
            }
        }
    }

    public void drawPlateau(Rectangle rectangle, Joueur joueur){
        if(joueur.pionType.equals(Pion.Type.CROIX)){
            rectangle.setFill(Color.RED);
        } else {
            rectangle.setFill(Color.BLUE);
        }
    }

    public void updateConsole(String message){

    }
}
