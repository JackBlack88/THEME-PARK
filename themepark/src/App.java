import javax.swing.JFrame;
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

    public App() {

        frame = new JFrame();
        //frame.setBackground(Color.white);
        frame.setSize(420, 420);
        frame.setTitle("COASTER GAME");
        frame.setVisible(true);
        // frame.setIconImage(image.getImage());
        // frame.setIconImage(image.getImage());
        button = new JButton("Button");
        

        panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(100, 50, 100, 100));

        panel.add(button);
        frame.add(panel);
    }

    public static void main(String[] args) {
        new App();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }
}