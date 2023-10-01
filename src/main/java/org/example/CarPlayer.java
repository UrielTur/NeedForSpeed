package org.example;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CarPlayer {

    private int x;
    private final int y;


    private static BufferedImage carImage;

    static {
        try {
            carImage = ImageIO.read(new File("src/main/java/org/example/ImageIcon/CarGameStraight-min.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    ;
    private RoadSigns roadSigns = new RoadSigns(0 , 0 , 0);



    public CarPlayer(int x, int y){
        this.x = x;
        this.y = y;
    }


    public static void getColorCar(JButton jButton) {
        if (jButton.getBackground().equals(Color.red)) {
            try {
                carImage = ImageIO.read(new File("src/main/java/org/example/ImageIcon/LightRedCar-removebg-min.png"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (jButton.getBackground().equals(Color.green)) {
            try {
                carImage = ImageIO.read(new File("src/main/java/org/example/ImageIcon/CarGameStraight-min.png"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (jButton.getBackground().equals(Color.blue)) {
            try {
                carImage = ImageIO.read(new File("src/main/java/org/example/ImageIcon/BlueCar-removebg-min.png"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }



    public void paintCar(Graphics graphics){
        try {
            int newWidth = 100;
            int newHeight = 125;

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


    public void stopRun() {
        if (this.x < roadSigns.getLeftRedWhite1().getIconWidth()) {
            this.x = roadSigns.getLeftRedWhite1().getIconWidth();
        }
        if (this.x > (Window.getWINDOW_WIDTH() - roadSigns.getRightRedWhite1().getIconWidth()) - 85) {
            this.x = Window.getWINDOW_WIDTH() - roadSigns.getRightRedWhite1().getIconWidth() -85;
        }
    }


    public int getX() {
        return x;
    }

    public int getCarImageWidth() {
        return carImage.getWidth();
    }



}
