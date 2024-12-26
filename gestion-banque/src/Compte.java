public class Compte {

    private int nmcompte;
    private int solde;
    private String client;

public Compte(int nmcompte, int solde, String client, String methode){
    this.nmcompte = nmcompte;
    this.solde = solde;
    this.client = client;

}

    public int getNmcompte() {
        return nmcompte;
    }
    public void setNmcompte() {
        this.nmcompte = nmcompte;
    }

    public int getSolde() {
    return solde;
    }

    public void setSolde() {
    this.solde = solde;
    }

    public String getClient() {
    return client;
    }

    public void setClient(String client) {
        this.client = client;
    }
}


