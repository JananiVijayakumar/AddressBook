package com.bridgelabz;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class AddressBookFileIO {
        public void writeDataToAddressBook(ArrayList<AddressBookData> addressBook) {
            StringBuffer addressBookBuffer = new StringBuffer();
            addressBook.forEach(person -> {
                String dataString = person.toString().concat("\n");
                addressBookBuffer.append(dataString);
            });
            try {
                Files.write(Paths.get("AddressBook.txt"), addressBookBuffer.toString().getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public List<AddressBookData> readDataFromAddressBook() {
            List<AddressBookData> addressBookList = new ArrayList<>();
            try {
                Files.lines(new File("AddressBook.txt").toPath()).map(line -> line.trim()).forEach(line -> System.out.println(line));
            } catch (IOException e) {
                e.printStackTrace();
            }
            return addressBookList;
        }
    }
