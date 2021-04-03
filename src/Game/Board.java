package Game;


import Outils.Contenu;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * Initialise la planche de jeu
 * +
 * Commandes liées à celle ci (vérif que la case est jouable etc...)
 *
 */
public class Board {


    public char[][] map;
    private Outils.Contenu[][] cases;


    /**
     * Doit initialiser la planche de jeu:
     *
     */
    public Board() throws IOException {


        this.map = Outils.Fonctions.mappingMap(Outils.Chemin.getCheminCarte()); // on transforme la mapIni.txt en char[][]

        this.cases = Outils.Fonctions.mapParser(this.map); // on passe le char[][] en Contenu[][]




    }

    public char[][] getMap() {
        return map;
    }

    public Contenu[][] getCases() {
        return cases;
    }

    public void setCases(Contenu[][] cases) {
        this.cases = cases;
    }
}
