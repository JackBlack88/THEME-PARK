import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.GridLayout;

public class App {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setBackground(Color.white);
        frame.setSize(420, 420);
        frame.setTitle("COASTER GAME");
        frame.setVisible(true);
        // frame.setIconImage(image.getImage());
        // frame.setIconImage(image.getImage());
        JButton button = new JButton();
        button.setVisible(true);

        JPanel panel = new JPanel();
        panel.setBorder(null);

        panel.add(button);

    }
}
