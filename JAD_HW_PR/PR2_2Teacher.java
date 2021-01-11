
/**
 * @author Trevor Troxel
 * @version 1.0
 */

public class PR2_2Teacher extends PR2_1Person implements PR2_3Employee {

    int _TeachingGradeLevel;
    String _CollegeDegree;

    public PR2_2Teacher(String name, int age, String PN, int TeachingGradeLevel, String CollegeDegree) {
        setName(name);
        setAge(age);
        setPN(PN);
        _TeachingGradeLevel = TeachingGradeLevel;
        _CollegeDegree = CollegeDegree;
    }

    int money;
    int ID;

    
    /** 
     * @return String
     */
    public String toString() {
        return super.toString() + ", " + "The grade level that they teach: " + _TeachingGradeLevel + ", "
                + "Their college degree: " + _CollegeDegree + "\n";
    }

    @Override
    public void PayRollMethod() {
        money = 25;

    }

    @Override
    public void EmployeeIDAsk() {
        ID = 67891;
    }

    /*
     * //////////////////////////////////////////////// private EducationLevel
     * TeachingGradeLevel;
     * 
     * public EducationLevel getTGL() { return TeachingGradeLevel; }
     * 
     * public void setTGL(EducationLevel TeachingGradeLevel) {
     * this.TeachingGradeLevel = TeachingGradeLevel; }
     * 
     * /////////////////////////////////////////////////// private EducationLevel
     * CollegeDegree;
     * 
     * public EducationLevel getEL() { return CollegeDegree; }
     * 
     * public void setEL(EducationLevel CollegeDegree) { this.CollegeDegree =
     * CollegeDegree; }
     * 
     * //////////////////////////////////////////////////
     * 
     * @Override public void PayRollMethod() {
     * System.out.println("Adding money to account"); }
     * 
     * @Override public void EmployeeIDAsk() { int EmployeeID;
     * System.out.println("What is your ID?"); Scanner UserID = new
     * Scanner(System.in); EmployeeID = UserID.nextInt(); UserID.close(); }
     */
}