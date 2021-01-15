
/**
 * @author Trevor Troxel
 * @version 1.0
 */

public class PR2_2Police extends PR2_1Person implements PR2_3Employee {

    // Created a new file that clean. All the old code is lost
    public enum Status { // These mark the different ranks of the police
        PATROL, SARGENT, CAPTAIN, CHIEF
    }

    Status _role;

    int bankRoll;
    int ID;

    public PR2_2Police(String name, int age, String PN, Status role) {
        setName(name);
        setAge(age);
        setPN(PN);
        _role = role;
    }

    /**
     * @param _role
     */
    public void setRole(Status _role) {
        this._role = _role;
    }

    /**
     * @return Status
     */
    public Status getRole() {
        return _role;
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        return super.toString() + ", " + "Role in police: " + _role + "\n";
    }

    @Override
    public void PayRollMethod() {
        bankRoll = 25;
    }

    @Override
    public void EmployeeIDAsk() {
        ID = 12345;

    }
}
