import java.util.ArrayList;
import java.util.Scanner;

public class CompteCourant extends Compte {
    private double fraisBancaires;

    public CompteCourant (int nmcompte, int solde, String client,double fraisBancaires) {

    super(nmcompte, solde, client);
        this.fraisBancaires = fraisBancaires;

    }


    public CompteCourant(){
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
        return "CompteCourant " + super.toString() +
                "fraisBancaires=" + fraisBancaires +
                '}';
    }
}