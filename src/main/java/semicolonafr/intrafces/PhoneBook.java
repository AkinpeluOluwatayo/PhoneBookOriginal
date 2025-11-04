package main.java.semicolonafr.intrafces;

import java.util.ArrayList;

public interface PhoneBook {
    String addContact(String name, String phoneNumber);
    ArrayList removeContact(String name, String  phoneNumber);
}
