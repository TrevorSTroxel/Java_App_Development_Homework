import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class PR3_1Main extends JFrame implements ActionListener {

    /**
     *
     */
    private static final long serialVersionUID = 1L; // This is just a default thing to make sure that VSCode is happy

    
    JPanel _labels, _buttons;
    
    public CityViiewer() {
        setSize(600,400);
        setLayout(new FlowLayout());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }

}
