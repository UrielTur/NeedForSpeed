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
    private BufferedImage carImage4;
    private BufferedImage carImage5;
    private BufferedImage carImage6;
    private int yOfCar1;
    private int yOfCar2;
    private int yOfCar3;
    private int yOfCar4;
    private int yOfCar5;
    private int yOfCar6;

    private final int xOfCar1 = 330;
    private final int xOfCar2 = 100;
    private final int xOfCar3 = 550;
    private final int xOfCar4 = 100;
    private final int xOfCar5 = 330;
    private final int xOfCar6 = 550;




    public CarsRectangle() {
        Random random1 = new Random();
        Random random2 = new Random();
        Random random3 = new Random();
        Random random4 = new Random();
        Random random5 = new Random();
        Random random6 = new Random();



        this.yOfCar1 = -(random1.nextInt(50 , 2000));
        this.yOfCar2 = -(random2.nextInt(50 , 2500));
        this.yOfCar3 = -(random3.nextInt(50, 2000));
        this.yOfCar4 = -(random4.nextInt(1500, 5000));
        this.yOfCar5 = -(random5.nextInt(1200, 5000));
        this.yOfCar6 = -(random6.nextInt(1800, 5000));


        try {
            carImage1 = ImageIO.read(new File("C:\\Users\\USER\\IdeaProjects\\SportAPI\\src\\main\\java\\org\\example\\ImageIcon\\BlueCar-removebg-min.png"));
            carImage2 = ImageIO.read(new File("C:\\Users\\USER\\IdeaProjects\\SportAPI\\src\\main\\java\\org\\example\\ImageIcon\\LightRedCar-removebg-min.png"));
            carImage3 = ImageIO.read(new File("C:\\Users\\USER\\IdeaProjects\\SportAPI\\src\\main\\java\\org\\example\\ImageIcon\\RedBus-removebg-min.png"));
            carImage4 = ImageIO.read(new File("C:\\Users\\USER\\IdeaProjects\\SportAPI\\src\\main\\java\\org\\example\\ImageIcon\\PurpleCar.png"));
            carImage5 = ImageIO.read(new File("C:\\Users\\USER\\IdeaProjects\\SportAPI\\src\\main\\java\\org\\example\\ImageIcon\\OpenCar.png"));
            carImage6 = ImageIO.read(new File("C:\\Users\\USER\\IdeaProjects\\SportAPI\\src\\main\\java\\org\\example\\ImageIcon\\BlueCar-removebg-min.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void paintCarRectangle1(Graphics graphics) {
        int newWidth = 100;
        int newHeight = 125;
        Image scaledImage1 = carImage1.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        graphics.drawImage(scaledImage1, this.xOfCar1, this.yOfCar1, null);
    }

    public void paintCarRectangle2(Graphics graphics) {
        int newWidth = 100;
        int newHeight = 125;
        Image scaledImage2 = carImage2.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        graphics.drawImage(scaledImage2, this.xOfCar2, this.yOfCar2, null);

    }

    public void paintCarRectangle3(Graphics graphics) {
        int newWidth = 110;
        int newHeight = 200;
        Image scaledImage3 = carImage3.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        graphics.drawImage(scaledImage3, this.xOfCar3, this.yOfCar3, null);
    }

    public void paintCarRectangle4(Graphics graphics) {
        int newWidth = 90;
        int newHeight = 115;
        Image scaledImage4 = carImage4.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        graphics.drawImage(scaledImage4, this.xOfCar4, this.yOfCar4, null);
    }

    public void paintCarRectangle5(Graphics graphics) {
        int newWidth = 110;
        int newHeight = 165;
        Image scaledImage5 = carImage5.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        graphics.drawImage(scaledImage5, this.xOfCar5, this.yOfCar5, null);
    }

    public void paintCarRectangle6(Graphics graphics) {
        int newWidth = 100;
        int newHeight = 125;
        Image scaledImage6 = carImage6.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        graphics.drawImage(scaledImage6, this.xOfCar6, this.yOfCar6, null);
    }

    public void runDown1() {
        this.yOfCar1 += 2;
        this.yOfCar2 += 2;
        this.yOfCar3 += 2;

    }

    public void runDown2(){
        this.yOfCar4 += 2;
        this.yOfCar5 += 2;
        this.yOfCar6 += 2;
    }

//    public void runDownFaster() {
//
//        this.yOfCar1 += 3;
//        this.yOfCar2 += 3;
//        this.yOfCar3 += 3;
//        this.yOfCar4 += 3;
//        this.yOfCar5 += 3;
//        this.yOfCar6 += 3;
//
//    }

    public void setYOfCar1(int yOfCar1) {
        this.yOfCar1 = yOfCar1;
    }

    public void setYOfCar2(int yOfCar2) {
        this.yOfCar2 = yOfCar2;
    }

    public void setyOfCar3(int yOfCar3) {
        this.yOfCar3 = yOfCar3;
    }
    public void setyOfCar4(int yOfCar4) {
        this.yOfCar4 = yOfCar4;
    }

    public void setyOfCar5(int yOfCar5) {
        this.yOfCar5 = yOfCar5;
    }

    public void setyOfCar6(int yOfCar6) {
        this.yOfCar6 = yOfCar6;
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
    public int getyOfCar4() {
        return yOfCar4;
    }

    public int getyOfCar5() {
        return yOfCar5;
    }

    public int getyOfCar6() {
        return yOfCar6;
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
    public Rectangle catchTheCar4() {
        return new Rectangle (this.xOfCar4, this.yOfCar4 , 50, 50);
    }

    public Rectangle catchTheCar5() {
        return new Rectangle (this.xOfCar5, this.yOfCar5 , 50, 50);
    }

    public Rectangle catchTheCar6() {
        return new Rectangle (this.xOfCar6, this.yOfCar6 , 50,  50);
    }
}
