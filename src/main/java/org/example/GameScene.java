package org.example;

import javax.swing.*;
import java.awt.*;

public class GameScene extends JPanel {

//    private final int totalLanes = 3;
//    private RoadSigns[] roadSignsArr;
    private RoadSigns roadSigns1;
    private RoadSigns roadSigns2;
    private RoadSigns roadSigns3;
    private RoadSigns roadSigns4;
    private CarPlayer carPlayer;


    public GameScene(Window mainWindow) {// ממחלקה של GAMESCENE

        this.setSize(Window.getWINDOW_WIDTH(), Window.getWINDOW_HEIGHT());
        setLayout(null);
        this.roadSigns1 = new RoadSigns(230, 480 ,10);
        this.roadSigns2 = new RoadSigns(230,480,this.roadSigns1.getYOfLines()-250);
        this.roadSigns3 = new RoadSigns(230,480,this.roadSigns2.getYOfLines()-250);
        this.roadSigns4 = new RoadSigns(230,480,this.roadSigns3.getYOfLines()-250);
        this.carPlayer = new CarPlayer();

        this.setDoubleBuffered(true);
        this.setFocusable(true);
        this.requestFocus();
        mainWindow.setVisible(true);
        mainGameLoop();
    }

    public void paintComponent(Graphics graphics) { //ממחלקה של GAMESCENE
        super.paintComponent(graphics);
        this.roadSigns1.paintBackground(graphics);
        this.roadSigns1.paintOfSigns(graphics);
        this.roadSigns2.paintOfSigns(graphics);
        this.roadSigns3.paintOfSigns(graphics);
        this.roadSigns4.paintOfSigns(graphics);
        this.carPlayer.paintCar(graphics);

    }

    public void mainGameLoop() {//ממחלקה של GAMESCEN
        new Thread(() -> {
            while (true) {
                repaint();
                this.roadSigns1.run();
                this.roadSigns2.run();
                this.roadSigns3.run();
                this.roadSigns4.run();
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
                try {
                    Thread.sleep(4);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }

}


