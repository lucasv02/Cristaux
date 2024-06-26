package modele;

public class ApprentiOrdonnateur {

    private Position posApprenti;
    private int cristalInHand;

    // Constructeur
    public ApprentiOrdonnateur() {
        this.posApprenti = new Position(0,0);
        this.cristalInHand = -1;
    }

    // Méthode pour obtenir la position de l'apprenti
    public Position getPositionApprenti() {
        return posApprenti;
    }

    // Méthode pour définir la position de l'apprenti
    public void setPositionApprenti(Position posApprenti) {
        this.posApprenti = posApprenti;
    }

    // Méthode pour obtenir le cristal que l'apprenti tient
    public int getCristalInHand() {
        return cristalInHand;
    }

    // Méthode pour définir le cristal que l'apprenti tient
    public void setCristalInHand(int cristalInHand) {
        this.cristalInHand = cristalInHand;
    }
}
