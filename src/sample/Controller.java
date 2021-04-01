package sample;

import javafx.fxml.FXML;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.text.html.ImageView;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;



public class Controller {


    @FXML
    ImageView MyImageView;
    Button MyButton;
    Image MyImage = new Image("../../fichiersEternes/menuPacman.png").getImage();

    public void displayImage(){
        MyImageView ;

    }
}
