package Window;

import Outils.Chemin;
import Outils.Constantes;
import Outils.Contenu;
import com.sun.prism.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.image.ImageView;



public class affichageJeu {

    public void affichageJeu(){

    }


    public static void affiche(Contenu[][] tableauToPrint, GridPane paneActuel){



        for (int k = 0; k < Constantes.getNombreLignes(); k++) {
            for (int i = 0; i < Constantes.getNombreColonnes(); i++) {

                Contenu actuelContenu = tableauToPrint[k][i];

                switch (actuelContenu){

                    case BONBON:
                        ImageView imgBonBon = new ImageView(Chemin.getCheminPetitBonbonNoir());
                        paneActuel.add(imgBonBon, k, i);
                        break;
                    case VIDE:
                        ImageView imgVide = new ImageView(Chemin.getCheminFondNoir());
                        paneActuel.add(imgVide, k, i);
                        break;
                    case MUR:
                        ImageView imgMur = new ImageView(Chemin.getCheminMur());
                        paneActuel.add(imgMur, k, i);
                        break;
                    case PACMAN:
                        ImageView imgPacman = new ImageView(Chemin.getCheminPacmanDroite());
                        paneActuel.add(imgPacman, k, i);
                        break;
                    case FANTOME1:
                        ImageView imgF1 = new ImageView(Chemin.getCheminFantomeRouge());
                        paneActuel.add(imgF1, k, i);
                        break;
                    case FANTOME2:
                        ImageView imgF2 = new ImageView(Chemin.getCheminFantomeRose());
                        paneActuel.add(imgF2, k, i);
                        break;
                    //case FANTOME3:
                    //ImageView imgF3 = new ImageView(Chemin.getCheminFantomeBleu());
                    //paneActuel.add(imgF3, k, i);
                    //break;
                    case FANTOME4:
                        ImageView img = new ImageView(Chemin.getCheminFantomeOrange());
                        paneActuel.add(img, k, i);
                        break;
                    default:
                        ImageView imgERREUR = new ImageView(Chemin.getCheminFondBlanc());
                        paneActuel.add(imgERREUR, k, i);
                }




            }

        }



    }



}
