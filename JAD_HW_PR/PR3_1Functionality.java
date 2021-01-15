
//reference: https://stackoverflow.com/questions/38426064/need-help-moving-item-between-lists-with-java-using-swing
//Reference: https://www.oreilly.com/library/view/java-for-dummies/9781118239742/a11_08_9781118239742-ch05.html#:~:text=your%20free%20trial-,DefaultListModel%20Class,displayed%20by%20a%20JList%20control.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Important Note: add() is like push_back() and remove(List.size() - n) is like pop_back for Lists

public class PR3_1Functionality extends JFrame implements ActionListener, MouseListener {

    private static final long serialVersionUID = 1L; // This is just a default thing to make sure that VSCode is happy
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * This is where I ekp all of my variables the large comment bars were for me to
     * help seperate them and to help keep better track of where they were
     */
    PR2_6City City = new PR2_6City(); // This will run my city file and put all the data into the lists
    PR3_1DataCalculation Data = new PR3_1DataCalculation();
    PR3_1ButtonCalls BNT = new PR3_1ButtonCalls();
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * This is where all my buttons were stored they are simple name because they
     * are simple options
     */
    JButton Option = new JButton(
            ("!IMPORTANT!  If you want to move people from place to place, you must first selct the person from the list, then select the button that person belongs to, and then click on the button where you want him to go"));
    JButton Option1 = new JButton("See who is in what school and move the kids to different schools");
    JButton Option2 = new JButton(("See who is all the police officers in the city hall"));
    JButton Option3 = new JButton(("See all the information about all the people in my list"));
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * these were ment for the third option as they contain a lot of data and
     * requiring scrolling to see everyone
     */
    JScrollPane scrollPane = new JScrollPane();
    JScrollPane scrollPane2 = new JScrollPane();
    JScrollPane scrollPane3 = new JScrollPane();
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * this is the main window you see when you run the program
     */
    JFrame JFrameMainWindow = new JFrame("City Information"); // this should make the window have a title of testing
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * Content panel holds the first set of options to select from NextFrame panel
     * loads up the next panel once an options has been chosen
     */
    JPanel Content_To_Add_To_Window_Panel = new JPanel();
    JPanel NextFrame = new JPanel(); // new panel that will apear when they click on a option
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * these are generic storages i made to help hold data when i needed them to
     */
    // these are generic storages for me to use for my calculations
    JList<String> genericStorageFirst = new JList<String>();
    JList<String> genericStorageSecond = new JList<String>();
    DefaultListModel<String> addModel = new DefaultListModel<String>();
    DefaultListModel<String> removeModel = new DefaultListModel<String>();
    int i = 0;
    JButton btnNname = new JButton();
    JButton test = new JButton();
    String name;
    String name2;
    ActionEvent help;
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * I never got to implement these, but they would hold images that would be used
     * to display what you were clicking on
     */
    ImageIcon TeachersImage = new ImageIcon("Pete.png"); // this creats an image from the current files. //put it into a
    // JLabel for it to show
    ImageIcon KidsImage = new ImageIcon("kids.png");
    ImageIcon PoliceImage = new ImageIcon("police.png");
    ImageIcon CityHallImage = new ImageIcon("City_Hall.png");
    ImageIcon SchoolImage = new ImageIcon("school.png");
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void CityViewer() {
        JFrameMainWindow.setSize(500, 500); // sets up the starting window
        Data.FillLists(); // this runs data to be used for later
        AddComponents(); // this add components to the starting window
    }

    /**
     * @param pane this was more so used as a convience rather than anything
     *             important
     */
    public void Alignment(Container pane) {
        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

    }

    /**
     * @param Jbutton
     * @param container
     * @param name
     * @param Add_To_Mouse_Actions
     * @param Action               this was just to have my buttons set up in a way
     *                             so that it would not become cluttered code
     */
    public void ButtonSettings(JButton Jbutton, Container container, String name, boolean Add_To_Mouse_Actions,
            boolean Action) {
        Jbutton.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(Jbutton);
        Jbutton.setName(name);
        if (Add_To_Mouse_Actions == true)
            Jbutton.addMouseListener(this);
        if (Action == true)
            Jbutton.addActionListener((ActionListener) this);
    }

    /**
     * this code block adds a bunch of stuff to the main window to be viewed later
     */
    private void AddComponents() {
        JFrameMainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFrameMainWindow.setLayout(new GridLayout(2, 3));

        Alignment(JFrameMainWindow.getContentPane());

        ButtonSettings(Option, Content_To_Add_To_Window_Panel, "Option", false, false);
        ButtonSettings(Option1, Content_To_Add_To_Window_Panel, "Option1", false, true);
        ButtonSettings(Option2, Content_To_Add_To_Window_Panel, "Option2", false, true);
        ButtonSettings(Option3, Content_To_Add_To_Window_Panel, "Option3", false, true);

        Content_To_Add_To_Window_Panel.setEnabled(true);

        JFrameMainWindow.add(Content_To_Add_To_Window_Panel); // this is needed for the transition to work

        JFrameMainWindow.setVisible(true); // this will mkae the window appear on screen
    }

