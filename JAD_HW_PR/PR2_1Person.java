
/**
 * @author Trevor Troxel
 * @version 1.0
 */

/** */

// This will be my super class (parent) for a lot of my other java files.
// They should be able to grab any methods from here in order
class PR2_1Person {
    // These are the variables the the getters and setter functions use
    String Name;
    int Age;
    String Phone_Number;

    
    /** 
     * @return String
     */
    // possible move the lists into here to store all the information
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public String getName() {
        return Name;
    }

    
    /** 
     * @return int
     */
    public int getAge() {
        return Age;
    }

    
    /** 
     * @return String
     */
    public String getPN() {
        return Phone_Number;
    }

    
    /** 
     * @param Name
     */
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void setName(String Name) {
        this.Name = Name;
    }

    
    /** 
     * @param Age
     */
    public void setAge(int Age) {
        this.Age = Age;
    }

    
    /** 
     * @param Phone_Number
     */
    public void setPN(String Phone_Number) {
        this.Phone_Number = Phone_Number;
    }

    
    /** 
     * @return String
     */
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public String toString() {
        String ret = "Name: " + getName() + ", " + "Age: " + getAge() + ", " + "Phone Number: " + getPN();
        return ret;
    }
}
