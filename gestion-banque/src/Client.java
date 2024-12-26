import java.util.ArrayList;
import java.util.Scanner;

public class Client {

    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;

    public Client(int id, String nom, String prenom, String email, String telephone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
    }
    public Client(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public  void gestionClient(ArrayList<Client> clients) {
        Scanner scanner = new Scanner(System.in);
        int choix;


        do {
            System.out.println("MENU PRINCIPALE");
            System.out.println("1.ajouter un client");
            System.out.println("2.afficher un client");
            System.out.println("3.quiter lapplication");
            System.out.println("votre choix");
            choix = scanner.nextInt();
            Client client = new Client();

            switch (choix) {
                case 1:
                    client.ajouterClient(clients);
                    break;
                case 2:
                     client.afficherClient(clients);
                    break;
                case 3:
                    System.out.println("au revoire");
                    break;
                default:
                    System.out.println("choix invalide");
            }
        }while (choix !=3);
        scanner.close();
    }

    public  void ajouterClient(ArrayList<Client> clients){
        Scanner scanner = new Scanner(System.in);

        System.out.print("entrer Id:");
        int id = scanner.nextInt();

        System.out.print("enter nom:");
        String nom = scanner.nextLine();

        System.out.print("entrer prenom:");
        String prenom = scanner.nextLine();

        System.out.print("entrer email:");
        String email = scanner.nextLine();

        System.out.print("enter telephone:");
        String telephone = scanner.nextLine();


        Client client = new Client(id, nom, prenom,email, telephone);
        clients.add(client);
        System.out.println("clinet ajouter avec sucees");

    }










}





