/**
 * @author Trevor Troxel
 * @version 1.0
 */
public class PR2_2Kid extends PR2_1Person {

    String _Candy;

    public PR2_2Kid(String name, int age, String PN, String candy) {
        setName(name);
        setAge(age);
        setPN(PN);
        _Candy = candy;
    }

    
    /** 
     * @return String
     */
    public String toString() {
        return super.toString() + ", " + "Favorite Candy: " + _Candy + "\n";
    }

}
