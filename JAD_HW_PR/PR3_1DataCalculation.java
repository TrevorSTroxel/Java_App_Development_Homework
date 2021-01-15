import javax.swing.*;

import java.util.*;
import java.awt.*;

/**
 * This is where all my calculation is held This is a huge file with lots of
 * repeating code because of how much was needed to be filled and how much
 * needed to be copied over
 */

public class PR3_1DataCalculation {
    PR2_6City City = new PR2_6City(); // This will run my city file and put all the data into the lists
    JScrollPane scrollPane = new JScrollPane();
    /**
     * I have a huge amout of variables here I would like to have less, but in java
     * you need to have it so all variables are initialized I wish i could make this
     * smaller but as of right now i am unable too
     */
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ArrayList<String> _AdamsKids = new ArrayList<String>();
    ArrayList<String> _ArlingtonKids = new ArrayList<String>();
    ArrayList<String> _ChaseKids = new ArrayList<String>();
    ArrayList<String> _GarryKids = new ArrayList<String>();
    ArrayList<String> _FerrisKids = new ArrayList<String>();
    ArrayList<String> _Lewis_Clark_Kids = new ArrayList<String>();
    ArrayList<String> _SCH = new ArrayList<String>();
    ArrayList<String> _AHCH = new ArrayList<String>();
    ArrayList<String> _DCH = new ArrayList<String>();
    ArrayList<String> _FCH = new ArrayList<String>();
    ArrayList<String> _Kid = new ArrayList<String>();
    ArrayList<String> _Police = new ArrayList<String>();
    ArrayList<String> _Teacher = new ArrayList<String>();
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    JList<String> __AdamsList = new JList<String>();
    JList<String> __ArlingtonList = new JList<String>();
    JList<String> __ChaseList = new JList<String>();
    JList<String> __GarryList = new JList<String>();
    JList<String> __FerrisList = new JList<String>();
    JList<String> __Lewis_Clark_List = new JList<String>();
    JList<String> __SCHList = new JList<String>();
    JList<String> __AHCHList = new JList<String>();
    JList<String> __DCHList = new JList<String>();
    JList<String> __FCHList = new JList<String>();
    JList<String> __KidList = new JList<String>();
    JList<String> __PoliceList = new JList<String>();
    JList<String> __TeacherList = new JList<String>();
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // using default list model.
    DefaultListModel<String> ___AdamsModel = new DefaultListModel<String>();
    DefaultListModel<String> ___ArlingtonModel = new DefaultListModel<String>();
    DefaultListModel<String> ___ChaseModel = new DefaultListModel<String>();
    DefaultListModel<String> ___GarryModel = new DefaultListModel<String>();
    DefaultListModel<String> ___FerrisModel = new DefaultListModel<String>();
    DefaultListModel<String> ___Lewis_Clark_Model = new DefaultListModel<String>();
    DefaultListModel<String> ___SCHModel = new DefaultListModel<String>();
    DefaultListModel<String> ___AHCHModel = new DefaultListModel<String>();
    DefaultListModel<String> ___DCHModel = new DefaultListModel<String>();
    DefaultListModel<String> ___FCHModel = new DefaultListModel<String>();
    DefaultListModel<String> ___KidModel = new DefaultListModel<String>();
    DefaultListModel<String> ___PoliceModel = new DefaultListModel<String>();
    DefaultListModel<String> ___TeacherModel = new DefaultListModel<String>();
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * The FillLists function grabs data from PR2_6City and fills in the lists that
     * I have here This is my longers section of repeating code due to how this hole
     * thin needs to be setup as i could not just simplly have it be a fuction to be
     * called multiple times
     */

