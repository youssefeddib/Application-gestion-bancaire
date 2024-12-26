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

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom() {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom() {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setEmail() {
        this.telephone = telephone;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choix;


        do {
            System.out.println("MENU PRINCIPALE");
            System.out.println("1.ajouter un client");
            System.out.println("2.afficher un client");
            System.out.println("3.quiter lapplication");
            System.out.println("votre choix");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    // ajouterClient();
                    break;
                case 2:
                    // afficherClient();
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









}





