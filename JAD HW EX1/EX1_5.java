import java.util.Scanner;
import java.util.ArrayList; //This better than an array because this a dynamic size, so you can put as much in a list as you can
//this is a collection of frameworks, classes related to date and time, event modeling, and other misc utility classes
import java.util.*; //reference: https://www.geeksforgeeks.org/list-interface-java-examples/
//reference:https://www.geeksforgeeks.org/file-getname-method-in-java-with-examples/

class Employee {
    private String EmployeeID;
    private String EmployeeName;
    private String EmployeeHireDate;
    private String EmployeeCurrentPosition;
    private String EmployeeSuperior;

    public Employee(String EmployeeID, String EmployeeName, String EmployeeHireDate, String EmployeeCurrentPosition,
            String EmployeeSuperior) {
        this.EmployeeID = EmployeeID;
        this.EmployeeName = EmployeeName;
        this.EmployeeHireDate = EmployeeHireDate;
        this.EmployeeCurrentPosition = EmployeeCurrentPosition;
        this.EmployeeSuperior = EmployeeSuperior;
    }

    
    /** 
     * @return String
     */
    public String getID() {
        return EmployeeID;
    }

    
    /** 
     * @return String
     */
    public String getName() {
        return EmployeeName;
    }

    
    /** 
     * @return String
     */
    public String getHire() {
        return EmployeeHireDate;
    }

    
    /** 
     * @return String
     */
    public String getPosition() {
        return EmployeeCurrentPosition;
    }

    
    /** 
     * @return String
     */
    public String getBoss() {
        return EmployeeSuperior;
    }

    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        String EmployeeID;
        String EmployeeName;
        String EmployeeHireDate;
        String EmployeeCurrentPosition;
        String EmployeeSuperior;
        // All the variables will be stored inside these lists, so that they may be
        // accessed later
        List<String> ID = new ArrayList<>();
        List<String> Name = new ArrayList<>();
        List<String> Hire_Date = new ArrayList<>();
        List<String> Current_position = new ArrayList<>();
        List<String> Superior = new ArrayList<>();

        do {
            int choice;
            System.out.println("What is your Employee ID number?");
            Scanner UserID = new Scanner(System.in);
            EmployeeID = UserID.nextLine();
            ID.add(EmployeeID);

            System.out.println("What is your name?");
            Scanner UserName = new Scanner(System.in);
            EmployeeName = UserName.nextLine();
            Name.add(EmployeeName);

            System.out.println("When were you hired?");
            Scanner UserHireDate = new Scanner(System.in);
            EmployeeHireDate = UserHireDate.nextLine();
            Hire_Date.add(EmployeeHireDate);

            System.out.println("What is your current position?");
            Scanner UserPosition = new Scanner(System.in);
            EmployeeCurrentPosition = UserPosition.nextLine();
            Current_position.add(EmployeeCurrentPosition);

            System.out.println("Who do you report to?");
            Scanner UserBoss = new Scanner(System.in);
            EmployeeSuperior = UserBoss.nextLine();
            Superior.add(EmployeeSuperior);

            System.out.println("What would you like to do now? Enter a number to continue");
            System.out.println("1. Enter new Employee");
            System.out.println("2. Access a List");
            System.out.println("3. Exit program");
            Scanner UserChoice = new Scanner(System.in);
            choice = UserChoice.nextInt();
            switch (choice) {
                // this loops back to the start of the do-while loop to start all over
                case 1:
                    break;// left blank on purpose to make the program loop again
                case 2:
                    // Displays all the stored information that was put into the lists
                    System.out.println("Displaying all Employees");
                    for (int i = 0; i < ID.size(); i++) { // I chose Id.size abertarally, it wont make a difference as
                                                          // they
                                                          // are all going to be the same size
                        String IDName = ID.get(i);
                        System.out.println(IDName);
                        String EName = Name.get(i);
                        System.out.println(EName);
                        String Date = Hire_Date.get(i);
                        System.out.println(Date);
                        String Position = Current_position.get(i);
                        System.out.println(Position);
                        String Boss = Superior.get(i);
                        System.out.println(Boss);
                    }
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("You did not give an valid answer, ending program");
                    System.exit(0);
            }
        } while (true);
    }
}
