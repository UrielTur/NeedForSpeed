package org.example;

import javax.swing.*;
import java.awt.*;

public class RoadSigns {
    private final int xOfLine1;
    private final int xOfLine2;
    private int yOfLines;
    private ImageIcon asphaltImage1 = new ImageIcon("C:\\Users\\USER\\IdeaProjects\\SportAPI\\src\\main\\java\\org\\example\\ImageIcon\\asphalt-road123.png");
    private ImageIcon asphaltImage2 = new ImageIcon("C:\\Users\\USER\\IdeaProjects\\SportAPI\\src\\main\\java\\org\\example\\ImageIcon\\asphalt-road123.png");


    private ImageIcon leftRedWhite1 = new ImageIcon("C:\\Users\\USER\\IdeaProjects\\SportAPI\\src\\main\\java\\org\\example\\ImageIcon\\WhiteRedSideWalk.png");
    private ImageIcon leftRedWhite2 = new ImageIcon("C:\\Users\\USER\\IdeaProjects\\SportAPI\\src\\main\\java\\org\\example\\ImageIcon\\WhiteRedSideWalk.png");
    private ImageIcon rightRedWhite1  = new ImageIcon("C:\\Users\\USER\\IdeaProjects\\SportAPI\\src\\main\\java\\org\\example\\ImageIcon\\WhiteRedSideWalk.png");
    private ImageIcon rightRedWhite2 = new ImageIcon("C:\\Users\\USER\\IdeaProjects\\SportAPI\\src\\main\\java\\org\\example\\ImageIcon\\WhiteRedSideWalk.png");
    private int yOfRedWhite1 = 0;
    private int yOfRedWhite2 = this.yOfRedWhite1 - this.leftRedWhite1.getIconHeight();
    private final int xOfBackground = 0;
    private int yOfBackground1 = 0;
    private int yOfBackground2 = this.yOfBackground1 - this.asphaltImage1.getIconHeight();







    public RoadSigns( int x1, int x2, int y) {//ממחלקה ROADSIGNS
        this.xOfLine1 = x1;
        this.xOfLine2 = x2;
        this.yOfLines = y;
    }

    public void run() {
        this.yOfLines += 2;
        this.yOfRedWhite1 += 2;
        this.yOfRedWhite2 += 2;
        this.yOfBackground1 += 2;
        this.yOfBackground2 += 2;

    }

    public void paintBackground(Graphics graphics) {
        this.asphaltImage1.paintIcon(null, graphics, this.xOfBackground, this.yOfBackground1);
        this.asphaltImage2.paintIcon(null, graphics, this.xOfBackground, this.yOfBackground2);

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

    public void setYOfLines(int yOfLines) {
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

    public int getyOfBackground1() {
        return yOfBackground1;
    }

    public void setyOfBackground1(int yOfBackground1) {
        this.yOfBackground1 = yOfBackground1;
    }

    public int getyOfBackground2() {
        return yOfBackground2;
    }

    public void setyOfBackground2(int yOfBackground2) {
        this.yOfBackground2 = yOfBackground2;
    }
}