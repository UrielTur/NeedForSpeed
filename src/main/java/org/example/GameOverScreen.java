package org.example;

import javax.swing.*;
import java.awt.*;

public class GameOverScreen extends JPanel{

    private final JLabel textOfWelcome;

    private final Color myColor =  new Color(199 , 58 , 82);





    public GameOverScreen() {
        setLayout(null); // מבטל את הפרישה האוטומטית של מיקום הרכיבים בפאנל
        setPreferredSize(new Dimension(Window.getWINDOW_WIDTH(), Window.getWINDOW_HEIGHT())); // מגדיר גודל רצוי לפאנל
        this.setBackground(myColor);


        // הוספת הרכיבים לפאנל
        textOfWelcome = new JLabel("Game Over");
        textOfWelcome.setBounds(225, 250, 550, 50); // מגדיר מיקום וגודל לתווית
        textOfWelcome.setFont(new Font("Arial" , Font.BOLD , 45));
        add(textOfWelcome);

    }


}
