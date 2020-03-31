package Models;

public class Partie {
    public boolean win;
    public int indiceDuJoueur;
    public Joueur[] joueurs;
    public Plateau plateau;

    public Partie(){
        win = false;
        indiceDuJoueur = 0;
        joueurs[0] = new Joueur(Pion.PionType.CROIX);
        joueurs[1] = new Joueur(Pion.PionType.ROND);
        plateau = new Plateau();
    }

    public Pion placerUnPion(Pion pion) {
        plateau.pionsJoues[pion.posX][pion.posY] = pion;
        return pion;
    }

    public int auTourDuJoueurNumero(){
        indiceDuJoueur++;
        if(indiceDuJoueur>(joueurs.length - 1)){
            indiceDuJoueur=0;
        }
        return indiceDuJoueur;
    }

    public boolean partieFinis(boolean troisPionAligne, boolean plateauPlein) {
        if(troisPionAligne || plateauPlein){
            return true;
        }
        return false;
    }

    public boolean verifierMouvementPossible(int posX, int posY) {
        if (    posX <= plateau.nombreDeCase
                || posY <= plateau.nombreDeCase
                || posX >= 0
                || posY >= 0
                || plateau.pionsJoues[posX][posY] == null){
            return true;
        }
        return  false;
    }
}
