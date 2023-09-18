package org.example;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class CarPlayer {


    private int x;
    private final int y;


    public CarPlayer(int x, int y){
        this.x = x;
        this.y = y;
    }


    public void paintCar(Graphics graphics){

        try {
            BufferedImage carImage = ImageIO.read(new File("C:\\Users\\USER\\IdeaProjects\\SportAPI\\src\\main\\java\\org\\example\\ImageIcon\\CarGameStraight-min.png"));

            int newWidth = 80;
            int newHeight = 120;

            Image scaledImage = carImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);


            graphics.drawImage(scaledImage, this.x, this.y, null);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public void move(long dx) {
        this.x += dx;
    }


    public Rectangle calculateRectangle() {
        return new Rectangle(this.x, this.y, 50 , 50);
    }
}
