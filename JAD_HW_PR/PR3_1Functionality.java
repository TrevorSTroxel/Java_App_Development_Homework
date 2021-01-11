
//import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import javax.swing.JButton;
//import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JProgressBar;
import javax.swing.JList;

public class PR3_1Functionality extends JFrame implements ActionListener {

    ///////////////////////////////////////////////
    // Generic variables to call and use
    static JFrame f;
    static JList l;
    //////////////////////////////////////////////

    private static final long serialVersionUID = 1L; // This is just a default thing to make sure that VSCode is happy

    public void CityViiewer() {
        setSize(600, 400); // sets the size of thw window
        setLayout(new FlowLayout()); // this makes everything by default in the center with default distance between
                                     // things
        AddComponents();
    }

    private static void AddComponents() {
        /////////////////////////////////////////////////////////////////
        JLabel _Text = new JLabel("Testing code"); // JLabel objects
        //////////////////////////////////////////////////////////////////

        JFrame window = new JFrame("Testing"); // this should make the window have a title of testing
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        _Text.setPreferredSize(new Dimension(500, 500)); // sets the size of the window X,Y
        window.getContentPane().add(_Text, BorderLayout.CENTER); // this grabs the text and centers it
        // ListInfo();
        window.pack();// this sizes the frame so that all its contents are at or above their preferred
                      // sizes.
        // .getContentPane() is whats called a container in the code. IMPORTANT
        window.setVisible(true); // this will mkae the window appear on screen
    }

    private static void ListInfo() {
        // I will try to grab the information from the the other java files and put them
        // in here
        
    }

    /**
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }

}
