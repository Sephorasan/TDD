import Models.Pion;
import Models.Plateau;
import MyException.PionOutOfPlateau;
import MyException.PionOverlapAnOtherPion;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlateauTest {
        @Test
        public void verifierMouvementPossibleCorrectTest() throws PionOutOfPlateau, PionOverlapAnOtherPion {
            Plateau plateau = new Plateau();
            int x = 1, y = 1;
            assertTrue(plateau.verifierSiMouvementPossible(x,y));
        }

        @Test
        public void isPlateauPleinCorrectTest(){
            Plateau plateau = new Plateau();
            plateau.totalPions = 9;
            assertTrue(plateau.isPlateauPlein());
        }

        @Test
        public void isPlateauPleinPasCorrectTest(){
            Plateau plateau = new Plateau();
            plateau.totalPions = 6;
            assertFalse(plateau.isPlateauPlein());
        }

        @Test
        public void placerPionCorrectTest(){
            Plateau plateau = new Plateau();
            int x = 1, y = 2;
            Pion pion = new Pion(Pion.Type.CROIX);
            plateau.placerPion(x,y,pion);
            assertEquals(pion,plateau.grille[x][y]);
        }

        @Test
        public void placerPionPasCorrectTest(){
            /*Plateau plateau = new Plateau();
            int x = 4, y = 6;
            Pion pion = new Pion(Pion.Type.CROIX);
            plateau.placerPion(x,y,pion);
            assertNotEquals(pion,plateau.grille[x][y]);*/
    }

        @Test
        public void incrementationDuTotalDePionsCorrectTest() {
            /*Plateau plateau = new Plateau();
            plateau.totalPions = 9;
            assertEquals(plateau.incrementationDuTotalDePions()); */
        }

        @Test
        public void incrementationDuTotalDePionsPasCorrectTest() {
            /*Plateau plateau = new Plateau();
            plateau.totalPions = 10;
            assertEquals(plateau.incrementationDuTotalDePions()); */
    }

}
