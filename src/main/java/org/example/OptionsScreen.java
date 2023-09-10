package org.example;
import javax.swing.*;
import java.awt.*;


public class OptionsScreen extends JPanel {

    private static JButton gameScene;
    private static JButton Instructions;




    public OptionsScreen(){

        this.setSize(Window.getWINDOW_WIDTH(), Window.getWINDOW_HEIGHT());
        setLayout(null);
        this.setBackground(Color.green);


        gameScene = new JButton("Start Play");
        gameScene.setBounds(220, 150, 300, 80); // מגדיר מיקום וגודל לכפתור
        gameScene.setFont(new Font("Arial" , Font.BOLD , 25));
        add(gameScene);

        Instructions = new JButton("Instructions");
        Instructions.setBounds(220, 350, 300, 80); // מגדיר מיקום וגודל לכפתור
        Instructions.setFont(new Font("Arial" , Font.BOLD , 25));
        add(Instructions);





    }


    public static JButton getGameScene() {
        return gameScene;
    }

    public static JButton getInstructions() {
        return Instructions;
    }


}
