import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class PR3_1Functionality extends JFrame implements ActionListener {

    /**
     *
     */
    private static final long serialVersionUID = 1L; // This is just a default thing to make sure that VSCode is happy

    JPanel _labels, _buttons; // JPanel objects
    JLabel _Text; // JLabel objects
    JButton _Left, _Right; // JButton objects, these will more so be used for testing things for now

    public void CityViiewer() {
        setSize(600, 400); // sets the size of thw window
        setLayout(new FlowLayout()); // this makes everything by default in the center with default distance between
                                     // things
        AddComponents();
    }

    private void AddComponents() {
        JFrame window = new JFrame("Testing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        _Text.setText("Hello world");
    }

    public void showWindow() {
        setVisible(true); // this will mkae the window appear on screen
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }

}
