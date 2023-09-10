package org.example;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class RoadSigns {
    private final int xOfBackground = 0;
    private final int yOfBackground = 0;
    private final int xOfLine1;
    private final int xOfLine2;
    private int yOfLines;

    public RoadSigns() {
        this.xOfLine1 = 230;
        this.xOfLine2 = 480;
        this.yOfLines = 10;



    }

    public void run() {
        this.yOfLines += 2;
    }

    public void paintBackground(Graphics graphics) {
        ImageIcon backgroundImage = new ImageIcon("C:\\Users\\USER\\IdeaProjects\\SportAPI\\src\\main\\java\\org\\example\\ImageIcon\\Road.png");
        backgroundImage.paintIcon(null, graphics, this.xOfBackground, this.yOfBackground);
    }

    public void paintOfSigns(Graphics graphics) {
        graphics.setColor(Color.WHITE);
        graphics.fillRect(this.xOfLine1, this.yOfLines, 20, 150);
        graphics.fillRect(this.xOfLine2, this.yOfLines, 20, 150);
    }

    public int getYOfLines() {
        return yOfLines;
    }

}
