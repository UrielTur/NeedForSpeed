package org.example;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class FirstWindowScreen extends JPanel {

    private final JLabel text1;
    private final JLabel text2;
    private static JButton buttonOfEnter;
    private final BufferedImage background;
    private final int xOfBackground = 0;
    private final int yOfBackground = 0;
    private OptionsScreen optionsScreen;
    private AudioInputStream audioInputStream1;
    private Clip clip1;
    private static AudioInputStream audioInputStream2;
    private static Clip clip2;



    public FirstWindowScreen(){
        this.setSize(Window.getWINDOW_WIDTH(), Window.getWINDOW_HEIGHT());
        setLayout(null);
        this.optionsScreen = new OptionsScreen();
        playBackgroundAudio();





        try {
            this.background = ImageIO.read(new File("C:\\Users\\USER\\IdeaProjects\\SportAPI\\src\\main\\java\\org\\example\\ImageIcon\\needforspeedbackground-min.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        this.text1 = new JLabel("Need For Speed");
        this.text1.setBounds(100, 100, 550, 65); // מגדיר מיקום וגודל לתווית
        this.text1.setFont(new Font("Arial" , Font.BOLD , 70));
        this.text1.setForeground(Color.white);
        add(this.text1);

        this.text2 = new JLabel("NEW GAME NEW CHALLENGE");
        this.text2.setBounds(150, 180, 550, 50); // מגדיר מיקום וגודל לתווית
        this.text2.setFont(new Font("Arial" , Font.BOLD , 30));
        this.text2.setForeground(Color.white);
        add(this.text2);


        buttonOfEnter = new JButton("Enter");
        buttonOfEnter.setBounds(280, 650, 150, 50); // מגדיר מיקום וגודל לכפתור
        buttonOfEnter.setFont(new Font("Arial" , Font.BOLD , 20));
        add(buttonOfEnter);


    }

    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        int newWidth = Window.getWINDOW_WIDTH();
        int newHeight = Window.getWINDOW_HEIGHT();
        Image scaledImage1 = background.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        graphics.drawImage(scaledImage1, this.xOfBackground, this.yOfBackground, null);

    }



    public static JButton getButtonOfEnter() {
        return buttonOfEnter;
    }

    public void playBackgroundAudio() {
        try {
            this.audioInputStream1 = AudioSystem.getAudioInputStream(new File("C:\\Users\\USER\\IdeaProjects\\SportAPI\\src\\main\\java\\org\\example\\FilesOfWav\\backgroundmusic-wav.wav").getAbsoluteFile());
            clip1 = AudioSystem.getClip();
            clip1.open(audioInputStream1);
        } catch(Exception ex){
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
        this.clip1.start();

//        JOptionPane.showMessageDialog(null , "to close");
//        JOptionPane.showConfirmDialog(null, "to add");
    }

    public void stopAudio() {
        this.clip1.close();
    }


    public static void playClickAudio() {
        try {
            audioInputStream2 = AudioSystem.getAudioInputStream(new File("C:\\Users\\USER\\IdeaProjects\\SportAPI\\src\\main\\java\\org\\example\\FilesOfWav\\clickSound.wav").getAbsoluteFile());
            clip2 = AudioSystem.getClip();
            clip2.open(audioInputStream2);
        } catch(Exception ex){
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
        clip2.start();

    }


}
