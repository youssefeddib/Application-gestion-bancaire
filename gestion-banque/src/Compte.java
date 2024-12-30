import java.util.ArrayList;
import java.util.Scanner;

public abstract class Compte {


    private int nmcompte;//atrubet
    private int solde;
    private String client;

    public Compte(int nmcompte, int solde, String client) {
        this.nmcompte = nmcompte;
        this.solde = solde;
        this.client = client;

    }

    public Compte() {
    }

    public int getNmcompte() {
        return nmcompte;
    }

    public void setNmcompte(int nmcompte) {
        this.nmcompte = nmcompte;
    }

    public int getSolde() {
        return solde;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return
                "nmcompte=" + nmcompte +
                ", solde=" + solde +
                ", client='" + client ;
    }

    public void gestionCompte(ArrayList<Compte> comptes) {
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("---MENNU---");
            System.out.println("1.creer compte");
            System.out.println("2.afficher les information");
            System.out.println("3.associer plusieur compte");
            System.out.println("4.quiter");
            System.out.println("votre choix");
            choix = scanner.nextInt();
            Compte compte = new Compte() {
            };
            switch (choix) {
                case 1:
                    compte.creerCompte(comptes);
                    break;
                case 2:
                    compte.afficherLesInformations(comptes);
                    break;
                case 3:
                    //compte.associerplusieurcompte(compts);
                case 4:
                    System.out.println("au revoire");
                default:
                    System.out.println("choix invalide");
            }
        } while (choix != 4);
        scanner.close();
    }
public void creerCompte(ArrayList<Compte>comptes) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Nm COMPTE : ");
    int nmcompte = scanner.nextInt();

    System.out.println("SOLDE :");
    int solde = scanner.nextInt();

    System.out.println("client :");
    String client = scanner.nextLine();

        comptes.add(new CompteCourant(nmcompte, solde, client,50));
        System.out.println("Compte créé avec succès!");

}

    public void afficherLesInformations(ArrayList<Compte> comptes) {
        if (comptes.isEmpty()) {
            System.out.println("Aucun compte trouvé.");
        } else {
            for (Compte compte : comptes) {
                System.out.println(compte.toString());
            }
        }
    }


}




