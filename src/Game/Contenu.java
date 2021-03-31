package Game;

/**
 * On Définit le contenu de la case et on lui attribue l'image en fonction de son symbole
 */
public class Contenu {

    private int X; // Coordonnée X (colonne) de la case
    private int Y; // Coordonnée Y (ligne) de la case

    private nomContenu defContenu; // Nom de l'entité

    private String lienImage; // Lien de l'image correspondante

    private Board plancheJeu; // Planche de jeu

    public Contenu(int coordonneeX, int coordonneeY, nomContenu nomContenu, Board plancheDeJeu, String lienImage){
        this.X = coordonneeX;
        this.Y = coordonneeY;
        this.defContenu = nomContenu;
        this.plancheJeu = plancheDeJeu;
        this.lienImage = lienImage;
    }

    public int getX() {
        return this.X;
    }

    public int getY() {
        return this.Y;
    }

    public nomContenu getDefContenu() {
        return this.defContenu;
    }

    public String getLienImage() {
        return this.lienImage;
    }

    public Board getPlancheJeu() {
        return this.plancheJeu;
    }


}
