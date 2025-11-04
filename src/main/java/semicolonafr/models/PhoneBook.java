package main.java.semicolonafr.models;

import main.java.semicolonafr.exceptions.AlphabetException;
import main.java.semicolonafr.exceptions.DigitsException;

import java.util.ArrayList;

public class PhoneBook {
    private ArrayList<Contact> contacts;

    public PhoneBook() {
        this.contacts = new ArrayList<>();
    }

    public String addContact(String name, String phoneNumber) {
        if (!name.matches("^[A-Za-z]+$")) {
            throw new AlphabetException("Contact name should be in alphabets");
        }

        if (!phoneNumber.matches("^[0-9]+$")) {
            throw new DigitsException("Phone number should contain only digits");
        }

        this.contacts.add(new Contact(name, phoneNumber));
        return "You have successfully added a contact";
    }

    public String removeContact(String name, String phoneNumber) {
        for (int index = 0; index < contacts.size(); index++) {
            Contact contact = contacts.get(index);
            if (contact.getName().equalsIgnoreCase(name)
                    && contact.getPhoneNumber().equals(phoneNumber)) {
                contacts.remove(index);
                return "You have successfully removed a contact";
            }
        }
        return "Contact can not be  found";
    }


    public String searchContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return contact.getName();
            }
        }
        return name + "not found";
    }



}






