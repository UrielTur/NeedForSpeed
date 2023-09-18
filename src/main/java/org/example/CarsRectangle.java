package org.example;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;

public class CarsRectangle {
    private BufferedImage carImage1;
    private BufferedImage carImage2;
    private BufferedImage carImage3;
    private int yOfCar1;
    private int yOfCar2;
    private int yOfCar3;

    private final int xOfCar1 = 330;
    private final int xOfCar2 = 100;
    private final int xOfCar3 = 550;



    public CarsRectangle() {
        Random random1 = new Random();
        Random random2 = new Random();
        Random random3 = new Random();

        this.yOfCar1 = -(random1.nextInt(50 , 1500));
        this.yOfCar2 = -(random2.nextInt(50 , 1200));
        this.yOfCar3 = -(random3.nextInt(50, 1800));


        try {
            carImage1 = ImageIO.read(new File("C:\\Users\\USER\\IdeaProjects\\SportAPI\\src\\main\\java\\org\\example\\ImageIcon\\BlueCar-removebg-min.png"));
            carImage2 = ImageIO.read(new File("C:\\Users\\USER\\IdeaProjects\\SportAPI\\src\\main\\java\\org\\example\\ImageIcon\\LightRedCar-removebg-min.png"));
            carImage3 = ImageIO.read(new File("C:\\Users\\USER\\IdeaProjects\\SportAPI\\src\\main\\java\\org\\example\\ImageIcon\\RedBus-removebg-min.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void paintCarRectangle1(Graphics graphics) {
        int newWidth = 80;
        int newHeight = 120;
        Image scaledImage1 = carImage1.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        graphics.drawImage(scaledImage1, this.xOfCar1, this.yOfCar1, null);
    }

    public void paintCarRectangle2(Graphics graphics) {
        int newWidth = 80;
        int newHeight = 120;
        Image scaledImage2 = carImage2.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        graphics.drawImage(scaledImage2, this.xOfCar2, this.yOfCar2, null);
    }

    public void paintCarRectangle3(Graphics graphics) {
        int newWidth = 100;
        int newHeight = 190;
        Image scaledImage3 = carImage3.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        graphics.drawImage(scaledImage3, this.xOfCar3, this.yOfCar3, null);
    }

    public void run(){
        Random random1 = new Random();
        Random random2 = new Random();
        Random random3 = new Random();

        this.yOfCar1 += (random1.nextInt(2 , 3));
        this.yOfCar2 += (random2.nextInt(2 , 3));
        this.yOfCar3 += (random3.nextInt(2 , 3));
    }

    public void setyOfCar1(int yOfCar1) {
        this.yOfCar1 = yOfCar1;
    }

    public void setyOfCar2(int yOfCar2) {
        this.yOfCar2 = yOfCar2;
    }

    public void setyOfCar3(int yOfCar3) {
        this.yOfCar3 = yOfCar3;
    }


    public int getyOfCar1() {
        return yOfCar1;
    }

    public int getyOfCar2() {
        return yOfCar2;
    }

    public int getyOfCar3() {
        return yOfCar3;
    }

    public Rectangle catchTheCar1() {
        return new Rectangle (this.xOfCar1, this.yOfCar1 , 50, 50);
    }

    public Rectangle catchTheCar2() {
        return new Rectangle (this.xOfCar2, this.yOfCar2 , 50, 50);
    }

    public Rectangle catchTheCar3() {
        return new Rectangle (this.xOfCar3, this.yOfCar3 , 50,  50);
    }
}
