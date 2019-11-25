public class Address {

    private String streetName;
    private int doorNo;
    private String postalCode;

    public Address(String streetName , int doorNo , String postalCode) {
        this.streetName = streetName;
        this.doorNo = doorNo;
        this.postalCode = postalCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(int doorNo) {
        this.doorNo = doorNo;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
