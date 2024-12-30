import java.util.ArrayList;
import java.util.Scanner;

public class CompteEpargne extends Compte {
    private double fraisBancaires;

    public CompteEpargne (int nmcompte, int solde, String client,double fraisBancaires) {

        super(nmcompte, solde, client);
        this.fraisBancaires = fraisBancaires;

    }


    public CompteEpargne(){
        super();
    }

    public double getFraisBancaires() {
        return fraisBancaires;
    }

    public void setFraisBancaires(double fraisBancaires) {
        this.fraisBancaires = fraisBancaires;
    }

    @Override
    public String toString() {
        return "CompteEpargne " + super.toString() +
                "fraisBancaires=" + fraisBancaires +
                '}';
    }
}
