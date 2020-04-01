import Models.Joueur;
import Models.Pion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JoueurTest {

    @Test
    public void creerUnPionCorrectTest(){
        Joueur joueur = new Joueur(Pion.PionType.CROIX);
        int x = 1;
        int y = 1;
        Pion pion = joueur.creerUnPion(x, y);
        assertEquals(x, pion.posX);
        assertEquals(y, pion.posY);
    }

    @Test
    public void creerUnPionPasCorrectTest(){
        Joueur joueur = new Joueur(Pion.PionType.CROIX);
        int x = 1;
        int y = 1;
        Pion pion = joueur.creerUnPion(x, y);
        assertNotEquals(0, pion.posX);
        assertNotEquals(0, pion.posY);
    }
}
