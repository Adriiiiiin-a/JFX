package Window;

import javafx.application.Application;
import javafx.stage.Stage;

import javax.swing.*;

public class testPacman extends Application {


    public static Stage fenetrePacman = new Stage();


    @Override
    public void start() throws Exception {



        fenetrePacman.setTitle("testPacman");
        fenetrePacman.setResizable(false); //On ne peut pas redimensionner le jeu

        fenetrePacman.show();
        fenetrePacman.centerOnScreen();



    }
}
