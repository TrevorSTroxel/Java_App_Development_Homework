
/**
 * @author Trevor Troxel
 * @version 1.0
 */
import java.util.*;

public class PR2_5School extends PR2_4Buildings {
    List<String> _TeacherNames = new ArrayList<>();
    List<String> _KidsNames = new ArrayList<>();
    List<String> _SchoolNames = new ArrayList<>();
    List<String> _BuildingAdresses = new ArrayList<>();

    // seperate lists for the different schhols

    String TeachersNames, KidsNames;

    public PR2_5School(String BN, String address, String Teacher, String Kids) {
        setBuildingName(BN);
        _SchoolNames.add(BN);
        setAddress(address);
        _BuildingAdresses.add(address);
        setTeachersNames(Teacher);
        _TeacherNames.add(Teacher);
        setKidsNames(Kids);
        _KidsNames.add(Kids);

    }

    /**
     * @return String
     */
    public String getTeachersNames() {
        return this.TeachersNames;
    }

    /**
     * @param Teacher
     */
    public void setTeachersNames(String Teacher) {
        this.TeachersNames = Teacher;
    }

    /**
     * @return String
     */
    public String getKidsNames() {
        return this.KidsNames;
    }

    /**
     * @param Kids
     */
    public void setKidsNames(String Kids) {
        this.KidsNames = Kids;
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        return super.toString() + ", " + "Names of the teachers inside: " + getBuildingName() + ": "
                + getTeachersNames() + ", " + "Names of the students inside " + getBuildingName() + ": "
                + getKidsNames() + "\n";
    }

}
