package Controllers;
import Main.TicTacToe;
import Models.Partie;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class ControllerMain implements EventHandler<MouseEvent> {
    public TicTacToe main;
    public Partie partie;

    public ControllerMain(TicTacToe main) {
        this.main = main;
        partie = new Partie();
        main.viewMain.initPlateauGUI(partie.plateau,this);
    }


    @Override
    public void handle(MouseEvent mouseEvent) {
        if(mouseEvent.getSource() instanceof Rectangle){
            Rectangle targetRect = (Rectangle) mouseEvent.getSource();
            targetRect.setFill(Color.RED);
        }
    }
}
