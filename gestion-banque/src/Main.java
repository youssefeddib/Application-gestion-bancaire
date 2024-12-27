import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
         ArrayList<Client> clientArrayList = new ArrayList<>();
         ArrayList<Compte> compteArrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println(" menu principale");
            System.out.println("1.gestion client");
            System.out.println("2.gestion compte");
            System.out.println("3.gestion operation");
            System.out.println("3.quitter");
            System.out.println("4.votre choix");
            Client client = new Client();
            Compte compte = null;
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    client.gestionClient(clientArrayList);
                    break;
                case 2:
                    compte.gestionCompte(compteArrayList);
                    break;
                case 3:
                    //gererOperation();
                    break;
                case 4:
                    System.out.println("au revoir");
                    break;
                default:
                    System.out.println("choix invalide");
            }
        } while (choix != 4);
        scanner.close();
    }


}