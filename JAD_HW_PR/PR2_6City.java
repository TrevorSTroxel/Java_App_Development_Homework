
/**
 * @author Trevor Troxel
 * @version 1.0
 */
//Reference: https://stackoverflow.com/questions/4574713/generate-random-number-with-restrictions

import java.text.DecimalFormat;
import java.lang.Math; //used to randomize selection everytime
import java.util.*;

public class PR2_6City {

    /**
     * @return int
     */
    public static int choice() {
        int choice = (int) (Math.random() * 4) + 1;
        return choice;
    }

    /**
     * @return String
     */
    public static String randName() {
        String[] name = { "Bob", "Jim", "Jill", "Mary" }; // this will make random names for all the residents
        return name[(int) ((Math.random() * 4))];
    }

    /**
     * @return int
     */
    public static int randAge() {
        return (int) ((Math.random() * 100) + 1);
    }

    /**
     * @return String
     */
    public static String randPN() {
        int PhoneMin = 999, PhoneMax = 9999; // get random phone numbers
        DecimalFormat First = new DecimalFormat("000"); // makes the first part of the phone number into 3 decimal
        DecimalFormat Second = new DecimalFormat("0000");
        String FirstPart = First.format((int) ((Math.random() * PhoneMin))); // 3 digit format
        String SecondPart = Second.format((Math.random() * PhoneMax)); // 4 digit format
        return FirstPart + "-" + SecondPart; // This creates a random phone number
    }

    /**
     * @return String
     */
    public static String randCandy() {
        String[] Candy = { "Butterfingers", "Milkyway", "M&M's", "Candy Corn" }; // random candy
        return Candy[(int) ((Math.random() * 4))];
    }

    /**
     * @return int
     */
    public static int randTeachGrade() {
        int TeachingMin = 1, TeachingMax = 16; // what grade level are they teaching.
        return (int) ((Math.random() * TeachingMax) + TeachingMin);
    }

    /**
     * @return String
     */
    public static String randEduLvl() {
        String[] EL = { "A.D.", "B.D.", "M.D.", "Doctors" };
        return EL[(int) ((Math.random() * 4))];
    }

    /**
     * @return String
     */
    public static String randCityHall() {
        String[] CH = { "Spokane City Hall", "Airway Heights City Hall", "Davenport City Hall",
                "Farmington City Hall" };
        return CH[(int) ((Math.random() * 4))];
    }

    /**
     * @return String
     */
    public static String randStreetAdress() {
        DecimalFormat Numbers = new DecimalFormat("0000");
        String numberStreet = Numbers.format((Math.random() * 999));
        String[] type = { "St.", "Ave.", "Rd.", "Ct.", "Way" };
        String[] streetNames = { "Campbell", "Horton", "Lawson", "Craig", "Hayford" };
        return numberStreet + " " + " " + streetNames[(int) ((Math.random() * 4))] + type[(int) ((Math.random() * 5))];
    }

    /**
     * @return String
     */
    public static String randSchoolName() {
        String[] SN = { "Adams", "Arlington", "Chase", "Garry", "Ferris", "Lewis & Clark" };
        return SN[(int) ((Math.random() * 6))];
    }

    /**
     * @param i
     * @return PR2_2Kid
     */
    //////////////////////////////////////////////////////////////////////////////////////////
    // return functions for each array
    public PR2_2Kid getKid(int i) {
        if (i >= 0 && i < Kid.size())
            return Kid.get(i);
        else
            return null;
    }

    /**
     * @return int
     */
    public int getKidAmount() {
        return Kid.size();
    }

    /**
     * @param i
     * @return PR2_2Police
     */
    public PR2_2Police getPol(int i) {
        if (i >= 0 && i < Police.size())
            return Police.get(i);
        else
            return null;
    }

    /**
     * @return int
     */
    public int getPolAmount() {
        return Police.size();
    }

    /**
     * @param i
     * @return PR2_2Teacher
     */
    public PR2_2Teacher getTeach(int i) {
        if (i >= 0 && i < Teacher.size())
            return Teacher.get(i);
        else
            return null;
    }

    /**
     * @return int
     */
    public int getTeachAmount() {
        return Teacher.size();
    }

    /**
     * @param i
     * @return PR2_5City_Hall
     */
    public PR2_5City_Hall getCH(int i) {
        if (i >= 0 && i < City_Hall.size())
            return City_Hall.get(i);
        else
            return null;
    }

