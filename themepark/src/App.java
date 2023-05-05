import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App implements ActionListener {
    private JFrame frame;
    private JButton button;
    private JPanel panel;
    private JLabel label;
    int count;

    public App() {

        frame = new JFrame();
        // frame.setBackground(Color.white);
        frame.setSize(420, 420);
        frame.setTitle("COASTER GAME");
        frame.setVisible(true);
        // frame.setIconImage(image.getImage());
        // frame.setIconImage(image.getImage());
        button = new JButton("Button");
        button.addActionListener(this);

        panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(100, 50, 100, 100));
        panel.setLayout(null);

        panel.add(button);
        button.setSize(200, 100);
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

    public void button() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("NUMBER OF CLICKS:" + count);
        panel.remove(button);
        this.frame.repaint();
        panel.add(button);

    }
}