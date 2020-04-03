package Views.GrapicalElement;


import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class GraphicalCase extends Rectangle {
    public int sizeRectangle = 50;
    public int posX;
    public int posY;

    public GraphicalCase(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
        this.setWidth(sizeRectangle);
        this.setHeight(sizeRectangle);
        this.setLayoutX(posX *sizeRectangle);
        this.setLayoutY(posY *sizeRectangle);
        this.setFill(Color.WHITE);
        this.setStroke(Color.BLACK);
    }
}