    public void FillLists() {
        String AddString = "";
        // the even index are teachers and the odd indexes are kids

        for (int i = 0; i < City.getAdamsSize(); i++) // Add data to what we want in the new space
        {
            // this fuction makes it so only the kids are added to the scholl list right now
            if (i % 2 == 1) {
                AddString = "" + City.getAdams(i).getNewName();
                _AdamsKids.add(AddString);
            }
        }
        ___AdamsModel.addElement("Adams");
        for (String Kid : _AdamsKids) {
            ___AdamsModel.addElement(Kid); // this itterates through the arrayList and puts the names into model
                                           // argument
        }
        DataModel(__AdamsList, ___AdamsModel);

        for (int i = 0; i < City.getArlingtonsize(); i++) {
            if (i % 2 == 1) {
                AddString = "" + City.getArlington(i).getNewName();
                _ArlingtonKids.add(AddString);
            }
        }

        ___ArlingtonModel.addElement("Arlington");
        for (String Kid : _ArlingtonKids) {
            ___ArlingtonModel.addElement(Kid);
        }

        DataModel(__ArlingtonList, ___ArlingtonModel);

        for (int i = 0; i < City.getChasesize(); i++) {
            if (i % 2 == 1) {
                AddString = "" + City.getChase(i).getNewName();
                _ChaseKids.add(AddString);
            }
        }

        ___ChaseModel.addElement("Chase");
        for (String Kid : _ChaseKids) {
            ___ChaseModel.addElement(Kid);
        }

        DataModel(__ChaseList, ___ChaseModel);

        for (int i = 0; i < City.getGarrysize(); i++) {
            if (i % 2 == 1) {
                AddString = "" + City.getGarry(i).getNewName();
                _GarryKids.add(AddString);
            }
        }
        ___GarryModel.addElement("Garry");
        for (String Kid : _GarryKids) {
            ___GarryModel.addElement(Kid);
        }

        DataModel(__GarryList, ___GarryModel);

        for (int i = 0; i < City.getFerrissize(); i++) {
            if (i % 2 == 1) {
                AddString = "" + City.getFerris(i).getNewName();
                _FerrisKids.add(AddString);
            }
        }
        ___FerrisModel.addElement("Ferris");
        for (String Kid : _FerrisKids) {
            ___FerrisModel.addElement(Kid);
        }

        DataModel(__FerrisList, ___FerrisModel);

        for (int i = 0; i < City.getLewis_Clarksize(); i++) {
            if (i % 2 == 1) {
                AddString = "" + City.getLewis_Clark(i).getNewName();
                _Lewis_Clark_Kids.add(AddString);
            }
        }
        ___Lewis_Clark_Model.addElement("Lewis & Clark");
        for (String Kid : _Lewis_Clark_Kids) {
            ___Lewis_Clark_Model.addElement(Kid);
        }

        DataModel(__Lewis_Clark_List, ___Lewis_Clark_Model);

        for (int i = 0; i < City.getSCHsize(); i++) {
            AddString = "" + City.getSCH(i).getNewName();
            _SCH.add(AddString);
        }
        ___SCHModel.addElement("Spokane CH");
        for (String pol : _SCH) {
            ___SCHModel.addElement(pol); // this itterates through the arrayList and puts the names into model
                                         // argument
        }

        DataModel(__SCHList, ___SCHModel);

        for (int i = 0; i < City.getAHCHsize(); i++) {
            AddString = "" + City.getAHCH(i).getNewName();
            _AHCH.add(AddString);
        }

        ___AHCHModel.addElement("Apple Hills CH");
        for (String pol : _AHCH) {
            ___AHCHModel.addElement(pol); // this itterates through the arrayList and puts the names into model
                                          // argument
        }

        DataModel(__AHCHList, ___AHCHModel);

        for (int i = 0; i < City.getDCHsize(); i++) {
            AddString = "" + City.getDCH(i).getNewName();
            _DCH.add(AddString);
        }

        ___DCHModel.addElement("Dowtown CH");
        for (String pol : _DCH) {
            ___DCHModel.addElement(pol); // this itterates through the arrayList and puts the names into model
                                         // argument
        }

        DataModel(__DCHList, ___DCHModel);

        for (int i = 0; i < City.getFCHsize(); i++) {
            AddString = "" + City.getFCH(i).getNewName();
            _FCH.add(AddString);
        }

        ___FCHModel.addElement("Fun CH");
        for (String pol : _FCH) {
            ___FCHModel.addElement(pol); // this itterates through the arrayList and puts the names into model
                                         // argument
        }

        DataModel(__FCHList, ___FCHModel);

        ////////////////////////////////////////////////////////////////////////////////////////
        for (int i = 0; i < City.getKidAmount(); i++) {
            AddString = "" + City.getKid(i).toString() + "\n";
            _Kid.add(AddString);

        }

        ___KidModel.addElement("Kid Information");
        for (String info : _Kid) {
            ___KidModel.addElement(info); // this itterates through the arrayList and puts the names into model
                                          // argument
        }

        DataModel(__KidList, ___KidModel);

        for (int i = 0; i < City.getPolAmount(); i++) {
            AddString = "" + City.getPol(i).toString();
            _Police.add(AddString);
        }

        ___PoliceModel.addElement("Police Information");
        for (String info : _Police) {
            ___PoliceModel.addElement(info); // this itterates through the arrayList and puts the names into model
                                             // argument
        }

        DataModel(__PoliceList, ___PoliceModel);

        for (int i = 0; i < City.getTeachAmount(); i++) {
            AddString = "" + City.getTeach(i).toString();
            _Teacher.add(AddString);
        }

        ___TeacherModel.addElement("Teacher Information");
        for (String info : _Teacher) {
            ___TeacherModel.addElement(info); // this itterates through the arrayList and puts the names into model
            // argument
        }

        DataModel(__TeacherList, ___TeacherModel);

        ///////////////////////////////////////////////////////////////////////////////////////

    }

