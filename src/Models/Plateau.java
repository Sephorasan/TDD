package Models;

public class Plateau {
    public int nombreDeCase;
    public Pion[][] pionsJoues;

    public Plateau(){
        nombreDeCase = 3;
        pionsJoues = new Pion[nombreDeCase][nombreDeCase];
    }

    public boolean plateauPlein(int totalDePion){
        if(totalDePion >= nombreDeCase*nombreDeCase){
            return true;
        }
        return  false;
    }

    public boolean troisPionAligne(){

        return true;
    }
}
