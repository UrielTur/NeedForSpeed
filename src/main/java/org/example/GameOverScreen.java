package org.example;

import javax.swing.*;
import java.awt.*;

public class GameOverScreen extends JPanel{

    private final JLabel textOfWelcome;
    private static JButton closeOption;

    private final Color myColor =  new Color(190 , 0 , 0);



    public GameOverScreen() {
        setLayout(null); // מבטל את הפרישה האוטומטית של מיקום הרכיבים בפאנל
        setPreferredSize(new Dimension(Window.getWINDOW_WIDTH(), Window.getWINDOW_HEIGHT())); // מגדיר גודל רצוי לפאנל
        this.setBackground(myColor);


        // הוספת הרכיבים לפאנל
        textOfWelcome = new JLabel("Game Over!!!");
        textOfWelcome.setBounds(170, 200, 550, 50); // מגדיר מיקום וגודל לתווית
        textOfWelcome.setFont(new Font("Arial" , Font.BOLD , 65));
        textOfWelcome.setForeground(Color.WHITE);
        add(textOfWelcome);

        closeOption = new JButton("Close");
        closeOption.setBounds(200, 400, 300, 40); // מגדיר מיקום וגודל לכפתור
        closeOption.setFont(new Font("Arial" , Font.BOLD , 20));
        add(closeOption);
        closeOption.setVisible(false);

    }

    public static JButton getCloseOption() {
        return closeOption;
    }


    public void setCloseOptionVisible() {
        closeOption.setVisible(true);
    }
}