    /**
     * @return int
     */
    public int getCHAmount() {
        return City_Hall.size();
    }

    /**
     * @param i
     * @return PR2_5School
     */
    public PR2_5School getSchool(int i) {
        if (i >= 0 && i < School.size())
            return School.get(i);
        else
            return null;
    }

    /**
     * @return int
     */
    public int getSHAmountt() {

        return School.size();
    }

    /**
     * @param i
     * @return CH_SH
     */
    public CH_SH getAdams(int i) {
        if (i >= 0 && i < Adams.size())
            return Adams.get(i);
        else
            return null;
    }

    /**
     * @return int
     */
    public int getAdamsSize() {
        return Adams.size();
    }

    /**
     * @param i
     * @return CH_SH
     */
    public CH_SH getArlington(int i) {
        if (i >= 0 && i < Arlington.size())
            return Arlington.get(i);
        else
            return null;
    }

    /**
     * @return int
     */
    public int getArlingtonsize() {
        return Arlington.size();
    }

    /**
     * @param i
     * @return CH_SH
     */
    public CH_SH getGarry(int i) {
        if (i >= 0 && i < Garry.size())
            return Garry.get(i);
        else
            return null;
    }

    /**
     * @return int
     */
    public int getGarrysize() {
        return Garry.size();
    }

    /**
     * @param i
     * @return CH_SH
     */
    public CH_SH getFerris(int i) {
        if (i >= 0 && i < Ferris.size())
            return Ferris.get(i);
        else
            return null;
    }

    /**
     * @return int
     */
    public int getFerrissize() {
        return Ferris.size();
    }

    /**
     * @param i
     * @return CH_SH
     */
    public CH_SH getChase(int i) {
        if (i >= 0 && i < Chase.size())
            return Chase.get(i);
        else
            return null;
    }

    /**
     * @return int
     */
    public int getChasesize() {
        return Chase.size();
    }

    /**
     * @param i
     * @return CH_SH
     */
    public CH_SH getLewis_Clark(int i) {
        if (i >= 0 && i < Lewis_Clark.size())
            return Lewis_Clark.get(i);
        else
            return null;
    }

    /**
     * @return int
     */
    public int getLewis_Clarksize() {
        return Lewis_Clark.size();
    }

    /**
     * @param i
     * @return CH_SH
     */
    public CH_SH getSCH(int i) {
        if (i >= 0 && i < SCH.size())
            return SCH.get(i);
        else
            return null;
    }

    /**
     * @return int
     */
    public int getSCHsize() {
        return SCH.size();
    }

    /**
     * @param i
     * @return CH_SH
     */
    public CH_SH getAHCH(int i) {
        if (i >= 0 && i < AHCH.size())
            return AHCH.get(i);
        else
            return null;
    }

    /**
     * @return int
     */
    public int getAHCHsize() {
        return AHCH.size();
    }

    /**
     * @param i
     * @return CH_SH
     */
    public CH_SH getDCH(int i) {
        if (i >= 0 && i < DCH.size())
            return DCH.get(i);
        else
            return null;
    }

    /**
     * @return int
     */
    public int getDCHsize() {
        return DCH.size();
    }

    /**
     * @param i
     * @return CH_SH
     */
    public CH_SH getFCH(int i) {
        if (i >= 0 && i < FCH.size())
            return FCH.get(i);
        else
            return null;
    }

    /**
     * @return int
     */
    public int getFCHsize() {
        return FCH.size();
    }

    ////////////////////////////////////////////////////////////////////////////////
    ArrayList<PR2_2Kid> Kid = new ArrayList<PR2_2Kid>();
    ArrayList<PR2_2Police> Police = new ArrayList<PR2_2Police>();
    ArrayList<PR2_2Teacher> Teacher = new ArrayList<PR2_2Teacher>();
    ArrayList<PR2_5City_Hall> City_Hall = new ArrayList<PR2_5City_Hall>();
    ArrayList<PR2_5School> School = new ArrayList<PR2_5School>();

    ///////////////////////////////////////////////////////////////////////////////
    // School List
    List<CH_SH> Adams = new ArrayList<>();
    List<CH_SH> Arlington = new ArrayList<>();
    List<CH_SH> Chase = new ArrayList<>();
    List<CH_SH> Garry = new ArrayList<>();
    List<CH_SH> Ferris = new ArrayList<>();
    List<CH_SH> Lewis_Clark = new ArrayList<>();
    ///////////////////////////////////////////////////////////////////////////////
    // City hall lists
    List<CH_SH> SCH = new ArrayList<>();
    List<CH_SH> AHCH = new ArrayList<>();
    List<CH_SH> DCH = new ArrayList<>();
    List<CH_SH> FCH = new ArrayList<>();
    //////////////////////////////////////////////////////////////////////////////

