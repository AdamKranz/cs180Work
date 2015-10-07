/**
 * Created by akranz on 10/7/15.
 */
public class Contact {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String name;
    private long phoneNumber;
    private String address;

    public Contact(String name) {
        this.name = name;
    }

    public Contact(String name, long phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Contact(String name, long phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    boolean equals(Contact c) {
        return this.getAddress() == c.getAddress() && this.getName() == c.getName() && this.getPhoneNumber() == c.getPhoneNumber();

    }


}
