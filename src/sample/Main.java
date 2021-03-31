package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;




public class Main extends Application {

    //final Text clicBoutonCommencer = n

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("The Pacman by Adri1");


        GridPane pane = new GridPane();

        pane.setAlignment(Pos.CENTER);
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setPadding(new Insets(25,25,25,25));



        Text titreScene = new Text("Bienvenue, entrez votre pseudo: ");
        titreScene.setFont(Font.font("Futura", FontWeight.NORMAL,20));
        pane.add(titreScene,0,0,2,1);

        Label pseudo = new Label("Pseudo:");
        pane.add(pseudo,0,1);

        TextField pseudoChampTexte = new TextField();
        pane.add(pseudoChampTexte,1,1);

        Button btnLancementJeu = new Button("Commencer !");
        HBox hbBoutonLancementJeu = new HBox(10);
        hbBoutonLancementJeu.setAlignment(Pos.BOTTOM_RIGHT);
        hbBoutonLancementJeu.getChildren().add(btnLancementJeu);

        Button btnRecords = new Button("Records");
        HBox hbBoutonRecords = new HBox(10);
        hbBoutonRecords.setAlignment(Pos.BOTTOM_LEFT);
        hbBoutonRecords.getChildren().add(btnRecords);



        pane.add(hbBoutonLancementJeu,1,4);
        pane.add(hbBoutonRecords, 1, 4);






        Scene scene = new Scene(pane, 400,275);

        primaryStage.setScene(scene);








        primaryStage.show();






    }


    public static void main(String[] args) {
        launch(args);
    }
}