    /**
     * these next few code block are just for the differnt options that cn be
     * selected I did not want to put it all into one thing so i moved them into
     * there own functions to be called later
     */

    public void Option1Settings() {
        NextFrame.setLayout(new GridLayout(2, 3));
        NextFrame.add(Data.__AdamsList);
        NextFrame.add(Data.__ArlingtonList);
        NextFrame.add(Data.__ChaseList);
        NextFrame.add(Data.__GarryList);
        NextFrame.add(Data.__FerrisList);
        NextFrame.add(Data.__Lewis_Clark_List);

        // buttons
        ButtonSettings(BNT.Adams, NextFrame, "Adams", true, true);
        ButtonSettings(BNT.Arlington, NextFrame, "Arlington", true, true);
        ButtonSettings(BNT.Chase, NextFrame, "Chase", true, true);
        ButtonSettings(BNT.Garry, NextFrame, "Garry", true, true);
        ButtonSettings(BNT.Ferris, NextFrame, "Ferris", true, true);
        ButtonSettings(BNT.Lewis_Clark, NextFrame, "Lewis & Clark", true, true);
    }

    public void Option2Settings() {
        NextFrame.setLayout(new GridLayout(2, 3));
        NextFrame.add(Data.__SCHList);
        NextFrame.add(Data.__DCHList);
        NextFrame.add(Data.__FCHList);
        NextFrame.add(Data.__AHCHList);

        ButtonSettings(BNT.SCH, NextFrame, "Spokane CH", true, true);
        ButtonSettings(BNT.DCH, NextFrame, "Dowtown CH", true, true);
        ButtonSettings(BNT.FCH, NextFrame, "Fun CH", true, true);
        ButtonSettings(BNT.AHCH, NextFrame, "Apple Hills CH", true, true);
    }

    public void Option3Settings() {
        NextFrame.setLayout(new GridLayout(2, 3));
        scrollPane.setViewportView(Data.__KidList);
        Data.__KidList.setLayoutOrientation(JList.VERTICAL);
        NextFrame.add(scrollPane);
        scrollPane2.setViewportView(Data.__PoliceList);
        Data.__PoliceList.setLayoutOrientation(JList.VERTICAL);
        NextFrame.add(scrollPane2);
        scrollPane3.setViewportView(Data.__TeacherList);
        Data.__TeacherList.setLayoutOrientation(JList.VERTICAL);
        NextFrame.add(scrollPane3);

        ButtonSettings(BNT.Kids, NextFrame, "Kids", true, true);
        ButtonSettings(BNT.Police, NextFrame, "Police", true, true);
        ButtonSettings(BNT.Teachers, NextFrame, "Teachers", true, true);
    }

    /**
     * @param e This will change the panel depending on what button you pressed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Option1) {
            Option1Settings();
            Content_To_Add_To_Window_Panel.setVisible(false);
            NextFrame.setVisible(true);
            this.JFrameMainWindow.add(NextFrame);
        }

        else if (e.getSource() == Option2) {
            Option2Settings();
            Content_To_Add_To_Window_Panel.setVisible(false);
            NextFrame.setVisible(true);
            this.JFrameMainWindow.add(NextFrame);
        }

        else if (e.getSource() == Option3) {
            Option3Settings();
            Content_To_Add_To_Window_Panel.setVisible(false);
            NextFrame.setVisible(true);
            this.JFrameMainWindow.add(NextFrame);
        }

    }

    /**
     * @param e this was the biggest challenge for me to figure out how to set up i
     *          lost a lot of hours doing this, but now it is correctly set up what
     *          this will do is read the button input and the then assigns it values
     *          depending on what button it is
     */
    @Override
    public void mouseReleased(MouseEvent e) {
        var thisisbad = e.getSource();
        if (thisisbad instanceof JButton) {
            if (i == 0) {
                btnNname = (JButton) thisisbad;
                name = btnNname.getName();
                btnNname.setName(name);
                removeModel = Data.NameLinkingListModel(name);
                genericStorageFirst = Data.NameLinkingList(name);
                i = 1;
            } else if (i == 1 && thisisbad != btnNname) {
                test = (JButton) thisisbad;
                name2 = test.getName();
                test.setName(name2);
                addModel = Data.NameLinkingListModel(name2);
                genericStorageSecond = Data.NameLinkingList(name2);
                i = 0;
                BNT.Actions(btnNname.getName(), genericStorageFirst, genericStorageSecond, addModel, removeModel);
                BNT.ButtonPressed();
            }
        }
    }

    /**
     * these functions are not used but i doo need them to keep the program happy
     */

    /**
     * @param e
     */
    @Override
    public void mousePressed(MouseEvent e) {

    }

    /**
     * @param e
     */
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    /**
     * @param e
     */
    @Override
    public void mouseEntered(MouseEvent e) {

    }

    /**
     * @param e
     */
    @Override
    public void mouseExited(MouseEvent e) {

    }

}
