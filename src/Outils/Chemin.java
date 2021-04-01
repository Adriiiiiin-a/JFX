package Outils;

/**
 * Contient tous les chemins et des getters
 *
 */
public class Chemin {

    private static String cheminCarte = "fichiersExternes/carteIni.txt";
    private static String cheminBackground = "fichiersExternes/carteIni.text";


    public static String getCheminCarte(){
        return cheminCarte;
    }
    public static String getCheminBackground(){
        return cheminBackground;
    }
}
