package Models;

public class Plateau {
    public int nombreDeCase;
    public boolean isTroisPionAligne;
    public Pion[][] pionsJoues;

    public Plateau(){
        nombreDeCase = 3;
        isTroisPionAligne=false;
        pionsJoues = new Pion[nombreDeCase][nombreDeCase];
    }

    public boolean plateauPlein(int totalDePion){
        if(totalDePion >= nombreDeCase*nombreDeCase){
            return true;
        }
        return  false;
    }

    public Pion.PionType troisPionAligne(){
        Pion.PionType type = null;
        if((type = troisPionColonneAligne()) != null){
            isTroisPionAligne=true;
            return type;
        }
        if((type = troisPionsDiagonalAligne()) != null){
            isTroisPionAligne=true;
            return type;
        }
        if((type = troisPionsLigneAligne()) != null){
            isTroisPionAligne=true;
            return type;
        }
        return null;
    }

    public Pion.PionType troisPionColonneAligne(){
        for (int i = 0; i < nombreDeCase ; i++) {
            byte count=0;
            Pion.PionType type = null;
            for (int j = 0; j < nombreDeCase; j++) {
                if(pionsJoues[i][j] == null) continue;
                if(count==0)type = pionsJoues[i][j].type;
                if(type != pionsJoues[i][j].type) break;
                count++;
            }
            if(count==3) return type;
        }
        return null;
    }

    public Pion.PionType troisPionsLigneAligne(){
        for (int i = 0; i < nombreDeCase ; i++) {
            byte count=0;
            Pion.PionType type = null;
            for (int j = 0; j < nombreDeCase; j++) {
                if(pionsJoues[j][i] == null) break;
                if(count==0)type = pionsJoues[j][i].type;
                if(type != pionsJoues[j][i].type) break;
                count++;
            }
            if(count==3) return type;
        }
        return null;
    }

    public Pion.PionType troisPionsDiagonalAligne(){
        int count=0;
        Pion.PionType type = null;
       for (int i = 0; i < nombreDeCase; i++) {
           if(pionsJoues[i][i] == null) break;
           if(count==0)type = pionsJoues[i][i].type;
           if(type != pionsJoues[i][i].type) break;
           count++;
       }
       if(count==3) return type;
        count=0;
        type = null;
        for (int i = 0; i < nombreDeCase; i++) {
            for (int j = 2; j < 0; j--) {
                if(pionsJoues[j][i] == null) break;
                if(count==0)type = pionsJoues[j][i].type;
                if(type != pionsJoues[j][i].type) break;
                count++;
            }
        }

        if(count==3) return type;
       return null;
    }
}
