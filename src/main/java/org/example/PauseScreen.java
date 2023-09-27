package org.example;

import javax.swing.*;
import java.awt.*;

public class PauseScreen extends JPanel {


    private static JButton continueGame;
    private static JButton exitGame;




    public PauseScreen(){
        this.setSize(Window.getWINDOW_WIDTH(), Window.getWINDOW_HEIGHT());
        setLayout(null);
        this.setBackground(Color.blue);






        continueGame = new JButton("Continue");
        continueGame.setBounds(400, 100, 60, 20); // מגדיר מיקום וגודל לכפתור
        continueGame.setFont(new Font("Arial" , Font.BOLD , 15));
        continueGame.addActionListener(e -> {

        });
        add(continueGame);
//        this.continueGame.setVisible(false);



        exitGame = new JButton("exit");
        exitGame.setBounds(250, 100, 60, 20); // מגדיר מיקום וגודל לכפתור
        exitGame.setFont(new Font("Arial" , Font.BOLD , 15));
        exitGame.addActionListener(e -> {

        });
        add(exitGame);
//        this.exitGame.setVisible(false);




    }



    public static JButton getContinueGame() {
        return continueGame;
    }

    public static JButton getExitGame() {
        return exitGame;
    }
}
