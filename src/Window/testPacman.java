package Window;

import Game.Partie;
import Outils.Contenu;
import Outils.Fonctions;
import Outils.Mode;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

import static Game.Clavier.toucheUtilisateur;

public class testPacman extends Application {


    private Partie jeu;

    private GridPane grilleAffichage;





    @Override
    public void start(Stage fenetrePacman) throws Exception {

/*        StackPane root = new StackPane();
        root.setId("pacman");
        Scene scene = new Scene(root, 300, 250);
        scene.getStylesheets().addAll(this.getClass().getResource("stylePacman.css").toExternalForm());

        fenetrePacman.setScene(scene);*/


        BorderPane bordureJeu = new BorderPane();


        GridPane grilleJeu = new GridPane();
        this.grilleAffichage = grilleJeu;





        fenetrePacman.setTitle("testPacman");
        fenetrePacman.setResizable(false); //On ne peut pas redimensionner le jeu





        Partie partie = new Partie("NomDuJoueur", Mode.PACMAN);


        StackPane jeu = new StackPane();
        jeu.setId("jeu");
        Scene scenePartie = new Scene(grilleJeu,300,150);

        affichageJeu affichageJeu = new affichageJeu();



        while(!partie.perdu) {


            while (!partie.perdu && !partie.relance) {

                toucheUtilisateur(scenePartie, partie);

                Contenu[][] toPrint = partie.jeu();
                affichageJeu.affiche(toPrint, grilleJeu);






                fenetrePacman.setScene(scenePartie);
                fenetrePacman.show();
                fenetrePacman.centerOnScreen();



                TimeUnit.MILLISECONDS.sleep(500);

            }
            if (partie.relance) {
                partie.relance = false;
                TimeUnit.SECONDS.sleep(10);
            }
        }

        Fonctions.ecritureRecord(partie.getJoueurPartie());




    }





    public static void main(String[] args) throws InterruptedException {

        launch(args);

    }
}
