package org.example;

import javax.swing.*;
import java.awt.*;
public class GameScene extends JPanel {

    private final int totalLanes = 3;
    private RoadSigns[] roadSignsArr;
    private RoadSigns roadSigns;


    public GameScene(Window mainWindow) {

        this.setSize(Window.getWINDOW_WIDTH(), Window.getWINDOW_HEIGHT());
        setLayout(null);

        this.roadSigns = new RoadSigns();

        this.roadSignsArr = new RoadSigns[totalLanes];
        for (int i = 0; i < roadSignsArr.length; i++) {
            this.roadSignsArr[i] = new RoadSigns();

        }

        this.setDoubleBuffered(true);
        this.setFocusable(true);
        this.requestFocus();

        mainWindow.setVisible(true);
        mainGameLoop();

    }

    public void paintComponent(Graphics graphics) {

        super.paintComponent(graphics);
        this.roadSigns.paintBackground(graphics);

        for (int i = 0; i < this.roadSignsArr.length; i++) {
            this.roadSignsArr[i].paintOfSigns(graphics);
        }


    }

    public void mainGameLoop() {

        new Thread(() -> {


            while (true) {



                for (int i = 0; i < roadSignsArr.length; i++) {
                    this.roadSignsArr[i].run();


                }
                repaint();



                try {
                    Thread.sleep(15);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }

        }).start();

    }

    public void updateLens(){
        for (int i = 0; i < roadSignsArr.length; i++) {
            this.roadSignsArr[i].run();

        }

    }

}


