package org.example;
import javax.swing.*;



public class Window extends JFrame {

    private static final int WINDOW_WIDTH = 750;
    private static final int WINDOW_HEIGHT = 750;

    private final FirstWindowScreen firstWindowScreen;
    private final OptionsScreen optionsScreen;
    private final GameScene gameScene;
    private final InstructionsScreen instructionsScreen;
    private final GameOverScreen gameOverScreen;




    public Window(){

        this.setResizable(false);
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Need For Speed");
        this.setLocationRelativeTo(null);


        this.firstWindowScreen = new FirstWindowScreen();
        this.add(firstWindowScreen);

        this.optionsScreen = new OptionsScreen();
        this.add(optionsScreen);
        optionsScreen.setVisible(false);


        this.instructionsScreen = new InstructionsScreen();
        this.add(instructionsScreen);

        this.gameScene = new GameScene(this);
        this.add(gameScene);
        this.gameScene.setVisible(false);


        this.gameOverScreen = new GameOverScreen();
        this.add(gameOverScreen);
        this.gameOverScreen.setVisible(false);








        FirstWindowScreen.getButtonOfEnter().addActionListener(e -> {
            optionsScreen.setVisible(true);
            firstWindowScreen.setVisible(false);
            gameOverScreen.setVisible(false);
        });


        OptionsScreen.getInstructions().addActionListener(e -> {
            this.instructionsScreen.setVisible(true);
            this.firstWindowScreen.setVisible(false);
            this.optionsScreen.setVisible(false);
            this.gameScene.setVisible(false);
            this.gameOverScreen.setVisible(false);
        });


        InstructionsScreen.getBackButton().addActionListener(e -> {
            this.instructionsScreen.setVisible(false);
            this.optionsScreen.setVisible(true);
            this.gameOverScreen.setVisible(false);
        });


        OptionsScreen.getGameScene().addActionListener(e -> {
            this.gameScene.setVisible(true);
            this.firstWindowScreen.setVisible(false);
            this.optionsScreen.setVisible(false);
            this.instructionsScreen.setVisible(false);
//            this.gameOverScreen.setVisible(false);
            this.gameScene.mainGameLoop();
            this.gameOverScreen.setVisible(true);
        });








    }


    public void showWindow() {
        this.setVisible(true);
    }

    public static int getWINDOW_WIDTH() {
        return WINDOW_WIDTH;
    }

    public static int getWINDOW_HEIGHT() {
        return WINDOW_HEIGHT;
    }

}
