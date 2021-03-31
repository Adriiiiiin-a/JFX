package Game;


import java.io.FileNotFoundException;

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

        Board board = null;
        try {
            board = new Board();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        this.joueurPartie = joueur;
        this.boardPartie = board;

    }

    public Player getJoueurPartie() {
        return joueurPartie;
    }

    public Board getBoardPartie() {
        return boardPartie;
    }
}
