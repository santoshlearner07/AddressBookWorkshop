package com.company;

public class Contacts {
    String FirstName;
    String LastName;
    String Address;
    String City;
    int ZIP;
    long PhoneNumber;
    String eMail;

    private Contacts(String firstName, String lastName, String address, String city, int ZIP, long phoneNumber, String eMail) {
        FirstName = firstName;
        LastName = lastName;
        Address = address;
        City = city;
        this.ZIP = ZIP;
        PhoneNumber = phoneNumber;
        this.eMail = eMail;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public int getZIP() {
        return ZIP;
    }

    public void setZIP(int ZIP) {
        this.ZIP = ZIP;
    }

    public long getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public Contacts() {

    }
}