package Controllers;
import Main.TicTacToe;
import Models.Partie;
import Models.Plateau;
import MyException.PionOutOfPlateau;
import MyException.PionOverlapAnOtherPion;
import Views.GrapicalElement.GraphicalCase;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;


public class ControllerMain implements EventHandler<MouseEvent> {
    public TicTacToe main;
    public Partie partie;
    public Plateau plateau;

    public ControllerMain(TicTacToe main) {
        this.main = main;
        partie = new Partie();
        plateau = partie.plateau;
        main.viewMain.updateConsole("Au tour du Joueur " + (partie.indiceJoueur + 1));
        main.viewMain.initPlateauGUI(partie.plateau,this);
    }

    @Override
    public void handle(MouseEvent mouseEvent) {
        if(!partie.end) {
            if (mouseEvent.getSource() instanceof GraphicalCase) {

                GraphicalCase targetRect = (GraphicalCase) mouseEvent.getSource();
                int choiceX = targetRect.posX; int choiceY = targetRect.posY;
                try {
                    //
                    plateau.verifierSiMouvementPossible(choiceX, choiceY);

                    plateau.placerPion(choiceX, choiceY, partie.currentJoueur.createPion());
                    main.viewMain.drawPlateau(targetRect,partie.currentJoueur);
                    plateau.incrementationDuTotalDePions();
                    partie.end = partie.isFinPartie(    partie.isCurrentPlayerWinTheGame(   partie.isTroisLigneAligne(),
                                                                                            partie.isTroisColoneAligne(),
                                                                                            partie.isTroisDiagonalAligne()),
                                                        plateau.isPlateauPlein());
                    partie.joueurSuivant();
                    main.viewMain.updateConsole("Au tour du Joueur " + (partie.indiceJoueur + 1));
                } catch (PionOutOfPlateau pionOutOfPlateau) {
                    main.viewMain.updateConsole(pionOutOfPlateau.getMessage());
                } catch (PionOverlapAnOtherPion pionOverlapAnOtherPion) {
                    main.viewMain.updateConsole(pionOverlapAnOtherPion.getMessage());
                }
            }
            if(partie.end){
                main.viewMain.updateConsole("Partie Terminée");
                if(partie.currentJoueur.win) {
                    main.viewMain.updateConsole("Le Joueur " + (partie.indiceJoueur + 1 ) + " gagne !");
                }
            }
        }
    }
}
