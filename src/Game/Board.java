package Game;

import java.io.FileNotFoundException;

/**
 *
 * Initialise la planche de jeu
 * +
 * Commandes liées à celle ci (vérif que la case est jouable etc...)
 *
 */
public class Board {

    private int lignes;
    private int colonnes;
    public char[][] map;
    private Contenu[][] cases;


    /**
     * Doit initialiser la plache de jeu:
     * traduire le char en Contenu[][]
     */
    public Board() throws FileNotFoundException {


        this.map = Outils.Fonctions.mappingMap(Outils.Chemin.getCheminCarte());




















    }




}
