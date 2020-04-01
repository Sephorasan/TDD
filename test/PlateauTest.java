import Models.Plateau;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlateauTest {

    @Test
    public void plateauPleinCorrectTest(){
        Plateau plateau = new Plateau();
        assertTrue(plateau.plateauPlein(9));
    }

    @Test
    public void plateauPleinPasCorrectTest(){
        Plateau plateau = new Plateau();
        assertFalse(plateau.plateauPlein(6));
    }


}
