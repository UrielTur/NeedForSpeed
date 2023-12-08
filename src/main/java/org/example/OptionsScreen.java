package org.example;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class OptionsScreen extends JPanel {

    private static JButton gameScene;
    private static JButton instructions;
    private static JButton garage;
    private final JButton exitFromGame;
    private final BufferedImage background;
    private final int xOfBackground = 0;
    private final int yOfBackground = 0;




    public OptionsScreen(){

        this.setSize(Window.getWINDOW_WIDTH(), Window.getWINDOW_HEIGHT());
        setLayout(null);


        try {
            this.background = ImageIO.read(new File("src/main/java/org/example/ImageIcon/optionScreen-min.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        gameScene = new JButton("Start Play");
        gameScene.setBounds(10, 600, 150, 50); // מגדיר מיקום וגודל לכפתור
        gameScene.setFont(new Font("Arial" , Font.BOLD , 25));
        gameScene.setBackground(Color.lightGray);
        add(gameScene);

        garage = new JButton("Garage");
        garage.setBounds(190, 600, 150, 50); // מגדיר מיקום וגודל לכפתור
        garage.setFont(new Font("Arial" , Font.BOLD , 25));
        garage.setBackground(Color.lightGray);
        add(garage);

        instructions = new JButton("Instructions");
        instructions.setBounds(375, 600, 180, 50); // מגדיר מיקום וגודל לכפתור
        instructions.setFont(new Font("Arial" , Font.BOLD , 25));
        instructions.setBackground(Color.lightGray);
        add(instructions);

        exitFromGame = new JButton("Exit");
        exitFromGame.setBounds(580, 600, 150, 50); // מגדיר מיקום וגודל לכפתור
        exitFromGame.setFont(new Font("Arial" , Font.BOLD , 25));
        exitFromGame.setBackground(Color.lightGray);
        exitFromGame.addActionListener(e -> {
            System.exit(0);
        });
        add(exitFromGame);

    }

    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        int newWidth = Window.getWINDOW_WIDTH();
        int newHeight = Window.getWINDOW_HEIGHT();
        Image scaledImage1 = background.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        graphics.drawImage(scaledImage1, this.xOfBackground, this.yOfBackground, null);

    }


    public static JButton getGameScene() {
        return gameScene;
    }

//    public static void checkButton() {
//        if (gameScene.getModel().isPressed()){
//
//        }
//
//    }

    public static JButton getInstructions() {
        return instructions;
    }

    public static JButton getGarage() {
        return garage;
    }
}
