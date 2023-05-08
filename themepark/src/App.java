import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Transparency;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.annotation.Target;
import javax.swing.Timer;
public class App implements ActionListener {
    private JFrame main;
    private JFrame gameFrame;
    private JFrame end;
    private JButton button;
    private JButton startButton;
    private JPanel panel;
    private JPanel first;
    private JPanel ending;
    private JLabel score;
    private JLabel label;
    int count;
    Frame f = new Frame(1000, 1000);
    Button target = new Button(189, 100, 0, 600);
    ImageIcon ballon = new ImageIcon("ballon.gif");

    public App() {
        main = new JFrame();
        main.setVisible(true);
        main.setSize(f.getWidth(), f.getHeight());
        first = new JPanel();

        startButton = new JButton("PRESS TO START");
        startButton.setSize(target.getWidth(), target.getHeight());
        main.add(first);
        first.add(startButton);

        startButton.addActionListener(this);

    }

    public static void main(String[] args) {
        new App();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o == button) {
            count++;
            label.setText("NUMBER OF CLICKS:" + count);
            panel.remove(button);
            this.gameFrame.repaint();
            panel.add(button);
            int min = 0;
            int max = 500;
            double x = min + Math.random() * (max - min); // getting random x-axis and y-axis vaules
            double y = min + Math.random() * (max - min);
            int xValue = (int) x; // Converting the x and y nums from doubles to ints so I can set the location
            int yValue = (int) y;
            button.setLocation(xValue, yValue);
        }

        else if (o == startButton) {
            gameFrame = new JFrame();
            button = new JButton(ballon);// Makes a new button and makes the button into the "ballon" gif
            panel = new JPanel();
            label = new JLabel("NUMBER OF CLICKS: 0");
            gameFrame.setVisible(true);
            gameFrame.setSize(f.getWidth(), f.getHeight());
            gameFrame.setTitle("BALLON POPPING");
            gameFrame.setVisible(true);

            button.addActionListener(this);
            button.setOpaque(false);
            button.setBorderPainted(false);
            button.setContentAreaFilled(false);
            panel.setSize(600, 600);
            panel.setBorder(BorderFactory.createEmptyBorder(100, 50, 100, 100));
            panel.setLayout(null);
            panel.add(button);

            button.setSize(target.getWidth(), target.getHeight());
            button.setLocation(30, 30);
 
            label.setSize(230, 70);
            panel.add(label);

            label.setLocation(300, 0);

            main.dispose();
        }
        
    }
}