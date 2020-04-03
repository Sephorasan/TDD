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
}
