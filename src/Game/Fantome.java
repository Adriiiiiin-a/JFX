package Game;

import Outils.Constantes;
import Outils.Contenu;
import Outils.Directions;
import Outils.Fonctions;

import java.util.ArrayList;
import java.util.List;

public class Fantome {

    private Contenu typeFantome;

    private int[] coordonnees;

    private Directions precedenteDirection;

    private int etat; //0 = normal, 1 = bleu, 2 = mangé


    public Fantome(int type, int[] coo){

        switch (type) {
            case 1 -> this.typeFantome = Contenu.FANTOME1;
            case 2 -> this.typeFantome = Contenu.FANTOME2;
            case 3 -> this.typeFantome = Contenu.FANTOME3;
            case 4 -> this.typeFantome = Contenu.FANTOME4;
            default -> this.typeFantome = Contenu.INCONNU_ERREUR;
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

    public int[] getCoordonnees(){
        return coordonnees;
    }

    public void setCoordonnees(int[] coordonnees){
        this.coordonnees = coordonnees;
    }

    public Directions getPrecedenteDirection(){
        return precedenteDirection;
    }

    public void setPrecedenteDirection (Directions direction){
        this.precedenteDirection = direction;
    }

    public int getEtat(){
        return etat;
    }

    public void setEtat(int etat){
        this.etat = etat;
    }

    public Contenu[][] action(int degresDifficulte, Contenu[][] planche){

        int x = this.coordonnees[0];
        int y = this.coordonnees[1];

        List<Directions> positionsDispos = new ArrayList<>();


        Contenu[] contenuAutour = Fonctions.scanContenuAutour(planche,x,y);

        positionsDispos = Fonctions.scanAutour(planche, x,y);

        // Si un fantome croise un autre les deux font demi tour


        return planche;
    }
    public void aEteMange(){
        setEtat(2);
        setCoordonnees(Constantes.getCooDefaut());
        setEtat(0);
    }
//    public void pacMangeSuperGom(){
//    }

}
