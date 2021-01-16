import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L; // this makes VSCode happy

    Shapeinfo INFO = new Shapeinfo();
    JScrollPane scrollPane = new JScrollPane();
    /**
     * Theses variables are used for my various methed callings and for setting up
     * my starating window and for changing pannels I used JLists and DLM to sedt up
     * the apperance of the pannels that you see ojnce you clicked on them
     * 
     * I also have some generic variables that i use to store things in so that i
     * can use them for later
     */

    JFrame MainWindow = new JFrame("Shape information");
    JPanel Content = new JPanel();
    JPanel Lists = new JPanel();
    JButton String = new JButton("return the kind and ID of the shape");
    JButton Kind = new JButton("would return the kind of shape ");
    JButton Details = new JButton("would return the details of that shape");
    JButton ID = new JButton("return the ID of the shape");
    DefaultListModel<String> Shapes = new DefaultListModel<String>();
    JList<String> information = new JList<String>();
    String test = new String();

    public void shapes() {
        MainWindow.setSize(500, 500);
        AddContent();
    }

    /**
     * This methods set uip my starting window that appears once you run my program
     */
    private void AddContent() {
        MainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainWindow.setLayout(new GridLayout(2, 3));

        Content.add(String);
        String.addActionListener(this);
        Content.add(Kind);
        Kind.addActionListener(this);
        Content.add(Details);
        Details.addActionListener(this);
        Content.add(ID);
        ID.addActionListener(this);

        Content.setEnabled(true);
        MainWindow.add(Content);
        MainWindow.setVisible(true);

    }

    /***
     * these next few methods are similar because i want them to do a similar thing
     * they mostly do the same thing except for a few differences in the return
     * value
     */

    public void DetailSettings() {
        Lists.setLayout(new FlowLayout());
        Shapes = INFO.getDetailString();
        scrollPane.setViewportView(information);
        information.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        information.setAlignmentX(FlowLayout.LEFT);
        information.setLayoutOrientation(JList.VERTICAL);
        information.setModel(Shapes);

        Lists.add(information);
        Lists.add(scrollPane);
    }

    public void String() {
        Shapes = INFO.tooString();
        information.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        information.setAlignmentX(FlowLayout.LEFT);
        information.setLayoutOrientation(JList.VERTICAL);
        information.setModel(Shapes);
        Lists.add(information);
        Lists.add(scrollPane);

    }

    public void Kind() {
        Shapes = INFO.getKind();
        information.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        information.setAlignmentX(FlowLayout.LEFT);
        information.setLayoutOrientation(JList.VERTICAL);
        information.setModel(Shapes);
        Lists.add(information);
        Lists.add(scrollPane);
    }

    public void ID() {
        Shapes = INFO.getID();
        information.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        information.setAlignmentX(FlowLayout.LEFT);
        information.setLayoutOrientation(JList.VERTICAL);
        information.setModel(Shapes);
        Lists.add(information);
        Lists.add(scrollPane);
    }

    /**
     * @param e
     * 
     *          This is meant for acter you click a button and a different window
     *          appears
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Details) {
            DetailSettings();
            Content.setVisible(false);
            Lists.setVisible(true);
            this.MainWindow.add(Lists);
        } else if (e.getSource() == String) {
            String();
            Content.setVisible(false);
            Lists.setVisible(true);
            this.MainWindow.add(Lists);
        } else if (e.getSource() == Kind) {
            Kind();
            Content.setVisible(false);
            Lists.setVisible(true);
            this.MainWindow.add(Lists);

        } else if (e.getSource() == ID) {
            ID();
            Content.setVisible(false);
            Lists.setVisible(true);
            this.MainWindow.add(Lists);

        }

    }

}
