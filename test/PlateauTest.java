import Models.Pion;
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

    @Test
    public void troisPionColonneAligneCROIXCorrectText() {
        Plateau plateau = new Plateau();
        plateau.pionsJoues = new Pion[][]{
                {new Pion(Pion.PionType.CROIX), new Pion(Pion.PionType.CROIX), new Pion(Pion.PionType.CROIX)},
                {null, null, null},
                {null, null, null}
        };
        Pion.PionType excepted = Pion.PionType.CROIX;
        assertEquals(excepted,plateau.troisPionColonneAligne());
    }

    @Test
    public void troisPionColonneAligneCROIXNotCorrectText() {
        Plateau plateau = new Plateau();
        plateau.pionsJoues = new Pion[][]{
                {new Pion(Pion.PionType.CROIX), null, new Pion(Pion.PionType.CROIX)},
                {null, null, new Pion(Pion.PionType.CROIX)},
                {new Pion(Pion.PionType.ROND), null, null}
        };
        Pion.PionType excepted = null;
        assertEquals(excepted,plateau.troisPionColonneAligne());
    }

    @Test
    public void troisPionColonneAligneRONDCorrectText() {
        Plateau plateau = new Plateau();
        plateau.pionsJoues = new Pion[][]{
                {new Pion(Pion.PionType.ROND), new Pion(Pion.PionType.ROND), new Pion(Pion.PionType.ROND)},
                {null, null, null},
                {null, null, null}
        };
        Pion.PionType excepted = Pion.PionType.ROND;
        assertEquals(excepted,plateau.troisPionColonneAligne());
    }

    @Test
    public void troisPionColonneAligneRONDNotCorrectText() {
        Plateau plateau = new Plateau();
        plateau.pionsJoues = new Pion[][]{
                {new Pion(Pion.PionType.ROND), null, new Pion(Pion.PionType.ROND)},
                {null, null, null},
                {null, null, null}
        };
        Pion.PionType excepted = null;
        assertEquals(excepted,plateau.troisPionColonneAligne());
    }

    @Test
    public void troisPionLigneAligneCROIXCorrectText() {
        Plateau plateau = new Plateau();
        plateau.pionsJoues = new Pion[][]{
                {new Pion(Pion.PionType.CROIX), null, new Pion(Pion.PionType.CROIX)},
                {new Pion(Pion.PionType.CROIX), null, null},
                {new Pion(Pion.PionType.CROIX), null, null}
        };
        Pion.PionType excepted = Pion.PionType.CROIX;
        assertEquals(excepted,plateau.troisPionsLigneAligne());
    }

    @Test
    public void troisPionLigneAligneCROIXNotCorrectText() {
        Plateau plateau = new Plateau();
        plateau.pionsJoues = new Pion[][]{
                {new Pion(Pion.PionType.CROIX), null, new Pion(Pion.PionType.CROIX)},
                {null, null, null},
                {new Pion(Pion.PionType.CROIX), null, null}
        };
        Pion.PionType excepted = null;
        assertEquals(excepted,plateau.troisPionsLigneAligne());
    }

    @Test
    public void troisPionLigneAligneRONDCorrectText() {
        Plateau plateau = new Plateau();
        plateau.pionsJoues = new Pion[][]{
                {new Pion(Pion.PionType.ROND), null, new Pion(Pion.PionType.CROIX)},
                {new Pion(Pion.PionType.ROND), null, null},
                {new Pion(Pion.PionType.ROND), null, null}
        };
        Pion.PionType excepted = Pion.PionType.ROND;
        assertEquals(excepted,plateau.troisPionsLigneAligne());
    }

    @Test
    public void troisPionLigneAligneRONDNotCorrectText() {
        Plateau plateau = new Plateau();
        plateau.pionsJoues = new Pion[][]{
                {new Pion(Pion.PionType.ROND), null, new Pion(Pion.PionType.CROIX)},
                {null, null, null},
                {new Pion(Pion.PionType.ROND), null, null}
        };
        Pion.PionType excepted = null;
        assertEquals(excepted,plateau.troisPionsLigneAligne());
    }

    @Test
    public void troisPionDiagonaleAligneCROIXCorrectText() {
        Plateau plateau = new Plateau();
        plateau.pionsJoues = new Pion[][]{
                {new Pion(Pion.PionType.CROIX), null, null},
                {null, new Pion(Pion.PionType.CROIX), null},
                {null, null, new Pion(Pion.PionType.CROIX)}
        };
        Pion.PionType excepted = Pion.PionType.CROIX;
        assertEquals(excepted,plateau.troisPionsDiagonalAligne());
    }
    @Test
    public void troisPionDiagonaleOtherAligneCROIXCorrectText() {
        Plateau plateau = new Plateau();
        plateau.pionsJoues = new Pion[][]{
                {null, null, new Pion(Pion.PionType.CROIX)},
                {null, new Pion(Pion.PionType.CROIX), null},
                {new Pion(Pion.PionType.CROIX), null, null}
        };
        Pion.PionType excepted = Pion.PionType.CROIX;
        assertEquals(excepted,plateau.troisPionsDiagonalAligne());
    }


}
