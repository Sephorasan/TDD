import Models.Joueur;
import Models.Pion;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JoueurTest {

    @Test
    public void createPionCorrectTest(){
        Joueur joueur = new Joueur(Pion.Type.ROUND);
        assertEquals(Pion.Type.ROUND, joueur.pionType);
    }

    @Test
    public void createPionPasCorrectTest(){
        Joueur joueur = new Joueur(Pion.Type.ROUND);
        assertNotEquals(Pion.Type.CROIX, joueur.pionType);
    }
}
