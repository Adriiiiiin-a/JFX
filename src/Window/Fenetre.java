package Window;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.awt.*;

import static javafx.application.Application.launch;

public class Fenetre extends Stage {

    Scene scene1, scene2, test;
    String url = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.deviantart.com%2Fchristian8717%2Fart%2FPacMan-Random-Game-Menu-Design-662844031&psig=AOvVaw24ohpsQ7XU3itnHE_-2Bvm&ust=1617354496075000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCPjpoqbZ3O8CFQAAAAAdAAAAABAD";

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        primaryStage.setTitle("My First JavaFX GUI");
        primaryStage.setWidth(800);
        primaryStage.setHeight(600);
        Image img = new Image(url,32,32,false,true;
        BackgroundImage myBI= new BackgroundImage(img);
        BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);




//Scene 1
        javafx.scene.control.Label label1 = new javafx.scene.control.Label("Menu Principale");

        javafx.scene.control.Button button1= new javafx.scene.control.Button("Play");
        button1.setOnAction(e -> primaryStage.setScene(scene2));
        VBox layout = new VBox();
        layout.getChildren().addAll(label1,button1);
        scene1 = new Scene(layout,500,550);


//Scene 2
        javafx.scene.control.Label label2= new javafx.scene.control.Label("This is the second scene");
        javafx.scene.control.Button button2= new Button("Menu principale");
        button2.setOnAction(e -> primaryStage.setScene(scene1));
        VBox layout2= new VBox(20);
        layout2.getChildren().addAll(label2, button2);
        scene2= new Scene(layout2,300,250);


        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }



}
