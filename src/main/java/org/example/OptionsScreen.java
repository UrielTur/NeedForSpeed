package org.example;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class OptionsScreen extends JPanel {

    private static JButton gameScene;
    private static JButton Instructions;
    private final BufferedImage background;
    private final int xOfBackground = 0;
    private final int yOfBackground = 0;




    public OptionsScreen(){

        this.setSize(Window.getWINDOW_WIDTH(), Window.getWINDOW_HEIGHT());
        setLayout(null);


        try {
            this.background = ImageIO.read(new File("C:\\Users\\USER\\IdeaProjects\\SportAPI\\src\\main\\java\\org\\example\\ImageIcon\\optionScreen-min.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        gameScene = new JButton("Start Play");
        gameScene.setBounds(50, 600, 200, 60); // מגדיר מיקום וגודל לכפתור
        gameScene.setFont(new Font("Arial" , Font.BOLD , 25));
        add(gameScene);

        Instructions = new JButton("Instructions");
        Instructions.setBounds(300, 600, 200, 60); // מגדיר מיקום וגודל לכפתור
        Instructions.setFont(new Font("Arial" , Font.BOLD , 25));
        add(Instructions);

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

    public static JButton getInstructions() {
        return Instructions;
    }


}
