package Models;

import MyException.PionOutOfPlateau;
import MyException.PionOverlapAnOtherPion;

public class Plateau {
    public Pion[][] grille;
    public int nombreDeCase;

    public Plateau(){
        nombreDeCase = 3;
        grille = new Pion[nombreDeCase][nombreDeCase];
    }

    /**
     * Test si le plateau est plein
     * @return true si plateau plein
     */
    public boolean isPlateauPlein(){
        for (int i = 0; i < nombreDeCase; i++) {
            for (int j = 0; j < nombreDeCase; j++) {
                if(grille[i][j] == null) return false;
            }
        }
        return true;
    }

    /**
     * Integre un pion sur la grille du plateau
     * @param x la position x du pion a posé
     * @param y la position y du pion a posé
     * @param pion le pion a posé
     * @throws PionOutOfPlateau Si le pion veut être poser en dehors du plateau
     * @throws PionOverlapAnOtherPion Si le pion veut être poser sur un autre pion
     */
    public Pion placerUnPion(int x, int y, Pion pion) throws PionOutOfPlateau, PionOverlapAnOtherPion {
        if(     x > nombreDeCase
                || x < 0
                || y > nombreDeCase
                || y < 0 )
            throw new PionOutOfPlateau("Le pion est en dehors du plateau");

        if(grille[x][y] != null)
            throw new PionOverlapAnOtherPion("Il a déjà un pion en x : " + x + " et y : " + y);

        grille[x][y] = pion;
        return pion;
    }

}
