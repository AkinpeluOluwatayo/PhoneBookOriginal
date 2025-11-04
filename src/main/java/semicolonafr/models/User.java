package main.java.semicolonafr.models;

import main.java.semicolonafr.intrafces.PhoneBook;

import java.util.ArrayList;

public class User  implements PhoneBook {
    private String name;
    private String password;
    private ArrayList Contact;

    public User (String name, String password){
        this.name = name;
        this.password = password;
        this.Contact = new ArrayList();

    }
    @Override
    public String addContact(String name, String phoneNumber){
            Contact newContact = new Contact(name, phoneNumber);
            Contact.add(newContact);
            return "You have added " + name + " contact successfully";

    }


    @Override
    public ArrayList removeContact(String name, String  phoneNumber) {
        return null;
    }

    public String showAllContact(String name, String phoneNumber){
        return name;
    }

}