    /**
     * @param JL
     * @param DML this sets up the the lists that I make so that they can all be
     *            formatted the same way
     */
    public void DataModel(JList<String> JL, DefaultListModel<String> DML) {

        JL.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // this allows the user to pick
        JL.setModel(DML);
        JL.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        JL.setAlignmentX(FlowLayout.LEFT);
        JL.setLayoutOrientation(JList.VERTICAL);

    }

    /**
     * @param name
     * @return JList<String> This is used so that the program can detect what button
     *         is being used and to set it to the correct model and list respectivly
     */
    public JList<String> NameLinkingList(String name) {
        JList<String> ReturningInfo = new JList<String>();
        switch (name) {
            case "Adams":
                ReturningInfo = __AdamsList;
                break;
            case "Arlington":
                ReturningInfo = __ArlingtonList;
                break;
            case "Chase":
                ReturningInfo = __ChaseList;
                break;
            case "Garry":
                ReturningInfo = __GarryList;
                break;
            case "Ferris":
                ReturningInfo = __FerrisList;
                break;
            case "Lewis & Clark":
                ReturningInfo = __Lewis_Clark_List;
                break;
            case "Spokane CH":
                ReturningInfo = __SCHList;
                break;
            case "Dowtown CH":
                ReturningInfo = __DCHList;
                break;
            case "Fun Ch":
                ReturningInfo = __FCHList;
                break;
            case "Apple Hills CH":
                ReturningInfo = __AHCHList;
                break;

        }
        return ReturningInfo;
    }

    /**
     * @param name
     * @return DefaultListModel<String>
     */
    public DefaultListModel<String> NameLinkingListModel(String name) {
        DefaultListModel<String> ReturningInfo = new DefaultListModel<String>();
        switch (name) {
            case "Adams":
                ReturningInfo = ___AdamsModel;
                break;
            case "Arlington":
                ReturningInfo = ___ArlingtonModel;
                break;
            case "Chase":
                ReturningInfo = ___ChaseModel;
                break;
            case "Garry":
                ReturningInfo = ___GarryModel;
                break;
            case "Ferris":
                ReturningInfo = ___FerrisModel;
                break;
            case "Lewis & Clark":
                ReturningInfo = ___Lewis_Clark_Model;
                break;
            case "Spokane CH":
                ReturningInfo = ___SCHModel;
                break;
            case "Dowtown CH":
                ReturningInfo = ___DCHModel;
                break;
            case "Fun Ch":
                ReturningInfo = ___FCHModel;
                break;
            case "Apple Hills CH":
                ReturningInfo = ___AHCHModel;
                break;
        }
        return ReturningInfo;
    }

}
