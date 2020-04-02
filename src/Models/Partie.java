package Models;

public class Partie {
        public Joueur[] joueurs;
        public Joueur currentJoueur;
        public Plateau plateau;
        public int indiceJoueur;

        public Partie(){
            indiceJoueur = 0;
            joueurs = new Joueur[2];
            joueurs[0] = new Joueur(Pion.Type.CROIX);
            joueurs[1] = new Joueur(Pion.Type.ROUND);
            currentJoueur = joueurs[indiceJoueur];
            plateau = new Plateau();
        }

    /**
     * Passe au joueur suivant
     */
    public void joueurSuivant() {
            indiceJoueur++;
            if(indiceJoueur >= joueurs.length) {
                indiceJoueur = 0;
            }
            currentJoueur = joueurs[indiceJoueur];
        }

    /**
     * Test si c'est la fin de la partie
     * @return true si partie terminé
     */
    public boolean isFinPartie(){
            return currentJoueur.win || plateau.isPlateauPlein();
    }

    /**
     * Si on trouve une ligne avec le même type de pion 3fois le joueur actuel gagne
     */
    public void troisLigneAligne(){
            Pion.Type currentPionType = currentJoueur.pionType;
            for (int i = 0; i < plateau.nombreDeCase; i++) {
                int count = 0;
                for (int j = 0; j < plateau.nombreDeCase; j++) {
                    if(plateau.grille[i][j] == null) break;
                    if(plateau.grille[i][j].type.equals(currentPionType)) count++;
                    if(!plateau.grille[i][j].type.equals(currentPionType)) break;
                }
                if(count==3) currentJoueur.win = true;
            }
        };

    /**
     * Si on trouve une colonne avec le même type de pion 3fois le joueur actuel gagne
     */
    public void troisColoneAligne(){
            Pion.Type currentPionType = currentJoueur.pionType;
            for (int i = 0; i < plateau.nombreDeCase; i++) {
                int count = 0;
                for (int j = 0; j < plateau.nombreDeCase; j++) {
                    if(plateau.grille[j][i] == null) break;
                    if(plateau.grille[j][i].type.equals(currentPionType)) count++;
                    if(!plateau.grille[j][i].type.equals(currentPionType)) break;
                }
                if(count==3) currentJoueur.win = true;
            }
        }

    /**
     * Si on trouve une diagonal avec le même type de pion 3fois le joueur actuel gagne
     */
    public void troisDiagonalAligne(){
            Pion.Type currentPionType = currentJoueur.pionType;
            for (int i = 0; i < plateau.nombreDeCase; i+=2) {
                int count = 0;
                for (int j = 0; j < plateau.nombreDeCase; j++) {
                    int x = Math.abs(i-j);
                    int y = j;
                    if(plateau.grille[x][y] == null) break;
                    if(plateau.grille[x][y].type.equals(currentPionType)) count++;
                    if(!plateau.grille[x][y].type.equals(currentPionType)) break;
                }
                if(count==3) currentJoueur.win = true;
            }
        }
}
