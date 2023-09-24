package org.example;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.Random;

public class GameScene extends JPanel implements KeyListener {

    private final RoadSigns roadSigns1;
    private final RoadSigns roadSigns2;
    private final RoadSigns roadSigns3;
    private final RoadSigns roadSigns4;
    private final CarPlayer carPlayer;
    private final CarsRectangle carsRectangle;
    private final boolean[] pressedKey;
    private final Random random1;
    private final Random random2;
    private final Random random3;
    private final Random random4;
    private final Random random5;
    private final Random random6;
    private final GameOverScreen gameOverScreen;
    private int counter = 0;
    private AudioInputStream audioInputStream;
    private Clip clip;



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
        this.random4 = new Random();
        this.random5 = new Random();
        this.random6 = new Random();
        this.gameOverScreen = new GameOverScreen();
        this.gameOverScreen.setVisible(true);
        this.add(gameOverScreen);




        mainWindow.add(gameOverScreen);
        this.setDoubleBuffered(true);
        this.setFocusable(true);
        this.requestFocus();
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
        this.carsRectangle.paintCarRectangle4(graphics);
        this.carsRectangle.paintCarRectangle5(graphics);
        this.carsRectangle.paintCarRectangle6(graphics);


    }

    public synchronized void mainGameLoop() {
        new Thread(() -> {

            while (true) {

                repaint();
                if (this.counter <= 40) {
                    this.roadSigns1.runDown();
                    this.roadSigns2.runDown();
                    this.roadSigns3.runDown();
                    this.roadSigns4.runDown();
                } else {
                    this.roadSigns1.runDownDouble();
                    this.roadSigns2.runDownDouble();
                    this.roadSigns3.runDownDouble();
                    this.roadSigns4.runDownDouble();
                }


                this.carsRectangle.runDown1();
                if (this.counter >= 5) {
                    this.carsRectangle.runDown2();
                }

//                }else {
//                    this.carsRectangle.runDownFaster();
//
//                }

                updatePlayer();


                if (this.roadSigns1.getyOfBackground1() >= Window.getWINDOW_HEIGHT()){
                    this.roadSigns1.setyOfBackground1(-(Window.getWINDOW_HEIGHT() - 10));
                    this.counter++;
                }
                if (this.roadSigns1.getyOfBackground2() >= Window.getWINDOW_HEIGHT()){
                    this.roadSigns1.setyOfBackground2(-(Window.getWINDOW_HEIGHT() - 10));
                    this.counter++;
                }



                if (this.roadSigns1.getYOfLines()>=750){
                    this.roadSigns1.setYOfLines(-250);
                }
                if (this.roadSigns2.getYOfLines()>=750){
                    this.roadSigns2.setYOfLines(-250);
                }
                if (this.roadSigns3.getYOfLines()>=750){
                    this.roadSigns3.setYOfLines(-250);
                }
                if (this.roadSigns4.getYOfLines()>=750){
                    this.roadSigns4.setYOfLines(-250);
                }


                if (this.roadSigns1.getyOfRedWhite1() >= (Window.getWINDOW_HEIGHT())){
                    this.roadSigns1.setyOfRedWhite1(-(Window.getWINDOW_HEIGHT()));
                }
                if (this.roadSigns1.getyOfRedWhite2() >= Window.getWINDOW_HEIGHT()){
                    this.roadSigns1.setyOfRedWhite2(-(Window.getWINDOW_HEIGHT()));
                }


                if (this.carsRectangle.getyOfCar1()>=800){
                    this.carsRectangle.setYOfCar1(-(random1.nextInt(50 , 9000)));
                }
                if (this.carsRectangle.getyOfCar2()>=800){
                    this.carsRectangle.setYOfCar2(-(random2.nextInt(50 , 9000)));
                }
                if (this.carsRectangle.getyOfCar3()>=800){
                    this.carsRectangle.setyOfCar3(-(random3.nextInt(50, 9000)));
                }
                if (this.carsRectangle.getyOfCar4() >= 800) {
                    this.carsRectangle.setyOfCar4(-(random4.nextInt(1000, 9000)));
                }
                if (this.carsRectangle.getyOfCar5() >= 800) {
                    this.carsRectangle.setyOfCar5(-(random5.nextInt(1000, 9000)));
                }
                if (this.carsRectangle.getyOfCar6() >= 800) {
                    this.carsRectangle.setyOfCar6(-(random6.nextInt(1000, 9000)));
                }



                boolean hasCollision = collision(this.carsRectangle);
                if (hasCollision) {
                    this.gameOverScreen.setVisible(true);
                    this.gameOverScreen.setCloseOptionVisible();
                    setVisible(false);
                    break;
                }


                long dx = 0;
                try {
                    if (pressedKey[0]) {
                        dx += 1;
                    }

                    if (pressedKey[1]) {
                        dx -= 1;
                    }
                    this.carPlayer.move(dx);

                    if (this.counter <= 15) {
                        Thread.sleep(4);
                    } else if (this.counter > 15 && this.counter <= 45 ){
                        Thread.sleep(3);
                    } else if (this.counter >= 45
//                            && this.counter <=70
                    ) {
                        Thread.sleep(2);
                    }
//                    else if (this.counter > 70) {
//                        Thread.sleep(1);
//                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }

    public boolean collision(CarsRectangle carsRectangle) {
        boolean collision = false;
        if (carsRectangle.catchTheCar1().intersects(this.carPlayer.calculateRectangle()) || carsRectangle.catchTheCar2().intersects(this.carPlayer.calculateRectangle()) || carsRectangle.catchTheCar3().intersects(this.carPlayer.calculateRectangle()) || carsRectangle.catchTheCar4().intersects(this.carPlayer.calculateRectangle()) || carsRectangle.catchTheCar5().intersects(this.carPlayer.calculateRectangle()) || carsRectangle.catchTheCar6().intersects(this.carPlayer.calculateRectangle())) {
            collision = true;
            stopAudio();
        }

        return collision;
    }


    public void updatePlayer() {
        if (carPlayer.getX() < roadSigns1.getLeftRedWhite1().getIconWidth() || carPlayer.getX() > (roadSigns1.getRightRedWhite1().getIconWidth() - carPlayer.getCarImageWidth()) || carPlayer.getX() < roadSigns1.getLeftRedWhite2().getIconWidth() || carPlayer.getX() > (roadSigns1.getRightRedWhite1().getIconWidth() - carPlayer.getCarImageWidth())) {
            carPlayer.stopRun();
        }
    }



    public void playAudio() {
        try {
            this.audioInputStream = AudioSystem.getAudioInputStream(new File("C:\\Users\\USER\\IdeaProjects\\SportAPI\\src\\main\\java\\org\\example\\FilesOfWav\\CarAcceleration.wav").getAbsoluteFile());
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
        } catch(Exception ex){
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
            this.clip.start();
            this.clip.loop(Clip.LOOP_CONTINUOUSLY); // זה ישמע את הקליפ באופן תמידי

//        JOptionPane.showMessageDialog(null , "to close");
//        JOptionPane.showConfirmDialog(null, "to add");
    }

    public void stopAudio() {
        this.clip.close();
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


