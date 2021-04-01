package Game;


import java.io.FileNotFoundException;
import Outils.*;

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

    private Fantome fantome1;
    private Fantome fantome2;
    private Fantome fantome3;
    private Fantome fantome4;

    public Partie() {

        Player joueur = new Player();

        Board board = null;
        try {
            board = new Board();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Fantome fantome1 = new Fantome(1,Constantes.getCooDefaut());
        Fantome fantome2 = new Fantome(2,Constantes.getCooDefaut());
        Fantome fantome3 = new Fantome(3,Constantes.getCooDefaut());
        Fantome fantome4 = new Fantome(4,Constantes.getCooDefaut());


        this.joueurPartie = joueur;
        this.boardPartie = board;

        this.fantome1 = fantome1;
        this.fantome2 = fantome2;
        this.fantome3 = fantome3;
        this.fantome4 = fantome4;

    }

    public Player getJoueurPartie() {
        return joueurPartie;
    }

    public Board getBoardPartie() {
        return boardPartie;
    }


    /**
     *
     *
     */
    public void jeu(){







    }





}
