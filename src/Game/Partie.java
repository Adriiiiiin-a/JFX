package Game;


/**
 *Initialise la partie:
 * Planche de jeu
 * Joueur
 * Fantomes
 *
 */


public class Partie {

    private Player joueurPartie;

    private Board boardPartie;

    public Partie() {

        Player joueur = new Player();

        Board board = new Board();

        this.joueurPartie = joueur;
        this.boardPartie = board;

    }



}
