package com.bridgelabz;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook program");
        AddressBook addressBook = new AddressBook();
        addressBook.takeOption();
        boolean condition = true;
        while (condition) {
            boolean checkUser = addressBook.takeOption();
            if (checkUser)
                break;
        }
    }
}
