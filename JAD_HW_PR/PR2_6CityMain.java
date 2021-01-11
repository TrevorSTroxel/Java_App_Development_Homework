
/**
 * @author Trevor Troxel
 * @version 1.0
 */
//Reference: https://stackoverflow.com/questions/4574713/generate-random-number-with-restrictions

import java.text.DecimalFormat;
import java.lang.Math; //used to randomize selection everytime
import java.util.*;

public class PR2_6CityMain {

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
     * @param args
     */
    // Return functions

    public static void main(String[] args) {

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

        for (int i = 0; i < 100; i++) {
            Kid.add(new PR2_2Kid(randName(), randAge(), randPN(), randCandy()));
            Teacher.add(new PR2_2Teacher(randName(), randAge(), randPN(), randTeachGrade(), randEduLvl()));

            // I need 4 different objects because i can not randomize enum
            int choice = (int) Math.random() * 4 + 1;
            switch (choice) {
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
        // System.out.println("");
        System.out.println("What would you like to do?");
        System.out.println("1. See the names of all the people");
        System.out.println("2. See all the names of the buildings");
        System.out.println(
                "3. See what teachers and kids are in what school and what police officers are in what building");
        System.out.println("4. Pay employees");
        Scanner UserChoice = new Scanner(System.in);
        int choice = UserChoice.nextInt();

        switch (choice) {
            case 1:
                System.out.println(
                        "Here is a list of names of all the people. In order it lists kids, then teachers, then police");
                for (int i = 0; i < 100; i++) {
                    System.out.println("Kids Name: " + Kid.get(i).getName() + "\n");
                }
                for (int i = 0; i < 100; i++) {
                    System.out.println("teachers Name: " + Teacher.get(i).getName() + "\n");
                }
                for (int i = 0; i < 100; i++) {
                    System.out.println("Police Name: " + Police.get(i).getName() + "\n");
                }
                break;

            case 2:
                for (int i = 0; i < 100; i++) {
                    System.out.println("City Hall name: " + City_Hall.get(i).getBuildingName() + ", Address: "
                            + City_Hall.get(i).getAddress() + "\n");
                }
                for (int i = 0; i < 100; i++) {
                    System.out.println("School name: " + School.get(i).getBuildingName() + ", Address: "
                            + School.get(i).getAddress() + "\n");
                }
                break;

            case 3:
                int i = 1;
                switch (i) {
                    case 1:
                        for (int q = 0; q < 100; q++) {
                            if (q % 2 == 0) {
                                System.out.println("Adams teachers are: " + Adams.get(q).getNewName());
                            } else if (q % 2 == 1) {
                                System.out.println("Adams kids are: " + Adams.get(q).getNewName());
                            }
                        }

                        for (int q = 0; q < 100; q++) {
                            if (q % 2 == 0) {
                                System.out.println("Arlington teachers are: " + Arlington.get(q).getNewName());
                            } else if (q % 2 == 1) {
                                System.out.println("Arlington kids are: " + Arlington.get(q).getNewName());
                            }
                        }

                        for (int q = 0; q < 100; q++) {
                            if (q % 2 == 0) {
                                System.out.println("Chase teachers are: " + Chase.get(q).getNewName());
                            } else if (q % 2 == 1) {
                                System.out.println("Chase kids are: " + Chase.get(q).getNewName());
                            }
                        }

                        for (int q = 0; q < 100; q++) {
                            if (q % 2 == 0) {
                                System.out.println("Garry teachers are: " + Garry.get(q).getNewName());
                            } else if (q % 2 == 1) {
                                System.out.println("Garry kids are: " + Garry.get(q).getNewName());
                            }
                        }

                        for (int q = 0; q < 100; q++) {
                            if (q % 2 == 0) {
                                System.out.println("Lewis & Clark teachers are: " + Lewis_Clark.get(q).getNewName());
                            } else if (q % 2 == 1) {
                                System.out.println("Lewis & Clark kids are: " + Lewis_Clark.get(q).getNewName());
                            }
                        }

                        for (int q = 0; q < 100; q++) {
                            if (q % 2 == 0) {
                                System.out.println("Ferris teachers are: " + Ferris.get(q).getNewName());
                            } else if (q % 2 == 1) {
                                System.out.println("Ferris kids are: " + Ferris.get(q).getNewName());
                            }
                        }

                    case 2:
                        for (int I = 0; i < 100; i++) {
                            System.out
                                    .println("Spokane City Hall has these police officers: " + SCH.get(I).getNewName());
                            System.out.println(
                                    "Airway Heights City Hall has these police officers: " + AHCH.get(I).getNewName());
                            System.out.println(
                                    "Davenport City Hall has these police officers: " + DCH.get(I).getNewName());
                            System.out.println(
                                    "Farmington City Hall has these police officers: " + FCH.get(I).getNewName());
                        }
                }
                break;
            case 4:
                System.out.println("You have paid each employee");
                break;
            default:
                System.out.println("You have anincorrect choice, try again");
                break;
        }
        UserChoice.close();
    }
}
