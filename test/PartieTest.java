import Models.Partie;
import Models.Pion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PartieTest {

    // TEST PION LIGN ALIGN
    @Test
    public void troisPionColonneAligneCorrectCAS1Test(){
        Partie partie = new Partie();
        Pion pion = new Pion(partie.currentJoueur.pionType);
        partie.plateau.grille = new Pion[][]{
                {pion,null,null},
                {pion,null,null},
                {pion,null,null}
        };
        partie.troisColoneAligne();
        assertTrue(partie.currentJoueur.win);
    }

    @Test
    public void troisPionColonneAligneCorrectCAS2Test(){
        Partie partie = new Partie();
        Pion pion = new Pion(partie.currentJoueur.pionType);
        partie.plateau.grille = new Pion[][]{
                {null,pion,null},
                {null,pion,null},
                {null,pion,null}
        };
        partie.troisColoneAligne();
        assertTrue(partie.currentJoueur.win);
    }

    @Test
    public void troisPionColonneAligneCorrectCAS3Test(){
        Partie partie = new Partie();
        Pion pion = new Pion(partie.currentJoueur.pionType);
        partie.plateau.grille = new Pion[][]{
                {null,null,pion},
                {null,null,pion},
                {null,null,pion}
        };
        partie.troisColoneAligne();
        assertTrue(partie.currentJoueur.win);
    }

    @Test
    public void troisPionColonneAligneNotCorrectTest(){
        Partie partie = new Partie();
        Pion pion = new Pion(partie.currentJoueur.pionType);
        partie.plateau.grille = new Pion[][]{
                {null,null,pion},
                {null,null,null},
                {null,null,pion}
        };
        partie.troisColoneAligne();
        assertFalse(partie.currentJoueur.win);
    }

    // TEST PION LIGN ALIGN
    @Test
    public void troisPionLigneAligneCorrectCAS1Test(){
        Partie partie = new Partie();
        Pion pion = new Pion(partie.currentJoueur.pionType);
        partie.plateau.grille = new Pion[][]{
                {pion,pion,pion},
                {null,null,null},
                {null,null,null}
        };
        partie.troisLigneAligne();
        assertTrue(partie.currentJoueur.win);
    }

    @Test
    public void troisPionLigneAligneCorrectCAS2Test(){
        Partie partie = new Partie();
        Pion pion = new Pion(partie.currentJoueur.pionType);
        partie.plateau.grille = new Pion[][]{
                {null,null,null},
                {pion,pion,pion},
                {null,null,null}
        };
        partie.troisLigneAligne();
        assertTrue(partie.currentJoueur.win);
    }

    @Test
    public void troisPionLigneAligneCorrectCAS3Test(){
        Partie partie = new Partie();
        Pion pion = new Pion(partie.currentJoueur.pionType);
        partie.plateau.grille = new Pion[][]{
                {null,null,null},
                {null,null,null},
                {pion,pion,pion}
        };
        partie.troisLigneAligne();
        assertTrue(partie.currentJoueur.win);
    }

    @Test
    public void troisPionLigneAligneNotCorrectTest(){
        Partie partie = new Partie();
        Pion pion = new Pion(partie.currentJoueur.pionType);
        partie.plateau.grille = new Pion[][]{
                {null,null,null},
                {null,null,null},
                {pion,null,pion}
        };
        partie.troisLigneAligne();
        assertFalse(partie.currentJoueur.win);
    }

    // TEST PION DIAG ALIGN
    @Test
    public void troisPionDiagonalAligneCorrectCAS1Test(){
        Partie partie = new Partie();
        Pion pion = new Pion(partie.currentJoueur.pionType);
        partie.plateau.grille = new Pion[][]{
                {null,null,pion},
                {null,pion,null},
                {pion,null,null}
        };
        partie.troisDiagonalAligne();
        assertTrue(partie.currentJoueur.win);
    }

    @Test
    public void troisPionDiagonalAligneCorrectCAS2Test(){
        Partie partie = new Partie();
        Pion pion = new Pion(partie.currentJoueur.pionType);
        partie.plateau.grille = new Pion[][]{
                {pion,null,null},
                {null,pion,null},
                {null,null,pion}
        };
        partie.troisDiagonalAligne();
        assertTrue(partie.currentJoueur.win);
    }

    @Test
    public void troisPionDiagonalAligneNotCorrectTest(){
        Partie partie = new Partie();
        Pion pion = new Pion(partie.currentJoueur.pionType);
        partie.plateau.grille = new Pion[][]{
                {pion,null,null},
                {null,null,null},
                {null,null,pion}
        };
        partie.troisDiagonalAligne();
        assertFalse(partie.currentJoueur.win);
    }
}
