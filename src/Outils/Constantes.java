package Outils;

public class Constantes {

    // propriétés de(s) map(s)
    private static int nombreLignes = 31 ;
    private static int nombreColonnes = 28;

    private static int[] cooDefaut = {1,27};

    private static int[] cooSpawnPlayer = {1,1};

    public static int getNombreLignes() {
        return nombreLignes;
    }

    public static int getNombreColonnes() {
        return nombreColonnes;
    }


    public static int[] getCooDefaut() {
        return cooDefaut;
    }

    public static int[] getCooSpawnPlayer() {
        return cooSpawnPlayer;
    }
}
