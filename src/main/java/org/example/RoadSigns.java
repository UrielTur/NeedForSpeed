package org.example;

import javax.swing.*;
import java.awt.*;

public class RoadSigns {
    private final int xOfBackground = 0;
    private final int yOfBackground = 0;
    private final int xOfLine1;
    private final int xOfLine2;
    private int yOfLines;
    private ImageIcon leftRedWhite1 = new ImageIcon("C:\\Users\\USER\\IdeaProjects\\SportAPI\\src\\main\\java\\org\\example\\ImageIcon\\WhiteRedSideWalk.png");

    private ImageIcon leftRedWhite2 = new ImageIcon("C:\\Users\\USER\\IdeaProjects\\SportAPI\\src\\main\\java\\org\\example\\ImageIcon\\WhiteRedSideWalk.png");
    private ImageIcon rightRedWhite1  = new ImageIcon("C:\\Users\\USER\\IdeaProjects\\SportAPI\\src\\main\\java\\org\\example\\ImageIcon\\WhiteRedSideWalk.png");
    private ImageIcon rightRedWhite2 = new ImageIcon("C:\\Users\\USER\\IdeaProjects\\SportAPI\\src\\main\\java\\org\\example\\ImageIcon\\WhiteRedSideWalk.png");
    private int yOfRedWhite1 = 0;
    private int yOfRedWhite2 = this.yOfRedWhite1 - this.leftRedWhite1.getIconHeight();






    public RoadSigns( int x1, int x2, int y) {//ממחלקה ROADSIGNS
        this.xOfLine1 = x1;
        this.xOfLine2 = x2;
        this.yOfLines = y;
    }

    public void run() {
        this.yOfLines += 2;
        this.yOfRedWhite1 += 2;
        this.yOfRedWhite2 +=2;

    }

    public void paintBackground(Graphics graphics) {
        ImageIcon asphaltImage = new ImageIcon("C:\\Users\\USER\\IdeaProjects\\SportAPI\\src\\main\\java\\org\\example\\ImageIcon\\asphalt-road123.png");
        asphaltImage.paintIcon(null, graphics, this.xOfBackground, this.yOfBackground);

    }

    public void paintOfSigns(Graphics graphics) {
        graphics.setColor(Color.WHITE);
        graphics.fillRect(this.xOfLine1, this.yOfLines, 20, 170);
        graphics.fillRect(this.xOfLine2, this.yOfLines, 20, 170);


        this.leftRedWhite1.paintIcon(null, graphics, this.xOfBackground, this.yOfRedWhite1);
        this.leftRedWhite2.paintIcon(null, graphics, this.xOfBackground, this.yOfRedWhite2);
        this.rightRedWhite1.paintIcon(null, graphics, Window.getWINDOW_WIDTH()- rightRedWhite1.getIconWidth()-15, this.yOfRedWhite1);
        this.rightRedWhite2.paintIcon(null, graphics, Window.getWINDOW_WIDTH()- rightRedWhite1.getIconWidth()-15, this.yOfRedWhite2);
    }

    public int getYOfLines() {
        return yOfLines;
    }

    public void setYOfLines(int yOfLines) {//ממחלקה ROADSIGN
        this.yOfLines = yOfLines;
    }


    public int getyOfRedWhite1() {
        return yOfRedWhite1;
    }

    public void setyOfRedWhite1(int yOfRedWhite1) {
        this.yOfRedWhite1 = yOfRedWhite1;
    }

    public int getyOfRedWhite2() {
        return yOfRedWhite2;
    }

    public void setyOfRedWhite2(int yOfRedWhite2) {
        this.yOfRedWhite2 = yOfRedWhite2;
    }
}
