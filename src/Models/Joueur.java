package Models;

public class Joueur {
    public Pion.PionType type;

    public Joueur(Pion.PionType type){
        this.type=type;
    }

    public Pion creerUnPion(int posX, int posY){
        Pion pion = new Pion(type);
        pion.posX = posX;
        pion.posY = posY;
        return pion;
    }
}
