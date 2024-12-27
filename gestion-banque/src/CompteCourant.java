import java.util.ArrayList;
import java.util.Scanner;

public class CompteCourant extends Compte {
    private double fraisBancaires;

    public CompteCourant (int nmcompte, int solde, String client,double fraisBancaires) {

    super(nmcompte, solde, client);
        this.fraisBancaires = fraisBancaires;
    }
    Scanner scanner = Scanner(System.in);

    public CompteCourant(){
        super();
    }
Override
}