package org.example;
import javax.swing.*;



public class Window extends JFrame {

    private static final int WINDOW_WIDTH = 750;
    private static final int WINDOW_HEIGHT = 750;

    private final FirstWindowScreen firstWindowScreen;
    private final OptionsScreen optionsScreen;
    private final GameScene gameScene;
    private final InstructionsScreen instructionsScreen;
    private final Garage garage;
    private final GameOverScreen gameOverScreen;
    private final PauseScreen pauseScreen;




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
        this.instructionsScreen.setVisible(false);


        this.garage = new Garage();
        this.add(garage);
        this.garage.setVisible(false);


        this.gameScene = new GameScene(this);
        this.add(gameScene);
        this.gameScene.setVisible(false);


        this.gameOverScreen = new GameOverScreen();
        this.add(gameOverScreen);
        this.gameOverScreen.setVisible(false);


        this.pauseScreen = new PauseScreen();
        this.add(pauseScreen);
        this.pauseScreen.setVisible(false);





        FirstWindowScreen.getButtonOfEnter().addActionListener(e -> {
            firstWindowScreen.playClickAudio();
            optionsScreen.setVisible(true);
            firstWindowScreen.setVisible(false);
            gameOverScreen.setVisible(false);
        });


        OptionsScreen.getInstructions().addActionListener(e -> {
            firstWindowScreen.playClickAudio();
            this.instructionsScreen.setVisible(true);
            this.firstWindowScreen.setVisible(false);
            this.optionsScreen.setVisible(false);
            this.gameScene.setVisible(false);
            this.gameOverScreen.setVisible(false);
        });



        InstructionsScreen.getBackButton().addActionListener(e -> {
            FirstWindowScreen.playClickAudio();
            this.instructionsScreen.setVisible(false);
            this.optionsScreen.setVisible(true);
            this.gameOverScreen.setVisible(false);
        });


        OptionsScreen.getGarage().addActionListener(e -> {
            FirstWindowScreen.playClickAudio();
            this.garage.setVisible(true);
            this.instructionsScreen.setVisible(false);
            this.firstWindowScreen.setVisible(false);
            this.optionsScreen.setVisible(false);
            this.gameScene.setVisible(false);
            this.gameOverScreen.setVisible(false);
        });

        Garage.getBackButton().addActionListener(e -> {
            FirstWindowScreen.playClickAudio();
            this.garage.setVisible(false);
            this.optionsScreen.setVisible(true);
            this.gameOverScreen.setVisible(false);
        });


        OptionsScreen.getGameScene().addActionListener(e -> {
            FirstWindowScreen.playClickAudio();
            this.firstWindowScreen.setVisible(false);
            this.optionsScreen.setVisible(false);
            this.instructionsScreen.setVisible(false);
            this.firstWindowScreen.stopAudio();
            this.gameScene.playEngineAudio();
            this.gameOverScreen.setVisible(true);
            this.gameScene.setVisible(true);
            this.gameScene.mainGameLoop();
            this.gameScene.setFocusable(true);
            this.gameScene.requestFocus();

        });

        GameOverScreen.getCloseOption().addActionListener(e -> {
            FirstWindowScreen.playClickAudio();
            System.exit(0);
        });

        GameScene.getPauseGame().addActionListener(e -> {
            this.gameScene.setVisible(false);
            this.pauseScreen.setVisible(true);
        });

        PauseScreen.getContinueGame().addActionListener(e -> {
            this.gameScene.setVisible(true);
            this.pauseScreen.setVisible(false);
            this.gameScene.playEngineAudio();
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
