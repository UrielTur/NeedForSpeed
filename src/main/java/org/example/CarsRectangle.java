package org.example;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;

public class CarsRectangle {
    private Image carImage1;
    private Image carImage2;
    private Image carImage3;
    private Image carImage4;
    private Image carImage5;
    private Image carImage6;
    private int yOfCar1;
    private int yOfCar2;
    private int yOfCar3;
    private int yOfCar4;
    private int yOfCar5;
    private int yOfCar6;

    private final int xOfCar1 = 300;
    private final int xOfCar2 = 115;
    private final int xOfCar3 = 280;
    private final int xOfCar4 = 115;
    private final int xOfCar5 = 295;
    private final int xOfCar6 = 475;




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
        this.yOfCar4 = -(random4.nextInt(800, 4500));
        this.yOfCar5 = -(random5.nextInt(800, 4500));
        this.yOfCar6 = -(random6.nextInt(800, 4500));


        carImage1 = new ImageIcon("src/main/java/org/example/ImageIcon/BlueCar-removebg-min.png").getImage();
        carImage2 = new ImageIcon("src/main/java/org/example/ImageIcon/LightRedCar-removebg-min.png").getImage();
        carImage3 = new ImageIcon("src/main/java/org/example/ImageIcon/RedBus-removebg-min.png").getImage();
        carImage4 = new ImageIcon("src/main/java/org/example/ImageIcon/PurpleCar.png").getImage();
        carImage5 = new ImageIcon("src/main/java/org/example/ImageIcon/OpenCar.png").getImage();
        carImage6 = new ImageIcon("src/main/java/org/example/ImageIcon/RedBus-removebg-min.png").getImage();

    }
    public void paintCarRectangle1(Graphics graphics) {
        int newWidth = 110;
        int newHeight = 125;

        graphics.drawImage(carImage1, this.xOfCar1, this.yOfCar1,newWidth,newHeight,null);

    }

    public void paintCarRectangle2(Graphics graphics) {
        int newWidth = 110;
        int newHeight = 125;

        graphics.drawImage(carImage2, this.xOfCar2, this.yOfCar2,newWidth,newHeight,null);


    }

    public void paintCarRectangle3(Graphics graphics) {
        int newWidth = 160;
        int newHeight = 235;

        graphics.drawImage(carImage3, this.xOfCar3, this.yOfCar3,newWidth,newHeight,null);

    }

    public void paintCarRectangle4(Graphics graphics) {
        int newWidth = 100;
        int newHeight = 115;

        graphics.drawImage(carImage4, this.xOfCar4, this.yOfCar4,newWidth,newHeight,null);

    }

    public void paintCarRectangle5(Graphics graphics) {
        int newWidth = 125;
        int newHeight = 165;

        graphics.drawImage(carImage5, this.xOfCar5, this.yOfCar5,newWidth,newHeight,null);

    }

    public void paintCarRectangle6(Graphics graphics) {
        int newWidth = 160;
        int newHeight = 235;

        graphics.drawImage(carImage6, this.xOfCar6, this.yOfCar6,newWidth,newHeight,null);

    }

    public void runDown1() {
            this.yOfCar1 += 2;
            this.yOfCar2 += 1;
            this.yOfCar3 += 2;

    }

    public void runDown2(){
        this.yOfCar4 += 1;
        this.yOfCar5 += 2;
        this.yOfCar6 += 2;
    }

    public void stop1(){
        this.yOfCar1 -=3;
    }

    public void stop2(){
        this.yOfCar2 -=4;
    }

    public void stop4(){
        this.yOfCar5 -=3;
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
        return new Rectangle (this.xOfCar1, this.yOfCar1 , 105, 95);
    }

    public Rectangle catchTheCar2() {
        return new Rectangle (this.xOfCar2, this.yOfCar2 , 100, 90);
    }

    public Rectangle catchTheCar3() {
        return new Rectangle (this.xOfCar3 - 15, this.yOfCar3 , 135,  100);
    }
    public Rectangle catchTheCar4() {
        return new Rectangle (this.xOfCar4, this.yOfCar4 , 95, 85);
    }

    public Rectangle catchTheCar5() {
        return new Rectangle (this.xOfCar5, this.yOfCar5 , 100, 95);
    }

    public Rectangle catchTheCar6() {
        return new Rectangle (this.xOfCar6 - 15, this.yOfCar6 , 135,  100);
    }









}
