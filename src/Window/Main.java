package Window;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import org.w3c.dom.Text;

import javax.swing.text.StyledEditorKit;
import java.awt.*;

public class Main extends Application {

    Scene scene1, scene2, test;
    String url = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.deviantart.com%2Fchristian8717%2Fart%2FPacMan-Random-Game-Menu-Design-662844031&psig=AOvVaw24ohpsQ7XU3itnHE_-2Bvm&ust=1617354496075000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCPjpoqbZ3O8CFQAAAAAdAAAAABAD";

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("My First JavaFX GUI");
        primaryStage.setWidth(800);
        primaryStage.setHeight(600);

//Scene 1
        Label label1 = new Label("Menu Principale");

        Button button1= new Button("Play");
        button1.setOnAction(e -> primaryStage.setScene(scene2));
        VBox layout = new VBox();
        layout.getChildren().addAll(label1,button1);
        scene1 = new Scene(layout,500,550);


//Scene 2
        Label label2= new Label("This is the second scene");
        Button button2= new Button("Menu principale");
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