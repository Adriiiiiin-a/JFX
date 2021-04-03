package Game;

import Outils.Directions;
import com.sun.javafx.scene.traversal.Direction;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Clavier {

    public static void toucheUtilisateur(Scene scene, Partie partieActuelle){

        scene.setOnKeyPressed(new EventHandler<KeyEvent>()
        {
            @Override
            public void handle(KeyEvent event)
            {
                //goes up
                if(event.getCode() == KeyCode.UP)
                {

                    partieActuelle.joueurPartie.setDirection(Directions.HAUT);
                }
                //goes down
                else if(event.getCode() == KeyCode.DOWN)
                {
                    partieActuelle.joueurPartie.setDirection(Directions.BAS);
                }
                // goes right
                else if(event.getCode() == KeyCode.RIGHT)
                {
                    partieActuelle.joueurPartie.setDirection(Directions.DROITE);
                }
                // goes left
                else if(event.getCode() == KeyCode.LEFT)
                {
                    partieActuelle.joueurPartie.setDirection(Directions.GAUCHE);
                }
            }
        });






    }










}
