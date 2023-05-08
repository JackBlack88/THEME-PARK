import javax.swing.*;
import java.awt.event.*;

public class App implements ActionListener {
    private JFrame mainFrame;
    private JFrame gameFrame;
    private JFrame endFrame;
    private JButton button;
    private JButton startButton;
    private JPanel panel;
    private JPanel startPanel;
    private JLabel scoreLabel;
    private JLabel label;
    private JLabel time;
    private int count;
    private Timer timer;
    private int timeLeft = 60;
    private Frame f = new Frame(1000, 1000);
    private Button target = new Button(189, 100, 0, 600);
    private ImageIcon balloonIcon = new ImageIcon("balloon.gif");

    public App() {
        mainFrame = new JFrame();
        mainFrame.setSize(f.getWidth(), f.getHeight());

        startPanel = new JPanel();
        startButton = new JButton("PRESS TO START");
        startButton.setSize(target.getWidth(), target.getHeight());
        startButton.addActionListener(this);
        startPanel.add(startButton);

        mainFrame.add(startPanel);
        mainFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new App();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == button) {
            count++;
            scoreLabel.setText("NUMBER OF CLICKS: " + count);

            panel.remove(button);
            panel.add(button);

            int min = 0;
            int max = 500;
            double x = min + Math.random() * (max - min); // getting random x-axis and y-axis values
            double y = min + Math.random() * (max - min);
            int xValue = (int) x; // Converting the x and y nums from doubles to ints so I can set the location
            int yValue = (int) y;
            button.setLocation(xValue, yValue);

            gameFrame.repaint();
        } else if (source == startButton) {
            gameFrame = new JFrame();
            gameFrame.setSize(f.getWidth(), f.getHeight());
            gameFrame.setTitle("BALLOON POPPING");
            gameFrame.setVisible(true);

            button = new JButton(balloonIcon);
            button.addActionListener(this);
            button.setOpaque(false);
            button.setBorderPainted(false);
            button.setContentAreaFilled(false);
            button.setSize(target.getWidth(), target.getHeight());
            button.setLocation(30, 30);

            scoreLabel = new JLabel("NUMBER OF CLICKS: 0");
            scoreLabel.setSize(230, 70);
            scoreLabel.setLocation(300, 0);

            panel = new JPanel();
            panel.setSize(600, 600);
            panel.setBorder(BorderFactory.createEmptyBorder(100, 50, 100, 100));
            panel.setLayout(null);
            panel.add(button);
            panel.add(scoreLabel);
            panel.add(time);
            time.setLocation(500, 21);
            gameFrame.add(panel);
            mainFrame.dispose();

            timer = new Timer(1000, new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    timeLeft--;
                    if (timeLeft == 0) {
                        gameFrame.dispose();

                        endFrame = new JFrame();
                        endFrame.setSize(f.getWidth(), f.getHeight());
                        endFrame.setVisible(true);
                        endFrame.add(scoreLabel);
                        scoreLabel.setText("YOUR FINAL SCORE IS: " + count);

                    } else {
                        time.setText("TIME LEFT: " + timeLeft);
                    }
                }

            });
            timer.start();
        }
    }
}