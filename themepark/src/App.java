import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;
import java.io.File;

public class App implements ActionListener {
    private JFrame mainFrame;
    private JFrame gameFrame;
    private JFrame endFrame;
    private JButton button;
    private JButton startButton;
    private JPanel panel;
    private JPanel endPanel;
    private JLabel scoreLabel;
    private JLabel backgroundLabel;
    private JLabel finalLabel;
    private JLabel menu;
    private JLabel main;
    private JLabel time;
    private JLabel endBack;
    private int count; // Number of clicks
    private Timer timer;
    private int timeLeft = 60; // Total time for the game
    private Frame f = new Frame(677, 1000); // Creating a custom Frame object to set the size of the windows
    private TargetButton target = new TargetButton(149, 73, 0, 600);
    private ImageIcon balloonIcon = new ImageIcon("balloon.gif");
    private ImageIcon background = new ImageIcon("background2.jpg");
    private ImageIcon menuIcon = new ImageIcon("menu.png");
    private ImageIcon menuBackground = new ImageIcon("mainback.jpg");
    private ImageIcon endBackground = new ImageIcon("endBackground.jpg");

    // Constructor for the class 'App'
    public App() {
        mainFrame = new JFrame();
        mainFrame.setSize(f.getWidth(), f.getHeight());

        startButton = new JButton();
        startButton.addActionListener(this);
        startButton.setOpaque(false);
        startButton.setBorderPainted(false);
        startButton.setContentAreaFilled(false);
        startButton.setSize(476, 95);
        startButton.setLocation(260, 375);
        startButton.addActionListener(this);
        mainFrame.add(startButton); // Adding an ActionListener to the start button

        main = new JLabel(menuBackground);
        main.setSize(1000, 667);
        mainFrame.add(main);

        mainFrame.setVisible(true);
    }

    // Main method
    public static void main(String[] args) {
        new App(); // Creating a new instance of the App class
    }

    // Method to handle the ActionEvents
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == button) { // If "button" is clicked
            try {
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("BalloonPop.wav"));
                Clip clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();
            } catch (Exception ex) {
                System.out.println("Error playing sound.");
            }
            count++; // Increase the number of clicks
            scoreLabel.setForeground(Color.white);
            scoreLabel.setText("NUMBER OF CLICKS: " + count);

            panel.remove(button);
            panel.add(button);

            double x = target.getMin() + Math.random() * (target.getMax() - target.getMin()); // Getting random x-axis
                                                                                              // and y-axis values
            double y = target.getMin() + Math.random() * (target.getMax() - target.getMin());
            int xValue = (int) x; // Converting the x and y nums from doubles to ints so I can set the location
            int yValue = (int) y;
            button.setLocation(xValue, yValue);
            panel.setComponentZOrder(button, 0);
            gameFrame.repaint();

        } else if (source == startButton) { // If the "startButton" is clicked
            gameFrame = new JFrame();
            gameFrame.setSize(f.getWidth(), f.getHeight());
            gameFrame.setTitle("BALLOON POPPING");
            gameFrame.setVisible(true);
            gameFrame.setResizable(false);

            backgroundLabel = new JLabel(background);// Set the background label with an image
            backgroundLabel.setSize(1000, 677);

            button = new JButton(balloonIcon);
            button.addActionListener(this);
            button.setOpaque(false);
            button.setBorderPainted(false);
            button.setContentAreaFilled(false);
            button.setSize(target.getWidth(), target.getHeight());
            button.setLocation(30, 30);

            scoreLabel = new JLabel("NUMBER OF CLICKS: 0");
            scoreLabel.setSize(230, 75);
            scoreLabel.setLocation(365, 520);

            time = new JLabel();
            time.setForeground(Color.white);
            time.setSize(230, 70);
            time.setLocation(365, 495);

            menu = new JLabel(menuIcon);
            menu.setSize(300, 106);
            menu.setLocation(335, 495);

            panel = new JPanel();
            panel.setSize(946, 550);
            panel.setBorder(BorderFactory.createEmptyBorder(100, 50, 100, 100));
            panel.setLayout(null);
            panel.add(button);
            panel.add(scoreLabel);
            panel.add(menu);
            panel.add(backgroundLabel);
            panel.add(time); // Adds the time label to the gameFrame
            gameFrame.add(panel);
            panel.setComponentZOrder(menu, 4);
            panel.setComponentZOrder(time, 0);
            panel.setComponentZOrder(button, 0);
            panel.setComponentZOrder(backgroundLabel, 4);
            mainFrame.dispose(); // Disposes of the mainFrame

            timer = new Timer(1000, new ActionListener() { // Starts the timer

                @Override
                public void actionPerformed(ActionEvent e) {
                    timeLeft--; // Subtracts time from the timer
                    if (timeLeft == 0) { // If time is up, dispose of the gameFrame and show the final score on the
                                         // endFrame
                        gameFrame.dispose();
                       
                        endFrame = new JFrame();
                        endBack = new JLabel(endBackground);
                        endBack.setSize(f.getWidth(), f.getHeight());
                        endFrame.setSize(f.getWidth(), f.getHeight());
                        endFrame.setVisible(true);

                        
                        finalLabel = new JLabel("YOUR FINAL SCORE IS: " + count);
                        finalLabel.setForeground(Color.white);
                        finalLabel.setSize(230, 70);
                        finalLabel.setLocation(430, 443);

                        endPanel = new JPanel();
                        endPanel.setLayout(null);
                        endPanel.setSize(f.getWidth(), f.getHeight());
                        endFrame.add(endPanel);
                        endPanel.add(finalLabel);
                        endPanel.add(endBack);
                        endPanel.setComponentZOrder(finalLabel, 0);
                        endPanel.setComponentZOrder(endBack, 4);
                    } else {
                        time.setText("TIME LEFT: " + timeLeft + " SECONDS"); // Updates the time label
                    }
                }

            });
            timer.start();
        }
    }
}