import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.GridLayout;

public class App {
    private JFrame frame;
    private JButton button;
    private JPanel panel;

    public App() {
        frame = new JFrame();
        frame.setBackground(Color.white);
        frame.setSize(420, 420);
        frame.setTitle("COASTER GAME");
        frame.setVisible(true);
        // frame.setIconImage(image.getImage());
        // frame.setIconImage(image.getImage());
        button = new JButton();
        button.setVisible(true);

        panel = new JPanel();
        panel.setBorder(null);

        panel.add(button);
    }

    public static void main(String[] args) {
        new App();
    }
}