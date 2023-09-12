package org.example;

import javax.swing.*;
import java.awt.*;

public class CarPlayer {
    private ImageIcon carPlayer;

    public void paintCar(Graphics graphics){
        this.carPlayer = new ImageIcon("C:\\Users\\USER\\IdeaProjects\\SportAPI\\src\\main\\java\\org\\example\\ImageIcon\\GreenCar.png");
        this.carPlayer.paintIcon(null,graphics,350 , 580);

    }
}
