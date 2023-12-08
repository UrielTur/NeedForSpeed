package org.example;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class GameOverScreen extends JPanel{

    private final JLabel textOfWelcome;
    private static JButton closeOption;
    private AudioInputStream audioInputStream2;
    private Clip clip2;

    private final Color myColor =  new Color(190 , 0 , 0);



    public GameOverScreen() {
        setLayout(null);
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

    public void playAccident() {
        try {
            this.audioInputStream2 = AudioSystem.getAudioInputStream(new File("src/main/java/org/example/FilesOfWav/crashSound.wav").getAbsoluteFile());
            clip2 = AudioSystem.getClip();
            clip2.open(audioInputStream2);
        } catch(Exception ex){
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
        this.clip2.start();
    }
}
