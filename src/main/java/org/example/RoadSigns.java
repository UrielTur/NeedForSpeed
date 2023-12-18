package org.example;

import javax.swing.*;
import java.awt.*;

public class RoadSigns {
    private final int xOfLine1;
    private final int xOfLine2;
    private int yOfLines;
    private final Image asphaltImage1 = new ImageIcon("src/main/java/org/example/ImageIcon/asphalt-road-min.png").getImage();
    private final Image asphaltImage2 = new ImageIcon("src/main/java/org/example/ImageIcon/asphalt-road-min.png").getImage();


    private final Image leftRedWhite1 = new ImageIcon("src/main/java/org/example/ImageIcon/WhiteRedSideWalk.png").getImage();
    private final Image leftRedWhite2 = new ImageIcon("src/main/java/org/example/ImageIcon/WhiteRedSideWalk.png").getImage();
    private final Image rightRedWhite1  = new ImageIcon("src/main/java/org/example/ImageIcon/WhiteRedSideWalk.png").getImage();
    private final Image rightRedWhite2 = new ImageIcon("src/main/java/org/example/ImageIcon/WhiteRedSideWalk.png").getImage();

    private int yOfRedWhite1 = 0;
    private int yOfRedWhite2 = this.yOfRedWhite1 - this.leftRedWhite1.getHeight(null);
    private final int xOfBackground = 0;
    private int yOfBackground1 = 0;
    private int yOfBackground2 = this.yOfBackground1 - this.asphaltImage1.getHeight(null);





    public RoadSigns( int x1, int x2, int y) {
        this.xOfLine1 = x1;
        this.xOfLine2 = x2;

        this.yOfLines = y;
    }


    public void runDown() {
        this.yOfLines += 3;
        this.yOfRedWhite1 += 3;
        this.yOfRedWhite2 += 3;
        this.yOfBackground1 += 3;
        this.yOfBackground2 += 3;
    }

    public void runDownDouble() {
        this.yOfLines += 3;
        this.yOfRedWhite1 += 3;
        this.yOfRedWhite2 += 3;
        this.yOfBackground1 += 3;
        this.yOfBackground2 += 3;
    }

    public void paintBackground(Graphics graphics) {
        graphics.drawImage(asphaltImage1, this.xOfBackground, this.yOfBackground1,null);
        graphics.drawImage(asphaltImage2, this.xOfBackground, this.yOfBackground2,null);

    }

    public void paintOfSigns(Graphics graphics) {
        graphics.setColor(Color.WHITE);
        graphics.fillRect(this.xOfLine1, this.yOfLines, 20, 170);
        graphics.fillRect(this.xOfLine2, this.yOfLines, 20, 170);

        graphics.drawImage(leftRedWhite1, this.xOfBackground, this.yOfRedWhite1,null);
        graphics.drawImage(leftRedWhite2, this.xOfBackground, this.yOfRedWhite2,null);
        graphics.drawImage(rightRedWhite1, Window.getWINDOW_WIDTH()- rightRedWhite1.getWidth(null)-15, this.yOfRedWhite1,null);
        graphics.drawImage(rightRedWhite2, Window.getWINDOW_WIDTH()- rightRedWhite1.getWidth(null)-15, this.yOfRedWhite2,null);


//        this.rightRedWhite1.paintIcon(null, graphics, Window.getWINDOW_WIDTH()- rightRedWhite1.getIconWidth()-15, this.yOfRedWhite1);
//        this.rightRedWhite2.paintIcon(null, graphics, Window.getWINDOW_WIDTH()- rightRedWhite1.getIconWidth()-15, this.yOfRedWhite2);
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

    public Image getLeftRedWhite1() {
        return leftRedWhite1;
    }

    public Image getLeftRedWhite2() {
        return leftRedWhite2;
    }

    public Image getRightRedWhite1() {
        return rightRedWhite1;
    }

    public Image getRightRedWhite2() {
        return rightRedWhite2;
    }
}
