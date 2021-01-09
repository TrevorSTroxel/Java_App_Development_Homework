
/**
 * @author Trevor Troxel
 * @version 1.0
 */

class PR2_4Buildings {

    String BuildingName;
    String Address;

    //////////////////////////////////////////////////////////////////////////////////////////
    public String getBuildingName() {
        return BuildingName;
    }

    public void setBuildingName(String buildingName) {
        BuildingName = buildingName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String toString() {
        return "Street Adress: " + getAddress() + ", " + "Building name: " + getBuildingName();
    }
    //////////////////////////////////////////////////////////////////////////////////////////
}
