import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.annotation.Target;

public class App implements ActionListener {
    private JFrame frame;
    private JButton button;
    private JPanel panel;
    private JLabel label;
    int count;

    public App() {

        frame = new JFrame();
        // frame.setBackground(Color.white);
        frame.setSize(600, 600);
        // frame.setResizable(false);
        frame.setTitle("COASTER GAME");
        frame.setVisible(true);
        // frame.setIconImage(image.getImage());
        // frame.setIconImage(image.getImage());
        button = new JButton("Button");
        button.addActionListener(this);

        panel = new JPanel();
        panel.setSize(600, 600);
        panel.setBorder(BorderFactory.createEmptyBorder(100, 50, 100, 100));
        panel.setLayout(null);

        ImageIcon ballon = new ImageIcon("ballon.png");
        button.setIcon(ballon);
        panel.add(button);
        //Button target = new Button(200, 100, 0, 600);
        // JButton button = new JButton(new
        // ImageIcon(getClass().getClassLoader().getResource("ballon.gif")));


        //button.setSize(target.getHeight(), target.getWidth());
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

    public void ballon() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("NUMBER OF CLICKS:" + count);
        int min = 0;
        int max = 500;
        double x = min + Math.random() * (max - min); // getting random x-axis and y-axis vaules
        double y = min + Math.random() * (max - min);
        int xValue = (int) x; // Converting the x and y nums from doubles to ints so I can set the location
        int yValue = (int) y;
        panel.remove(button);
        this.frame.repaint();
        panel.add(button);
        button.setLocation(xValue, yValue);

    }
}