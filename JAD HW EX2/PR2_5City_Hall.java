
/**
 * @author Trevor Troxel
 * @version 1.0
 */
import java.util.*;

public class PR2_5City_Hall extends PR2_4Buildings {
    List<String> _PoliceNames = new ArrayList<>();
    List<String> _CHNames = new ArrayList<>();
    List<String> _BuildingAdresses = new ArrayList<>();

    // different lists for different buildings
    String PoliceName;

    public PR2_5City_Hall(String BN, String address, String Police) {
        setBuildingName(BN);
        _CHNames.add(BN);
        setAddress(address);
        _BuildingAdresses.add(address);
        _PoliceNames.add(Police);

    }

    
    /** 
     * @return String
     */
    public String getPoliceNames() {
        return this.PoliceName;
    }

    
    /** 
     * @param Police
     */
    public void setPoliceName(String Police) {
        this.PoliceName = Police;
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return super.toString() + ", " + "Names of police inside " + getBuildingName() + ": " + getPoliceNames() + "\n";
    }
}
