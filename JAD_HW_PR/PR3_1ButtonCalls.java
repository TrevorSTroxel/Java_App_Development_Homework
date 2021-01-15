import javax.swing.*;

public class PR3_1ButtonCalls {
    /**
     * This were i kept all but a few of my button creations This was mostly used
     * for storage and a few calculations
     */
    PR3_1DataCalculation Data = new PR3_1DataCalculation();
    JButton Adams = new JButton("Adams");
    JButton Arlington = new JButton("Arlington");
    JButton Chase = new JButton("Chase");
    JButton Garry = new JButton("Garry");
    JButton Ferris = new JButton("Ferris");
    JButton Lewis_Clark = new JButton("Lewis & Clark");

    JButton SCH = new JButton("Spokane CH");
    JButton DCH = new JButton("Dowtown CH");
    JButton FCH = new JButton("Fun Ch");
    JButton AHCH = new JButton("Apple Hills CH");

    JButton Kids = new JButton("Info on the kids");
    JButton Police = new JButton("Info on the police");
    JButton Teachers = new JButton("Info on the teachers");

    /**
     * These are just generic value holders i made to make sure that valuse were
     * being held for calculations later
     */
    JList<String> list1 = new JList<String>();
    JList<String> list2 = new JList<String>();
    DefaultListModel<String> modelplus = new DefaultListModel<String>();
    DefaultListModel<String> modelnegative = new DefaultListModel<String>();
    String iamgoingtocry;

    /**
     * @param name
     * @param BTN1_list
     * @param BTN2_list
     * @param BTN2_modelAdd
     * @param BTN_modelRemove This should have been inside of DataCalculations, but
     *                        I moved it to the wrong spot and I do not want to mess
     *                        with the code now but what this does is set certain
     *                        valuse depending on what was clicked on ealier
     */
    public void Actions(String name, JList<String> BTN1_list, JList<String> BTN2_list,
            DefaultListModel<String> BTN2_modelAdd, DefaultListModel<String> BTN_modelRemove) {
        list1 = BTN1_list;
        list2 = BTN2_list;
        modelplus = BTN2_modelAdd;
        modelnegative = BTN_modelRemove;
        iamgoingtocry = name;
    }

    /**
     * @param name This is what makes the whole data moving of my program work What
     *             this does is that it takes the button info from the previous
     *             button presses and makes it so that it transfer over data
     */

    public void ButtonPressed() {
        list1.getSelectedValuesList().stream().forEach((data) -> { // this grabs all the data from the list that was
                                                                   // first selected so that it can be moved over to a
                                                                   // diffrent file
            modelplus.addElement(data);
            modelnegative.removeElement(data);
        });
        list1.revalidate();
        list2.revalidate();
    }

}
