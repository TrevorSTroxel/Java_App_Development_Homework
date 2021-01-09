
/**
 * @author Trevor Troxel
 * @version 1.0
 */

/*
 * inheratence: creates
 */

// This will be my super class (parent) for a lot of my other java files.
// They should be able to grab any methods from here in order
class PR2_1Person {
    // These are the variables the the getters and setter functions use
    String Name;
    int Age;
    String Phone_Number;

    // possible move the lists into here to store all the information
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public String getPN() {
        return Phone_Number;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public void setPN(String Phone_Number) {
        this.Phone_Number = Phone_Number;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public String toString() {
        String ret = "Name: " + getName() + ", " + "Age: " + getAge() + ", " + "Phone Number: " + getPN();
        return ret;
    }
}
