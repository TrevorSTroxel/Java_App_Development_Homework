
/**
 * @author Trevor Troxel
 * @version 1.0
 */

class PR2_4Buildings {

    String BuildingName;
    String Address;

    
    /** 
     * @return String
     */
    //////////////////////////////////////////////////////////////////////////////////////////
    public String getBuildingName() {
        return BuildingName;
    }

    
    /** 
     * @param buildingName
     */
    public void setBuildingName(String buildingName) {
        BuildingName = buildingName;
    }

    
    /** 
     * @return String
     */
    public String getAddress() {
        return Address;
    }

    
    /** 
     * @param address
     */
    public void setAddress(String address) {
        Address = address;
    }

    
    /** 
     * @return String
     */
    public String toString() {
        return "Street Adress: " + getAddress() + ", " + "Building name: " + getBuildingName();
    }
    //////////////////////////////////////////////////////////////////////////////////////////
}
