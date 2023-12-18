package org.example;


import javax.swing.*;
import java.awt.*;


public class CarPlayer {

    private int x;
    private final int y;


    private static Image carImage = new ImageIcon("src/main/java/org/example/ImageIcon/CarGameStraight-min.png").getImage();





    private RoadSigns roadSigns = new RoadSigns(0 , 0 , 0);



    public CarPlayer(int x, int y){
        this.x = x;
        this.y = y;
    }


    public static void getColorCar(JButton jButton) {
        if (jButton.getBackground().equals(Color.red)) {

                carImage = new ImageIcon("src/main/java/org/example/ImageIcon/LightRedCar-removebg-min.png").getImage();

        } else if (jButton.getBackground().equals(Color.green)) {

                carImage = new ImageIcon("src/main/java/org/example/ImageIcon/CarGameStraight-min.png").getImage();

        } else if (jButton.getBackground().equals(Color.blue)) {
            carImage = new ImageIcon("src/main/java/org/example/ImageIcon/BlueCar-removebg-min.png").getImage();
        }


    }



    public void paintCar(Graphics graphics){

        int newWidth = 95;
        int newHeight = 125;

        graphics.drawImage(carImage, (short) this.x, (short) this.y,newWidth,newHeight,null);




    }


    public void move(long dx) {
        this.x += dx;
    }


    public Rectangle calculateRectangle() {
        return new Rectangle(this.x, this.y, 50 , 50);
    }


    public void stopRun() {
        if (this.x < roadSigns.getLeftRedWhite1().getWidth(null)) {
            this.x = roadSigns.getLeftRedWhite1().getWidth(null);
        }
        if (this.x > (Window.getWINDOW_WIDTH() - roadSigns.getRightRedWhite1().getWidth(null)) - 85) {
            this.x = Window.getWINDOW_WIDTH() - roadSigns.getRightRedWhite1().getWidth(null) -85;
        }
    }


    public int getX() {
        return x;
    }

    public int getCarImageWidth() {
        return carImage.getWidth(null);
    }



}
