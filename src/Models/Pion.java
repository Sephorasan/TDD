package Models;

public class Pion {
    public int posX, posY;
    public enum PionType { CROIX, ROND };
    public PionType type;

    public Pion(PionType type){
        this.type = type;
    }
}
