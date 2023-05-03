import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.GridLayout;

public class App {
    private JFrame frame;
    private JButton button;
    private JPanel panel;

    public static void main(String[] args) {

    }

    public void button() {
        button = new JButton();
        button.setVisible(true);
    }

    public void frame() {
        frame = new JFrame();
        frame.setBackground(Color.white);
        frame.setSize(420, 420);
        frame.setTitle("COASTER GAME");
        frame.setVisible(true);
        // frame.setIconImage(image.getImage());
        // frame.setIconImage(image.getImage());
    }

    public void panel() {
        panel = new JPanel();
        panel.setBorder(null);
    }
}
