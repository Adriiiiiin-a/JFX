package Outils;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fonctions {


    /**
     * Utilise pour convertir un String vers un char[][] la fonction de Matthew Sant - https://stackoverflow.com/questions/27095380/convert-string-to-2d-char-array
     * @param pathFichier le lien du fichier à lire
     * @return unTableau 2D de char
     * @throws FileNotFoundException fichier introuvable
     */
    public static char[][] mappingMap(String pathFichier) throws FileNotFoundException {

        String temp = null;
        String sautLigne = "|";
        String toString ="";

        File map = new File(pathFichier);
        Scanner scan = new Scanner(map);

        while (scan.hasNextLine()){

            temp = scan.nextLine();
            toString += temp;
            toString += sautLigne;

        }

        String[] lignes = toString.split("|");
        char[][] chars = new char[lignes.length + 1][];
        for (int i = 0; i < lignes.length; i++) {
            String component = lignes[i];
            chars[i] = component.toCharArray();
        }
        chars[lignes.length] = new char[] { '\0' };

        return chars;

    }

}
