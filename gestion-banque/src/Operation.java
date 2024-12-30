public class Operation {

    private String type;
    private  double montant;
    private  int date;
    private  String compteAssocie;

public Operation(String type, double montant, int date, String compteAssocie) {
    this.type = type;
    this.montant = montant;
    this.date = date;
    this.compteAssocie = compteAssocie;
}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getCompteAssocie() {
        return compteAssocie;
    }

    public void setCompteAssocie(String compteAssocie) {
        this.compteAssocie = compteAssocie;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "type='" + type + '\'' +
                ", montant=" + montant +
                ", date=" + date +
                ", compteAssocie='" + compteAssocie + '\'' +
                '}';
    }
}