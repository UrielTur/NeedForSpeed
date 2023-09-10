package org.example;

import javax.swing.*;
import java.awt.*;

public class TomorrowGames extends JPanel {
    private JLabel title;

    private static JButton backButton;



    public TomorrowGames(){
        this.setSize(Window.getWINDOW_WIDTH(), Window.getWINDOW_HEIGHT());
        setLayout(null);
        this.setBackground(Color.pink);

        this.title = new JLabel("Games Tomorrow");
        this.title.setBounds(350, 10, 900, 100); // מגדיר מיקום וגודל לתווית
        this.title.setFont(new Font("Arial" , Font.BOLD , 30));
        add(this.title);

        backButton = new JButton("Back");
        backButton.setBounds(10, 600, 100, 50); // מגדיר מיקום וגודל לכפתור
        backButton.setFont(new Font("Arial" , Font.BOLD , 20));
        add(backButton);


    }

    public static JButton getBackButton() {
        return backButton;
    }


}
