import Models.Pion;
import Models.Plateau;
import MyException.PionOutOfPlateau;
import MyException.PionOverlapAnOtherPion;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlateauTest {
        @Test
        public void placerPionCorretTest() throws PionOutOfPlateau, PionOverlapAnOtherPion {
            Plateau plateau = new Plateau();
            int x = 1, y = 1;
            Pion pion = new Pion(Pion.Type.CROIX);
            assertEquals(plateau.grille[x][y],plateau.placerUnPion(x,y,pion));
        }
}
