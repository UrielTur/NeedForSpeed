package org.example;
import javax.swing.*;
import java.awt.*;


public class InstructionsScreen extends JPanel {
    private JLabel title;

    private static JButton backButton;



    public InstructionsScreen(){
        this.setSize(Window.getWINDOW_WIDTH(), Window.getWINDOW_HEIGHT());
        setLayout(null);
        this.setBackground(Color.blue);

        this.title = new JLabel("Instructions");
        this.title.setBounds(280, 5, 900, 100); // מגדיר מיקום וגודל לתווית
        this.title.setFont(new Font("Arial" , Font.BOLD , 30));
        add(this.title);

        backButton = new JButton("Back");
        backButton.setBounds(10, 650, 100, 50); // מגדיר מיקום וגודל לכפתור
        backButton.setFont(new Font("Arial" , Font.BOLD , 20));
        add(backButton);


    }

    public static JButton getBackButton() {
        return backButton;
    }


}
