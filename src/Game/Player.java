package Game;

import Outils.Constantes;
import Outils.Contenu;
import Outils.Contenu.*;
import Outils.Directions;
import Outils.Fonctions;
import com.sun.prism.impl.shape.ShapeUtil;
import Outils.Constantes.*;

import static Outils.Constantes.getCooSpawnPlayer;
import static Outils.Directions.*;
import static Outils.Fonctions.*;

public class Player extends Partie{

    private String nomJoueur;
    private int recordJoueur; // A utiliser si on finit plus tot avec une co BDD

    private int[] coordonnes;

    private Contenu PACMAN = Contenu.PACMAN;

    private Directions precedenteDirection;

    private int nbVies;

    private int score;




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


    public int[] getCoordonnes() {
        return coordonnes;
    }

    public void setCoordonnes(int[] coordonnes) {
        this.coordonnes = coordonnes;
    }

    public Directions getPrecedenteDirection() {
        return precedenteDirection;
    }

    public void setPrecedenteDirection(Directions precedenteDirection) {
        this.precedenteDirection = precedenteDirection;
    }

    @Override
    public String toString() {
        return "Player{" +
                "nomJoueur='" + nomJoueur + '\'' +
                ", recordJoueur=" + recordJoueur +
                '}';
    }

    public Player(String nomJoueur){

        this.coordonnes= getCooSpawnPlayer();
        this.precedenteDirection = null;
        this.nomJoueur = nomJoueur;
        this.score = 0;
        this.nbVies = 3;
    }



    public Contenu[][] action(Contenu[][] planche){

        int x = this.coordonnes[0];
        int y = this.coordonnes[1];
        boolean loose = false;

        Contenu actual = scanPos(planche, x, y);

        loose = checkLose(actual);
        if(loose){

            if(nbVies >0) {
                this.nbVies -= 1;
                super.relance = true;
            }else{
                System.out.print("Perdu ! looser va <3");
                super.perdu = true;
                return planche;
            }

            }




        String toucheEnfoncee = null;
        Directions dir;


        switch (toucheEnfoncee){

            case "fleche de droite":
                dir = DROITE;
                break;
            case "fleche du bas":
                dir = BAS;
                break;
            case "fleche de gauche":
                dir = GAUCHE;
                break;
            case "fleche du haut":
                dir = HAUT;
                break;
            default:
                dir = this.precedenteDirection;
        }

        this.precedenteDirection = dir;



        Contenu[] contenuAutour = Fonctions.scanContenuAutour(planche,x,y);


        if(dir == GAUCHE && checkTraversable(dir, contenuAutour,this.PACMAN)){



        }else if(dir == DROITE && checkTraversable(dir, contenuAutour,this.PACMAN)){


        }else if (dir == HAUT && checkTraversable(dir, contenuAutour,this.PACMAN)){


        }else if (dir == BAS && checkTraversable(dir, contenuAutour,this.PACMAN)){



        }










    }




}
