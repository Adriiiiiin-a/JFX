package Game;

public class Player extends Partie {

    private String nomJoueur;
    private int recordJoueur; // A utiliser si on finit plus tot avec une co BDD




    public int getRecordJoueur() {
        return recordJoueur;
    }

    public void setRecordJoueur(int recordJoueur) {
        this.recordJoueur = recordJoueur;
    }



    public Player() { }


    public String getNomJoueur() {
        return nomJoueur;
    }

    public void setNomJoueur(String nomJoueur) {
        this.nomJoueur = nomJoueur;
    }

    @Override
    public String toString() {
        return "Player{" +
                "nomJoueur='" + nomJoueur + '\'' +
                ", recordJoueur=" + recordJoueur +
                '}';
    }

    public Player(String nomJoueur){
        this.nomJoueur = nomJoueur;
    }



}
