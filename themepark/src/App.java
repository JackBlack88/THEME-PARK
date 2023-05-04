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

        panel.add(button);
        frame.add(panel);
        label = new JLabel("NUMBER OF CLICKS: 0");
        panel.add(label);

    }

    public static void main(String[] args) {
        new App();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("NUMBER OF CLICKS:" + count);
    }
}