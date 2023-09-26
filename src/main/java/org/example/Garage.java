package org.example;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Garage extends JPanel {
    private JLabel title;
    private JLabel text;
    private static JButton backButton;
    private JButton redButton;
    private JButton greenButton;
    private JButton blueButton;
    private BufferedImage garageBackground;
    private final int xOfBackground = 0;
    private final int yOfBackground = 0;


    public Garage() {
        this.setSize(Window.getWINDOW_WIDTH(), Window.getWINDOW_HEIGHT());
        setLayout(null);

        try {
            this.garageBackground = ImageIO.read(new File("C:\\Users\\USER\\IdeaProjects\\SportAPI\\src\\main\\java\\org\\example\\ImageIcon\\carGarageBackground.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        this.title = new JLabel("Garage");
        this.title.setBounds(300, 10, 150, 100);
        this.title.setFont(new Font("Arial", Font.BOLD, 40));
        this.title.setForeground(Color.white);
        add(this.title);


        backButton = new JButton("Back");
        backButton.setBounds(10, 650, 100, 50);
        backButton.setFont(new Font("Arial", Font.BOLD, 20));
        add(backButton);


        this.text = new JLabel("Choose your car color:");
        this.text.setBounds(325, 470, 280, 100);
        this.text.setFont(new Font("Arial", Font.BOLD, 23));
        this.text.setForeground(Color.black);
        add(this.text);


        this.redButton = new JButton();
        this.redButton.setBounds(250, 550, 100, 100);
        this.redButton.setBackground(Color.RED);

        this.blueButton = new JButton();
        this.blueButton.setBounds(400, 550, 100, 100);
        this.blueButton.setBackground(Color.BLUE);

        this.greenButton = new JButton();
        this.greenButton.setBounds(550, 550, 100, 100);
        this.greenButton.setBackground(Color.GREEN);


        redButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                CarPlayer.getColorCar(redButton);
                FirstWindowScreen.playClickAudio();

            }
        });

        blueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CarPlayer.getColorCar(blueButton);
                FirstWindowScreen.playClickAudio();

            }
        });

        greenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CarPlayer.getColorCar(greenButton);
                FirstWindowScreen.playClickAudio();

            }
        });


        add(this.redButton);
        add(this.blueButton);
        add(this.greenButton);
    }


    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        int newWidth = Window.getWINDOW_WIDTH();
        int newHeight = Window.getWINDOW_HEIGHT();
        Image scaledImage1 = garageBackground.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        graphics.drawImage(scaledImage1, this.xOfBackground, this.yOfBackground, null);

    }

    public static JButton getBackButton() {
        return backButton;
    }
}