package Game;


import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import Outils.*;
import Outils.Fonctions.*;
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

    private int niveau;

    public boolean perdu;
    public boolean relance;

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

        this.perdu = false;
        this.niveau = 0;
        this.relance = false;

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
    public void jeu() throws InterruptedException {

        while(!this.perdu && !this.relance){

            this.boardPartie.setCases(joueurPartie.action(this.boardPartie.getCases()));

            if(this.perdu || this.relance){return;}

            this.boardPartie.setCases(fantome1.action(this.niveau ,this.boardPartie.getCases()));
            this.boardPartie.setCases(fantome2.action(this.niveau ,this.boardPartie.getCases()));
            this.boardPartie.setCases(fantome3.action(this.niveau ,this.boardPartie.getCases()));
            this.boardPartie.setCases(fantome4.action(this.niveau ,this.boardPartie.getCases()));

        }
        if(this.relance){this.relance = false; TimeUnit.SECONDS.sleep(3); jeu();}

        Fonctions.ecritureRecord(this.joueurPartie);





    }





}
