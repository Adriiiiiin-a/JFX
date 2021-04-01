package Game;

import Outils.Contenu;
import Outils.Directions;
import Outils.Fonctions;

import java.util.ArrayList;
import java.util.List;

public class Fantome {

    private Contenu typeFantome;

    private int[] coordonnees;

    private Directions precedenteDirection;

    private int etat = 0; //0 = etat normal, 1 = bleu, pacman a mangé un supergom, 2 = le fantôme a été mangé

    public Fantome(int type, int[] coo){

        switch (type){

            case 1:
                this.typeFantome = Contenu.FANTOME1;
                break;
            case 2:
                this.typeFantome = Contenu.FANTOME2;
                break;
            case 3:
                this.typeFantome = Contenu.FANTOME3;
                break;
            case 4:
                this.typeFantome = Contenu.FANTOME4;
                break;
            default:
                this.typeFantome = Contenu.INCONNU_ERREUR;
        }

        this.coordonnees = coo;
        this.precedenteDirection = null;


    }


    public Contenu getTypeFantome() {
        return typeFantome;
    }

    public void setTypeFantome(Contenu typeFantome) {
        this.typeFantome = typeFantome;
    }

    public int getEtat(){
        return etat;
    }

    public void setEtat(int etat){
        this.etat = etat;
    }

    public int[] getCoordonnees(){
        return coordonnees;
    }

    public void setCoordonnees(int[] coordonnees){
        this.coordonnees = coordonnees;
    }

    public Directions getPrecedenteDirection() {
        return precedenteDirection;
    }

    public void setPrecedenteDirection(Directions precedenteDirection) {
        this.precedenteDirection = precedenteDirection;
    }



    public void choixDirection(int degresDifficulté, Contenu[][] planche){

        int x = this.coordonnees[0];
        int y = this.coordonnees[1];

        List<Directions> positionsDispos = new ArrayList<Directions>();


        Contenu[] contenuAutour = Fonctions.scanContenuAutour(planche,x,y);

        positionsDispos = Fonctions.scanAutour(planche, x,y);

        // Si un fantome croise un autre les deux font demi tour


    }

    public int aEteMange(){ //appellé quand pacman a mangé le fantôme
        setEtat(2);
        setCoordonnees(Constantes.getCooDefaut());
        setEtat(0);
    }

}
