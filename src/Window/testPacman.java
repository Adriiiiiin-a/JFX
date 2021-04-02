package Window;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javax.swing.*;

public class testPacman extends Application {





    @Override
    public void start(Stage fenetrePacman) throws Exception {

        StackPane root = new StackPane();
        root.setId("pane");
        Scene scene = new Scene(root, 300, 250);
        scene.getStylesheets().addAll(this.getClass().getResource("stylePacman.css").toExternalForm());

        fenetrePacman.setScene(scene);




        fenetrePacman.setTitle("testPacman");
        fenetrePacman.setResizable(false); //On ne peut pas redimensionner le jeu

        fenetrePacman.show();
        fenetrePacman.centerOnScreen();



    }
}
