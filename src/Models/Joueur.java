package Models;

public class Joueur {
    public boolean winner;
    public Pion.PionType type;

    public Joueur(Pion.PionType type){
        this.type=type;
        winner = false;
    }

    public Pion creerUnPion(int posX, int posY){
        Pion pion = new Pion(type);
        pion.posX = posX;
        pion.posY = posY;
        return pion;
    }
}
