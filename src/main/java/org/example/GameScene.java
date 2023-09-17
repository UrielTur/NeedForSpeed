package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameScene extends JPanel implements KeyListener {

    private RoadSigns roadSigns1;
    private RoadSigns roadSigns2;
    private RoadSigns roadSigns3;
    private RoadSigns roadSigns4;
    private CarPlayer carPlayer;
    private CarsRectangle carsRectangle;
    private boolean[] pressedKey;
    private Random random1;
    private Random random2;
    private Random random3;


    public GameScene(Window mainWindow) {

        this.setSize(Window.getWINDOW_WIDTH(), Window.getWINDOW_HEIGHT());
        setLayout(null);
        this.roadSigns1 = new RoadSigns(230, 480 ,10);
        this.roadSigns2 = new RoadSigns(230,480,this.roadSigns1.getYOfLines()-250);
        this.roadSigns3 = new RoadSigns(230,480,this.roadSigns2.getYOfLines()-250);
        this.roadSigns4 = new RoadSigns(230,480,this.roadSigns3.getYOfLines()-250);
        this.carPlayer = new CarPlayer(330, 520);
        this.carsRectangle = new CarsRectangle();
        this.pressedKey = new boolean[2];
        this.random1 = new Random();
        this.random2 = new Random();
        this.random3 = new Random();



        this.setDoubleBuffered(true);
        this.setFocusable(true);
        this.requestFocus();
        mainWindow.setVisible(true);
        mainGameLoop();
        this.addKeyListener(this);
    }

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        this.roadSigns1.paintBackground(graphics);
        this.roadSigns1.paintOfSigns(graphics);
        this.roadSigns2.paintOfSigns(graphics);
        this.roadSigns3.paintOfSigns(graphics);
        this.roadSigns4.paintOfSigns(graphics);
        this.carPlayer.paintCar(graphics);
        this.carsRectangle.paintCarRectangle1(graphics);
        this.carsRectangle.paintCarRectangle2(graphics);
        this.carsRectangle.paintCarRectangle3(graphics);




    }

    public void mainGameLoop() {
        new Thread(() -> {
            while (true) {
                repaint();
                this.roadSigns1.run();
                this.roadSigns2.run();
                this.roadSigns3.run();
                this.roadSigns4.run();
                this.carsRectangle.run();

                if (this.roadSigns1.getyOfBackground1() == Window.getWINDOW_HEIGHT()){
                    this.roadSigns1.setyOfBackground1(-(Window.getWINDOW_HEIGHT() - 10));
                }
                if (this.roadSigns1.getyOfBackground2() == Window.getWINDOW_HEIGHT()){
                    this.roadSigns1.setyOfBackground2(-(Window.getWINDOW_HEIGHT() - 10));
                }


                if (this.roadSigns1.getYOfLines()==750){
                    this.roadSigns1.setYOfLines(-250);
                }
                if (this.roadSigns2.getYOfLines()==750){
                    this.roadSigns2.setYOfLines(-250);
                }
                if (this.roadSigns3.getYOfLines()==750){
                    this.roadSigns3.setYOfLines(-250);
                }
                if (this.roadSigns4.getYOfLines()==750){
                    this.roadSigns4.setYOfLines(-250);
                }
                if (this.roadSigns1.getyOfRedWhite1() == (Window.getWINDOW_HEIGHT())){
                    this.roadSigns1.setyOfRedWhite1(-(Window.getWINDOW_HEIGHT()));
                }
                if (this.roadSigns1.getyOfRedWhite2() == Window.getWINDOW_HEIGHT()){
                    this.roadSigns1.setyOfRedWhite2(-(Window.getWINDOW_HEIGHT()));
                }


                if (this.carsRectangle.getyOfCar1()==800){
                    this.carsRectangle.setyOfCar1(-(random1.nextInt(100, 1000)));
                }
                if (this.carsRectangle.getyOfCar2()==800){
                    this.carsRectangle.setyOfCar2(-(random2.nextInt(250, 1000)));
                }
                if (this.carsRectangle.getyOfCar3()==800){
                    this.carsRectangle.setyOfCar3(-(random3.nextInt(150 , 1000)));
                }

                int dx = 0;
//                int dy = 0;
                try {
                    if (pressedKey[0]) {
                        dx += 1;
//                        dy -= 1;
                    }

                    if (pressedKey[1]) {
                        dx -= 1;
//                        dy -= 1;
                    }
                    this.carPlayer.move(dx);


                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }


    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            pressedKey[0] = true;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            pressedKey[1] = true;
        }
    }


    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            pressedKey[0] = false;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            pressedKey[1] = false;
        }

    }





}


