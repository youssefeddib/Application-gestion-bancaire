import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Client> clientArrayList = new ArrayList<>();
    static ArrayList<Compte> compteArrayList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println(" menu principale");
            System.out.println("1.gerer client");
            System.out.println("2.gerer compte");
            System.out.println("3.gerer operation");
            System.out.println("3.quitter");
            System.out.println("4.votre choix");

            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    //gererClient();
                    break;
                case 2:
                    //gererCompte();
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