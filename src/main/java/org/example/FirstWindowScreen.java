package org.example;
import javax.swing.*;
import java.awt.*;


public class FirstWindowScreen extends JPanel {

    private final JLabel text1;
    private final JLabel text2;
    private static JButton buttonOfEnter;



    public FirstWindowScreen(){
        this.setSize(Window.getWINDOW_WIDTH(), Window.getWINDOW_HEIGHT());
        this.setBackground(Color.red);
        setLayout(null);
        this.setFocusable(true);



        this.text1 = new JLabel("Need For Speed");
        this.text1.setBounds(170, 100, 550, 50); // מגדיר מיקום וגודל לתווית
        this.text1.setFont(new Font("Arial" , Font.BOLD , 50));
        add(this.text1);

        this.text2 = new JLabel("NEW GAME NEW CHALLENGE");
        this.text2.setBounds(140, 180, 550, 50); // מגדיר מיקום וגודל לתווית
        this.text2.setFont(new Font("Arial" , Font.BOLD , 30));
        add(this.text2);


        buttonOfEnter = new JButton("Enter");
        buttonOfEnter.setBounds(280, 450, 150, 50); // מגדיר מיקום וגודל לכפתור
        buttonOfEnter.setFont(new Font("Arial" , Font.BOLD , 20));
        add(buttonOfEnter);


    }

    public static JButton getButtonOfEnter() {
        return buttonOfEnter;
    }
}