    /**
     * @param args
     */
    // Return functions

    public PR2_6City() {
        for (int i = 0; i < 100; i++) {
            Kid.add(new PR2_2Kid(randName(), randAge(), randPN(), randCandy()));
            Teacher.add(new PR2_2Teacher(randName(), randAge(), randPN(), randTeachGrade(), randEduLvl()));

            // I need 4 different objects because i can not randomize enum
            switch (choice()) {
                case 1:
                    Police.add(new PR2_2Police(randName(), randAge(), randPN(), PR2_2Police.Status.PATROL));
                    break;
                case 2:
                    Police.add(new PR2_2Police(randName(), randAge(), randPN(), PR2_2Police.Status.SARGENT));
                    break;
                case 3:
                    Police.add(new PR2_2Police(randName(), randAge(), randPN(), PR2_2Police.Status.CAPTAIN));
                    break;
                case 4:
                    Police.add(new PR2_2Police(randName(), randAge(), randPN(), PR2_2Police.Status.CHIEF));
                    break;
            }
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            switch (randCityHall()) {
                case "Spokane City Hall":
                    City_Hall.add(new PR2_5City_Hall("Spokane City Hall", randStreetAdress(), Police.get(i).getName()));
                    SCH.add((new CH_SH(Police.get(i).getName())));
                    break;
                case "Airway Heights City Hall":
                    City_Hall.add(new PR2_5City_Hall("Airway Heights City Hall", randStreetAdress(),
                            Police.get(i).getName()));
                    AHCH.add((new CH_SH(Police.get(i).getName())));
                    break;
                case "Davenport City Hall":
                    City_Hall.add(
                            new PR2_5City_Hall("Davenport City Hall", randStreetAdress(), Police.get(i).getName()));
                    DCH.add((new CH_SH(Police.get(i).getName())));
                    break;
                case "Farmington City Hall":
                    City_Hall.add(
                            new PR2_5City_Hall("Farmington City Hall", randStreetAdress(), Police.get(i).getName()));
                    FCH.add((new CH_SH(Police.get(i).getName())));
                    break;
            }

            switch (randSchoolName()) {
                case "Adams":
                    School.add(new PR2_5School("Adams", randStreetAdress(), Teacher.get(i).getName(),
                            Kid.get(i).getName()));
                    Adams.add(new CH_SH(Teacher.get(i).getName()));
                    Adams.add(new CH_SH(Kid.get(i).getName()));
                    break;
                case "Arlington":
                    School.add(new PR2_5School("Arlington", randStreetAdress(), Teacher.get(i).getName(),
                            Kid.get(i).getName()));
                    Arlington.add(new CH_SH(Teacher.get(i).getName()));
                    Arlington.add(new CH_SH(Kid.get(i).getName()));
                    break;
                case "Chase":
                    School.add(new PR2_5School("Chase", randStreetAdress(), Teacher.get(i).getName(),
                            Kid.get(i).getName()));
                    Chase.add(new CH_SH(Teacher.get(i).getName()));
                    Chase.add(new CH_SH(Kid.get(i).getName()));
                    break;
                case "Garry":
                    School.add(new PR2_5School("Garry", randStreetAdress(), Teacher.get(i).getName(),
                            Kid.get(i).getName()));
                    Garry.add(new CH_SH(Teacher.get(i).getName()));
                    Garry.add(new CH_SH(Kid.get(i).getName()));
                    break;
                case "Ferris":
                    School.add(new PR2_5School("Ferris", randStreetAdress(), Teacher.get(i).getName(),
                            Kid.get(i).getName()));
                    Ferris.add(new CH_SH(Teacher.get(i).getName()));
                    Ferris.add(new CH_SH(Kid.get(i).getName()));
                    break;
                case "Lewis & Clark":
                    School.add(new PR2_5School("Lewis & Clark", randStreetAdress(), Teacher.get(i).getName(),
                            Kid.get(i).getName()));
                    Lewis_Clark.add(new CH_SH(Teacher.get(i).getName()));
                    Lewis_Clark.add(new CH_SH(Kid.get(i).getName()));
                    break;
            }

        }
    }
}
