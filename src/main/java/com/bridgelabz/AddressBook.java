package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Author : janani VijayaKumar
 * Date : 01/12/2021
 * Desc : AddressBook Using Stream API
 */

public class AddressBook {
    public ArrayList<AddressBookData> addressBookEntries = new ArrayList<>();
    public Map<String, ArrayList<AddressBookData>> bookDetails = new HashMap<>();
    public Map<String, ArrayList<AddressBookData>> multiAddressBook = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    public void addContactToAddressBook() {
        System.out.println("Enter Address Book Name :");
        String bookName = sc.next();
        System.out.println("Enter your first name :");
        String firstName = sc.next();
        System.out.println("Enter your last name :");
        String lastName = sc.next();
        System.out.println("Enter your Address :");
        String address = sc.next();
        System.out.println("Enter your city name :");
        String city = sc.next();
        System.out.println("Enter your state name :");
        String state = sc.next();
        System.out.println("Enter your email :");
        String eMail = sc.next();
        System.out.println("Enter your zipCode : ");
        int zipCode = sc.nextInt();
        System.out.println("Enter your Mobile number :");
        long mobileNumber = sc.nextLong();
    }

    private void checkAddressBookEntries(String bookName, String firstName, String lastName, String address, String city,String state, String email,  int zipCode, long phoneNumber) {
        AddressBookData addressBookData = new AddressBookData(bookName, firstName, lastName, address,email, city,state ,zipCode, phoneNumber);
        addressBookEntries.add(addressBookData);
        bookDetails.put(firstName, addressBookEntries);
    }

    public void editContactToAddressBook() {
        System.out.println("enter your book name");
        String bookName = sc.next();
        System.out.println("enter your name");
        String name = sc.next();
        ArrayList<AddressBookData> ContactDetails = multiAddressBook.get(bookName);
        for (AddressBookData eachDetails : ContactDetails) {
            if (eachDetails.getFirstName().equals(name)) {
                boolean conditonCheck = true;
                while (conditonCheck) {
                    System.out.println("enter number  1:first_name\n " +
                            "2:last_name\n " +
                            "3:address\n " +
                            "4:city\n " +
                            "5:state\n " +
                            "6:email\n " +
                            "7:zipCode\n " +
                            "8:phone_number\n " +
                            "0:quit");
                    int option = sc.nextInt();
                    switch (option) {
                        case 1:
                            System.out.println("Enter your first name");
                            String firstname = sc.next();
                            eachDetails.setFirstName(firstname);
                            System.out.println(bookDetails);
                            break;
                        case 2:
                            System.out.println("Enter your last name :");
                            String lastname = sc.next();
                            eachDetails.setLastName(lastname);
                            System.out.println(bookDetails);
                            break;
                        case 3:
                            System.out.println("Enter your new address :");
                            String address = sc.next();
                            eachDetails.setAddress(address);
                            System.out.println(bookDetails);
                            break;
                        case 4:
                            System.out.println("Enter your edited city :");
                            String city = sc.next();
                            eachDetails.setCity(city);
                            System.out.println(bookDetails);
                            break;
                        case 5:
                            System.out.println("Enter your edited State :");
                            String state = sc.next();
                            eachDetails.setState(state);
                            System.out.println(bookDetails);
                            break;
                        case 6:
                            System.out.println("Enter your new email :");
                            String email = sc.next();
                            eachDetails.seteMail(email);
                            System.out.println(bookDetails);
                            break;
                        case 7:
                            System.out.println("Enter your new ZipCode :");
                            int zipCode = sc.nextInt();
                            eachDetails.setZipCode(zipCode);
                            System.out.println(bookDetails);
                            break;
                        case 8:
                            System.out.println("Enter your new Phone number :");
                            long mobileNumber = sc.nextLong();
                            eachDetails.setMobileNumber(mobileNumber);
                            System.out.println(bookDetails);
                            break;

                        case 0:
                            conditonCheck = false;
                            break;
                        default:
                            System.out.println("invalid input!! \n please enter new input!!");
                    }
                }
            }
        }
    }

    public boolean takeOption() {
        System.out.println("enter 1:add_contact 2:edit_contact or 0 to quit");
        int option = sc.nextInt();
        boolean checkConditon = true;
        switch (option) {
            case 1:
                addContactToAddressBook();
                break;
            case 2:
                editContactToAddressBook();
                break;
            case 0:
                checkConditon = false;
                break;
            default:
                System.out.println("invalid input!! \n please enter new input!!");
        }
        return checkConditon;
    }
}
