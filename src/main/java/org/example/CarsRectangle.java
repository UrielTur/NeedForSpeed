package org.example;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class CarsRectangle {
    private BufferedImage carImage1;
    private BufferedImage carImage2;
    private BufferedImage carImage3;

    public CarsRectangle() {
        try {
            carImage1 = ImageIO.read(new File("C:\\Users\\USER\\IdeaProjects\\SportAPI\\src\\main\\java\\org\\example\\ImageIcon\\BlueCar-removebg-min.png"));
            carImage2 = ImageIO.read(new File("C:\\Users\\USER\\IdeaProjects\\SportAPI\\src\\main\\java\\org\\example\\ImageIcon\\LightRedCar-removebg-min.png"));
            carImage3 = ImageIO.read(new File("C:\\Users\\USER\\IdeaProjects\\SportAPI\\src\\main\\java\\org\\example\\ImageIcon\\RedBus-removebg-min.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void paintCarRectangle1(Graphics graphics) {
        int newWidth = 80;
        int newHeight = 120;
        Image scaledImage1 = carImage1.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        graphics.drawImage(scaledImage1, 100, 70, null);
    }

    public void paintCarRectangle2(Graphics graphics) {
        int newWidth = 80;
        int newHeight = 120;
        Image scaledImage2 = carImage2.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        graphics.drawImage(scaledImage2, 550, 150, null);
    }

    public void paintCarRectangle3(Graphics graphics) {
        int newWidth = 100;
        int newHeight = 190;
        Image scaledImage3 = carImage3.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        graphics.drawImage(scaledImage3, 330, 100, null);
    }
}
