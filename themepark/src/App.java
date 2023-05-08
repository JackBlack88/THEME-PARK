import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Transparency;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.annotation.Target;

public class App implements ActionListener {
    private JFrame frame;
    private JButton button;
    private JPanel panel;
    private JLabel label;
    int count;
    int min = 0;
    int max = 500;
    double x = min + Math.random() * (max - min); // getting random x-axis and y-axis vaules
    double y = min + Math.random() * (max - min);
    int xValue = (int) x; // Converting the x and y nums from doubles to ints so I can set the location
    int yValue = (int) y;

    public App() {

        frame = new JFrame();
        Frame f = new Frame(1000, 1000);
        frame.setSize(f.getWidth(), f.getHeight());
        // frame.setResizable(false);
        frame.setTitle("COASTER GAME");
        frame.setVisible(true);


        button = new JButton();

        ImageIcon ballon = new ImageIcon("ballon.png");
        button.setIcon(ballon);
        button.addActionListener(this);
        button.setOpaque(false);
        button.setBorderPainted(false);
        //button.setContentAreaFilled(false);

        panel = new JPanel();
        panel.setSize(600, 600);
        panel.setBorder(BorderFactory.createEmptyBorder(100, 50, 100, 100));
        panel.setLayout(null);

        panel.add(button);
        Button target = new Button(133, 100, 0, 600);
        // JButton button = new JButton(new
        // ImageIcon(getClass().getClassLoader().getResource("ballon.gif")));

        button.setSize(target.getWidth(), target.getHeight());
        button.setLocation(30, 30);
        frame.add(panel);

        label = new JLabel("NUMBER OF CLICKS: 0");
        label.setSize(230, 70);
        panel.add(label);

        label.setLocation(300, 0);

    }

    public static void main(String[] args) {
        new App();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("NUMBER OF CLICKS:" + count);
        panel.remove(button);
        this.frame.repaint();
        panel.add(button);
        int min = 0;
        int max = 500;
        double x = min + Math.random() * (max - min); // getting random x-axis and y-axis vaules
        double y = min + Math.random() * (max - min);
        int xValue = (int) x; // Converting the x and y nums from doubles to ints so I can set the location
        int yValue = (int) y;
        button.setLocation(xValue, yValue);
        //button.move(xValue, yValue);

    }
}