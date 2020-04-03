package Views;

import Controllers.ControllerMain;
import Models.Joueur;
import Models.Pion;
import Models.Plateau;
import Views.GrapicalElement.GraphicalCase;
import javafx.scene.Group;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class ViewMain {
    public VBox root;
    public Group grpGame;
    public VBox vBoxConsoletext;
    public Text textConsole;

    public ViewMain(VBox root) {
        this.root = root;
        grpGame = new Group();
        vBoxConsoletext= new VBox();
        vBoxConsoletext.getChildren().add(textConsole = new Text("A Tour du Joueur 1"));
        root.getChildren().addAll(grpGame,vBoxConsoletext);
    }

    public void initPlateauGUI(Plateau plateau, ControllerMain controllerMain) {
        for (int i = 0; i < plateau.nombreDeCase ; i++) {
            for (int j = 0; j < plateau.nombreDeCase; j++) {
                GraphicalCase graphCase = new GraphicalCase(i,j);
                graphCase.setOnMouseClicked(controllerMain);
                grpGame.getChildren().add(graphCase);
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
        textConsole.setText(message);
    }
}
