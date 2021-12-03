package com.bridgelabz;

public class AddressBookData {
    public String bookName;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String eMail;
    private int zipCode;
    private long mobileNumber;

    public AddressBookData(){};
    public AddressBookData(String bookName, String firstName, String lastName, String address, String city,String state , String email, int zipCode, long mobileNumber) {
        this.bookName = bookName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.eMail = eMail;
        this.zipCode = zipCode;
        this.mobileNumber = mobileNumber;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "AddressBookBluePrint{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", eMail='" + eMail + '\'' +
                ", zip=" + zipCode +
                ", mobileNumber=" + mobileNumber +
                '}';
    }
}
