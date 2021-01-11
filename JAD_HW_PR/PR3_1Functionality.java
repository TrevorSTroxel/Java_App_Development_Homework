
import javax.swing.*;
//import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class PR3_1Functionality extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L; // This is just a default thing to make sure that VSCode is happy
    ///////////////////////////////////////////////
    // Generic variables to call and use
    static PR2_6City obj = new PR2_6City(); // This will run my city file and put all the data into the lists
    static JButton Option = new JButton(("What would you like to do?"));
    JButton Option1 = new JButton("1. See the names of all the people"); // put in code for listener functions
    static JButton Option2 = new JButton("2. See all the names of the buildings");
    static JButton Option3 = new JButton(
            "3. See what teachers and kids are in what school and what police officers are in what building");
    static JButton Option4 = new JButton(("4. Pay employees"));
    static JLabel Output = new JLabel();
    static Box listNames = Box.createVerticalBox();
    static JPanel mainWindowFrame = new JPanel();
    static JLabel TempStorage;
    JFrame DisplayMainWindow = new JFrame("City Information"); // this should make the window have a title of testing
    //////////////////////////////////////////////

    public void CityViiewer() {
        setSize(1000, 1000); // sets the size of thw window
        AddComponents();
    }

    public PR3_1Functionality() {

    }

    private void AddComponents() {
        DisplayMainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // window.getContentPane().add(_Text, BorderLayout.CENTER); // this grabs the
        // text and centers it
        DisplayMainWindow.setLayout(new GridLayout(1, 1));
        mainWindowFrame.add(Option);
        mainWindowFrame.add(Option1);
        mainWindowFrame.add(Option2);
        mainWindowFrame.add(Option3);
        mainWindowFrame.add(Option4);

        // Enable our list (Contains list of names whenever we want it to), and make it
        // so we can't see the list because we don't need to when we start the program
        listNames.setEnabled(true);
        listNames.setVisible(false);

        Option1.addActionListener((ActionListener) this); // From slides
        Option2.addActionListener((ActionListener) this);
        Option3.addActionListener((ActionListener) this);
        Option4.addActionListener((ActionListener) this);

        mainWindowFrame.setEnabled(true); // THIS IS THE MENU FRAME !!! Menu -> Click = get rid of menu and show next
        // frame

        DisplayMainWindow.add(mainWindowFrame); // Frame is a JPanel to house the next set of visuals

        // Technically the program will continue here, but we are waiting for user input
        // on one of the buttons
        // due to the action listener on line 49. When the user presses one of the
        // buttons, copy the format
        // between lines 70 and 84 to implement functionality for each button.

        DisplayMainWindow.pack();// this sizes the frame so that all its contents are at or above their preferred
        // sizes.
        // .getContentPane() is whats called a container in the code. IMPORTANT
        DisplayMainWindow.setVisible(true); // this will mkae the window appear on screen
    }

    /**
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        mainWindowFrame.setVisible(false); // Disable menu
        listNames.setVisible(true); // Show our new data
        JPanel visFrame = new JPanel(); // Create new visible frame
        visFrame.add(listNames); // Add data space to new frame
        visFrame.setVisible(true); // Make it visible
        this.DisplayMainWindow.add(visFrame); // MAKE SURE TO ADD FRAME TO THE VISUAL WINDOW

        if (e.getSource() == Option1) {
            for (int i = 0; i < obj.getKidAmount(); i++) // Add data to what we want in the new space
            {
                String nameKid = obj.getKid(i).getName();
                TempStorage = new JLabel(nameKid);
                listNames.add(TempStorage);
                // look into vertical or scrool layout
            }

            for (int i = 0; i < obj.getTeachAmount(); i++) {
                String nameTeach = obj.getTeach(i).getName();
                TempStorage = new JLabel(nameTeach);
                listNames.add(TempStorage);
            }
            for (int i = 0; i < obj.getPolAmount(); i++) {
                String namePolice = obj.getTeach(i).getName();
                TempStorage = new JLabel(namePolice);
                listNames.add(TempStorage);
            }
            revalidate();
            repaint();
        }

        else if (e.getSource() == Option2) {
            for (int i = 0; i < obj.getCHAmount(); i++) {
                String CityHallNames = obj.getCH(i).getBuildingName();
                TempStorage = new JLabel(CityHallNames);
                listNames.add(TempStorage);
            }
            for (int i = 0; i < obj.getSHAmountt(); i++) {
                String CityHallNames = obj.getSchool(i).getBuildingName();
                TempStorage = new JLabel(CityHallNames);
                listNames.add(TempStorage);
            }
        }
    }

    /**
     * // System.out.println(""); System.out.println("What would you like to do?");
     * System.out.println("1. See the names of all the people");
     * System.out.println("2. See all the names of the buildings");
     * System.out.println( "3. See what teachers and kids are in what school and
     * what police officers are in what building"); System.out.println("4. Pay
     * employees"); Scanner UserChoice = new Scanner(System.in); int choice =
     * UserChoice.nextInt();
     * 
     * switch (choice) { case 1: System.out.println( "Here is a list of names of all
     * the people. In order it lists kids, then teachers, then police"); for (int i
     * = 0; i < 100; i++) { System.out.println("Kids Name: " + Kid.get(i).getName()
     * + "\n"); } for (int i = 0; i < 100; i++) { System.out.println("teachers Name:
     * " + Teacher.get(i).getName() + "\n"); } for (int i = 0; i < 100; i++) {
     * System.out.println("Police Name: " + Police.get(i).getName() + "\n"); }
     * break;
     * 
     * case 2: for (int i = 0; i < 100; i++) { System.out.println("City Hall name: "
     * + City_Hall.get(i).getBuildingName() + ", Address: " +
     * City_Hall.get(i).getAddress() + "\n"); } for (int i = 0; i < 100; i++) {
     * System.out.println("School name: " + School.get(i).getBuildingName() + ",
     * Address: " + School.get(i).getAddress() + "\n"); } break;
     * 
     * case 3: int i = 1; switch (i) { case 1: for (int q = 0; q < 100; q++) { if (q
     * % 2 == 0) { System.out.println("Adams teachers are: " +
     * Adams.get(q).getNewName()); } else if (q % 2 == 1) {
     * System.out.println("Adams kids are: " + Adams.get(q).getNewName()); } }
     * 
     * for (int q = 0; q < 100; q++) { if (q % 2 == 0) {
     * System.out.println("Arlington teachers are: " +
     * Arlington.get(q).getNewName()); } else if (q % 2 == 1) {
     * System.out.println("Arlington kids are: " + Arlington.get(q).getNewName()); }
     * }
     * 
     * for (int q = 0; q < 100; q++) { if (q % 2 == 0) { System.out.println("Chase
     * teachers are: " + Chase.get(q).getNewName()); } else if (q % 2 == 1) {
     * System.out.println("Chase kids are: " + Chase.get(q).getNewName()); } }
     * 
     * for (int q = 0; q < 100; q++) { if (q % 2 == 0) { System.out.println("Garry
     * teachers are: " + Garry.get(q).getNewName()); } else if (q % 2 == 1) {
     * System.out.println("Garry kids are: " + Garry.get(q).getNewName()); } }
     * 
     * for (int q = 0; q < 100; q++) { if (q % 2 == 0) { System.out.println("Lewis &
     * Clark teachers are: " + Lewis_Clark.get(q).getNewName()); } else if (q % 2 ==
     * 1) { System.out.println("Lewis & Clark kids are: " +
     * Lewis_Clark.get(q).getNewName()); } }
     * 
     * for (int q = 0; q < 100; q++) { if (q % 2 == 0) { System.out.println("Ferris
     * teachers are: " + Ferris.get(q).getNewName()); } else if (q % 2 == 1) {
     * System.out.println("Ferris kids are: " + Ferris.get(q).getNewName()); } }
     * 
     * case 2: for (int I = 0; i < 100; i++) { System.out .println("Spokane City
     * Hall has these police officers: " + SCH.get(I).getNewName());
     * System.out.println( "Airway Heights City Hall has these police officers: " +
     * AHCH.get(I).getNewName()); System.out.println( "Davenport City Hall has these
     * police officers: " + DCH.get(I).getNewName()); System.out.println(
     * "Farmington City Hall has these police officers: " +
     * FCH.get(I).getNewName()); } } break; case 4: System.out.println("You have
     * paid each employee"); break; default: System.out.println("You have
     * anincorrect choice, try again"); break; } UserChoice.close();
     */
    // implement thsi code into JFrame later
}
