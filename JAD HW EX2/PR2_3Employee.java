
/**
 * @author Trevor Troxel
 * @version 1.0
 */
// use JFrame and JLabel, look more into it later
// import java.awt.List;
// reference: https://www.geeksforgeeks.org/interfaces-in-java/
// Think about possible having a global I variable that all the List have access
// to so that indexes are filled in the appropiate spot
// scratch that, just have a global variable declard in the individual files
// themselvs so that the indexing is correct

interface PR2_3Employee {
    // These interface methods do not have a body
    // What this can do for us is make it so we can have a blank method to work with
    // for classes
    // We can manipulate it to suit our different purposes.
    // Pay rool needs an argument to know which List to put it into and how much,
    // but for now they will all be paid the same for testing purposes
    public void PayRollMethod(); // adds money into either police or teacher account

    public void EmployeeIDAsk(); // will ask the user for their ID
}
